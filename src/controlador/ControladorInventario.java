
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.FicheroProducto;
import modelo.Producto;
import raven.toast.Notifications;
import vista.Inventario;

public class ControladorInventario implements ActionListener{

    Inventario vista;
    FicheroProducto ficheroProducto;
    ControladorCaja ControladorCaja;

    public ControladorInventario() {
    }
    
    ControladorInventario(Inventario vista, FicheroProducto ficheroProducto, ControladorCaja ControladorCaja) throws IOException {
        this.ControladorCaja = ControladorCaja;
        this.ficheroProducto = ficheroProducto;
        this.vista = vista;        
        vista.btnEliminar.addActionListener(this);
        vista.btnGuardar.addActionListener(this);
        vista.btnEditar.addActionListener(this);
        
        ficheroProducto.llenarTabla(vista.tabalProductos);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.btnGuardar){
            try {
            String nombre = vista.txtNombre.getText();
            int cantidad = vista.jspCantidad.getValue();
            double precio = Double.parseDouble(vista.txtPrecio.getText());
            String categoria = (String) vista.jcbCategoria.getSelectedItem();
            int id = Integer.parseInt(vista.txtId.getText());
            String estado = "";
            
            Producto producto = new Producto(id, nombre, categoria, precio, cantidad, estado);
            
            ficheroProducto.Ingresarficheroregistros(producto);
            ficheroProducto.llenarTabla(vista.tabalProductos);
            
            ficheroProducto.llenarTabla(ControladorCaja.vista.tablaProductos);
            
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Registro exitoso");

            
            } catch (IOException ex) {
                Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == vista.btnEliminar){
            
            int rowSeleccionado = vista.tabalProductos.getSelectedRow();
        
            if(rowSeleccionado != -1){
                
            
                int id = (int) vista.tabalProductos.getValueAt(rowSeleccionado, 0);
                String nombre =  (String) vista.tabalProductos.getValueAt(rowSeleccionado, 1);
                String categoria =  (String) vista.tabalProductos.getValueAt(rowSeleccionado, 2);
                double precio = (double) vista.tabalProductos.getValueAt(rowSeleccionado, 3);
                int cantidad = (int) vista.tabalProductos.getValueAt(rowSeleccionado, 4);
                String estado =  (String) vista.tabalProductos.getValueAt(rowSeleccionado, 5);
                
                 try {
                     ficheroProducto.EliminarProducto(id);
                     ficheroProducto.llenarTabla(vista.tabalProductos);
                     ficheroProducto.llenarTabla(ControladorCaja.vista.tablaProductos);
                     
                     Notifications.getInstance().show(Notifications.Type.SUCCESS, "Se ha eliminado con exito el producto");
                     
                 } catch (IOException | ParseException ex) {
                     Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
                 }
            }
        }
        if(e.getSource() == vista.btnEditar){
            
            String nombre = vista.txtNombre.getText();
            int cantidad = vista.jspCantidad.getValue();
            double precio = Double.parseDouble(vista.txtPrecio.getText());
            String categoria = (String) vista.jcbCategoria.getSelectedItem();
            int id = Integer.parseInt(vista.txtId.getText());
            String estado = "";
            
            Producto producto = new Producto(id, nombre, categoria, precio, cantidad, estado);
            producto.estadoProducto(producto);
            
            ficheroProducto.EditarProducto(producto);
            
            try {
                ficheroProducto.llenarTabla(vista.tabalProductos);
                ficheroProducto.llenarTabla(ControladorCaja.vista.tablaProductos);
                
                Notifications.getInstance().show(Notifications.Type.SUCCESS, "Se ha editado con exito el producto");
                
            } catch (IOException ex) {
                Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
