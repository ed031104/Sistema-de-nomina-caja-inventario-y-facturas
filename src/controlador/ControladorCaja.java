
package controlador;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Clientes;
import modelo.FicheroCaja;
import modelo.FicheroCliente;
import modelo.FicheroProducto;
import modelo.Producto;
import vista.Caja;

public class ControladorCaja implements ActionListener{

    Caja vista;
    ControladorRecibo ControladorRecibo;
    FicheroProducto ficheroProducto ;
    FicheroCliente ficheroCliente ;
    FicheroCaja ficehroCaja;
    
    DefaultListModel<Producto> productosModelo = new DefaultListModel<>();
        
    
    ControladorCaja(Caja vista, ControladorRecibo ControladorRecibo, FicheroProducto ficheroProducto, FicheroCliente ficheroCliente, FicheroCaja ficehroCaja) throws IOException {
        this.ControladorRecibo = ControladorRecibo;
        this.vista = vista;
        this.ficheroCliente = ficheroCliente;
        this.ficheroProducto = ficheroProducto;
        this.ficehroCaja = ficehroCaja;
        vista.btnAgregarProducto.addActionListener(this);
        vista.btnCompra.addActionListener(this);
        vista.btnEliminarProducto.addActionListener(this);
        vista.btnVaciarProductos.addActionListener(this);
        
        ficheroProducto.llenarTabla(vista.tablaProductos);
        vista.jcbClientes.setModel(ficheroCliente.llenarComboBox());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //evento de btnCompra
    if(e.getSource() == vista.btnCompra){
       
        if(!vista.fecha.equals("")){
           double montoPagar = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a pagar"));
            
            //se condiciona que si lo que se va a pagar es mayor al precio total se cumpla.
           if(montoPagar >= calculoTotal()){
               
            //se hace la operacion para ver cuanto dinero se tiene que regresar
            double vuelto = montoPagar - calculoTotal();
            
            
            try {
                //se recorre toda la lista de productos que se agregaron al Jlist
                for(int i=0 ; i < RestanteProductos().size(); i++){
                    //cargamos lo productos en un nuevo objeto de producto
                    Producto producto = RestanteProductos().get(i);
                    producto.estadoProducto(producto);
                    
                    //se editan los productos con los productos registrados para que disminuya la cantidad.
                    ficheroProducto.EditarProducto(producto);
                    //se muestran los productos actualizados en la tablaProductos
                    ficheroProducto.llenarTabla(vista.tablaProductos);
                }
            
            
            //se imprime el mensaje
            JOptionPane.showMessageDialog(null, "Gracias por su compra \n Su vuelto es:" +vuelto +" C$");
            
            Random random = new Random();
            int num = random.nextInt((1000000 - 1000) + 1) + 1000;
            String fecha = extraerFecha(vista.fecha);
            //se instancia una nueva clase caja y se carga con los datos recientemente obtenidos.
            modelo.Caja caja = new modelo.Caja(num, fecha, (Clientes) vista.jcbClientes.getSelectedItem(), Double.parseDouble(vista.lblSubTotal.getText()),
            Double.parseDouble(vista.lblTotal.getText()),  vuelto, llenarListaConProductos());
            
            ficehroCaja.Ingresarficheroregistros(caja);
            ControladorRecibo.panelFactura.listaFactura.setModel(ficehroCaja.llenarJlist());
            
            //se vacia la el Jlist de productos.
            productosModelo.clear();
            vista.listaProductos.setModel(productosModelo);
 
            //se devuelven a su valor original el total y el subTotal
            vista.lblTotal.setText("0.00 C$");
            vista.lblSubTotal.setText("0.00 C$");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al editar productos. Consulte el registro para más detalles.");
            }  catch (ParseException ex) {
                   Logger.getLogger(ControladorCaja.class.getName()).log(Level.SEVERE, null, ex);
               }
            
            }else{
            JOptionPane.showMessageDialog(null, "Su monto es insuficiente.");
          }
        }else{
            JOptionPane.showMessageDialog(null, "Falta la fecha.");
        }
    }
    //evento de btnEliminarProducto
    if(e.getSource() == vista.btnEliminarProducto){
        int indiceSeleccionado = vista.listaProductos.getSelectedIndex();

        // Verificar si se seleccionó un elemento antes de intentar eliminar
        if (indiceSeleccionado != -1) {
        // Eliminar el elemento del modelo
        productosModelo.removeElementAt(indiceSeleccionado);

        // Actualizar la vista del JList
        vista.listaProductos.setModel(productosModelo);
        
           vista.lblSubTotal.setText(String.valueOf(calculoTotal()) + " C$");
           vista.lblTotal.setText(String.valueOf(calculoTotal()) + " C$");
        }  
    }
    //evento de btnAgregarProducto
    if(e.getSource() == vista.btnAgregarProducto){
        
        int rowSeleccionado = vista.tablaProductos.getSelectedRow();
        
        if(rowSeleccionado != -1 && rowSeleccionado < vista.tablaProductos.getRowCount()){
                
            int id = (int) vista.tablaProductos.getValueAt(rowSeleccionado, 0);
            String nombre =  (String) vista.tablaProductos.getValueAt(rowSeleccionado, 1);
            String categoria =  (String) vista.tablaProductos.getValueAt(rowSeleccionado, 2);
            double precio = (double) vista.tablaProductos.getValueAt(rowSeleccionado, 3);
            int cantidadVender = (int) vista.cantidadProducto.getValue();
            int cantidad = (int) vista.tablaProductos.getValueAt(rowSeleccionado, 4);
            String estado =  (String) vista.tablaProductos.getValueAt(rowSeleccionado, 5);
                
            if(cantidadVender > 0){
                    
                if(estado.equals("Disponible")){
                    
                    if(cantidadVender <= cantidad){
                            
                     Producto producto = new Producto(id, nombre, categoria, precio, cantidadVender, estado);
                
                     productosModelo.addElement(producto);
                
                     vista.listaProductos.setModel(productosModelo);
                
                     vista.lblSubTotal.setText(String.valueOf(calculoTotal()));
                     vista.lblTotal.setText(String.valueOf(calculoTotal()));
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No hay muchas unidades disponible");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "¡El producto está agotado!");  
                    }
            }else{
                JOptionPane.showMessageDialog(null, "¡Ingresa la cantidad de productos!");
            }  
        }
    }
    //evento de btnVaciasProductos
    if(e.getSource() == vista.btnVaciarProductos){
        productosModelo.clear();
        vista.listaProductos.setModel(productosModelo);

        vista.lblSubTotal.setText(String.valueOf(calculoTotal()) + " C$");
        vista.lblTotal.setText(String.valueOf(calculoTotal()) + " C$");
      }
    }
    
    public double calculoTotal(){
      double total = 0;

      //se recorre todo el modelo del JListProductos, para extraer sus objetos
        for (int i = 0; i < productosModelo.getSize(); i++) {
            //se isntancia un nuevo producto y se carga con los datos del modelo
        Producto producto = productosModelo.getElementAt(i);

        //se obtiene el precio y la cantidad de los productos
        double precio = producto.getPrecio();
        int cantidad = producto.getCantidad();

        //se hace el calculo multiplicando el precio y la cantidad, y que se sumen entre todas las varuables total.
        total += precio * cantidad;
        }
        return total;
    }

    public ArrayList<Producto> llenarListaConProductos(){
     ArrayList<Producto> listaproductos = new ArrayList<>();
     //se recorre el modelo de JlistProductos
            for (int i = 0; i < productosModelo.getSize(); i++) {
                //se carga todos los productos que estaban en el JlistProductos a una nueva instancia de productos
                Producto producto = productosModelo.getElementAt(i); 
                //se agrega al arrayList cada producto del JlistProductos
                listaproductos.add(producto);
            }
            return listaproductos;
    }
    
    public ArrayList<Producto> RestanteProductos() throws IOException {
        
    // Se llena el ArrayList listaProductos con todos los productos que se encuentran en el fichero
    ArrayList<Producto> listaProductos = ficheroProducto.extraerProductosFicheros();
        
    // Se llena el ArrayList listaProductosJList con todos los productos que estén en el JListProductos
    ArrayList<Producto> listaProductosJList = llenarListaConProductos();
    
    // Crear una lista para almacenar los resultados
    ArrayList<Producto> resultados = new ArrayList<>();

    // Iterar sobre ambas listas
    int maxSize = Math.max(listaProductos.size(), listaProductosJList.size());
    for (int i = 0; i < maxSize; i++) {
        
        // Obtener el producto de cada lista, o null si no hay elemento en esa posición
        Producto productoListaProductos = (i < listaProductos.size()) ? listaProductos.get(i) : null;
        Producto productoListaJList = (i < listaProductosJList.size()) ? listaProductosJList.get(i) : null;

        // Verificar si ambos productos no son nulos
        if (productoListaProductos != null && productoListaJList != null) {
            // Restar las cantidades y actualizar la cantidad en productoListaProductos
            int nuevaCantidad = productoListaProductos.getCantidad() - productoListaJList.getCantidad();
            productoListaProductos.setCantidad(nuevaCantidad);
            resultados.add(productoListaProductos);
        }
    }
    
    return resultados;
}

      public String extraerFecha(JDateChooser dateChooser) {
        Date selectedDate = dateChooser.getDate();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String formattedDate = dateFormat.format(selectedDate);
        
        return formattedDate;
    }
}
