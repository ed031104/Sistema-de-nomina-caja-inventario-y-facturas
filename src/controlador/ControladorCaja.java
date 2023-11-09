
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Clientes;
import modelo.FicheroCliente;
import modelo.FicheroProducto;
import modelo.Producto;
import vista.Caja;

public class ControladorCaja implements ActionListener{

    Caja vista;
    ControladorRecibo ControladorRecibo;
    FicheroProducto ficheroProducto ;
    FicheroCliente ficheroCliente ;
    
    DefaultListModel<Producto> productosModelo = new DefaultListModel<>();
        
    
    ControladorCaja(Caja vista, ControladorRecibo ControladorRecibo, FicheroProducto ficheroProducto, FicheroCliente ficheroCliente) throws IOException {
        this.ControladorRecibo = ControladorRecibo;
        this.vista = vista;
        this.ficheroCliente = ficheroCliente;
        this.ficheroProducto = ficheroProducto;
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
        double montoPagar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto a pagar"));
      
           if(montoPagar >= calculoTotal()){
            double vuelto = montoPagar - calculoTotal();
            
            JOptionPane.showMessageDialog(null, "Gracias por su compra \n Su vuelto es:" +vuelto +" C$");
            vista.lblTotal.setText("0.00 C$");
            vista.lblSubTotal.setText("0.00 C$");
            
            modelo.Caja caja = new modelo.Caja( (Clientes) vista.jcbClientes.getSelectedItem(), Double.parseDouble(vista.lblSubTotal.getText()), Double.parseDouble(vista.lblTotal.getText()),  vuelto, llenarListaConProductos());
          
            try {
                for(int i=0 ; i < RestanteProductos().size(); i++){
                    Producto producto = RestanteProductos().get(i);
                    producto.estadoProducto(producto);
                    
                    ficheroProducto.EditarProducto(producto);
                    ficheroProducto.llenarTabla(vista.tablaProductos);
                }
            } catch (IOException ex) {
                Logger.getLogger(ControladorCaja.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            }else{
            JOptionPane.showMessageDialog(null, "Su monto es insuficiente.");
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
        
        if(rowSeleccionado != -1){
                
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

        for (int i = 0; i < productosModelo.getSize(); i++) {
        Producto producto = productosModelo.getElementAt(i);

        double precio = producto.getPrecio();
        int cantidad = producto.getCantidad();

        total += precio * cantidad;
        }
        return total;
    }

    public ArrayList<Producto> llenarListaConProductos(){
     ArrayList<Producto> listaproductos = new ArrayList<>();
            for (int i = 0; i < productosModelo.getSize(); i++) {
                Producto producto = productosModelo.getElementAt(i); 
                listaproductos.add(producto);
            }
            return listaproductos;
    }
    
    public ArrayList<Producto> RestanteProductos() throws IOException{
        
     ArrayList<Producto> listaProductos = ficheroProducto.extraerProductosFicheros();
     ArrayList<Producto> listaproductosJlist = llenarListaConProductos();
            
      // Iterar sobre los elementos de ambas listas
    for (int i = 0; i < listaProductos.size(); i++) {
        Producto productoListaProductos = listaProductos.get(i);
        Producto productoListaJlist = listaproductosJlist.get(i);

        // Restar las cantidades y actualizar la cantidad en listaproductosJlist
        int nuevaCantidad = productoListaProductos.getCantidad() - productoListaJlist.getCantidad() ;
        productoListaProductos.setCantidad(nuevaCantidad);
       
        System.out.println(productoListaJlist.getCantidad());
        System.out.println(productoListaProductos.getCantidad());
    }
     return listaProductos;
    }
}
