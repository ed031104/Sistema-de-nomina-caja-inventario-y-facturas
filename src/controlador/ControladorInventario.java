
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.FicheroProducto;
import modelo.Producto;
import vista.Inventario;

public class ControladorInventario implements ActionListener{

    Inventario vista;
    FicheroProducto ficheroProducto;
    ControladorCaja ControladorCaja;
    
    ControladorInventario(Inventario vista, FicheroProducto ficheroProducto, ControladorCaja ControladorCaja) throws IOException {
        this.ControladorCaja = ControladorCaja;
        this.ficheroProducto = ficheroProducto;
        this.vista = vista;        
        vista.btnGuardar.addActionListener(this);
        
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
            
            Producto producto = new Producto(nombre, categoria, precio, cantidad, id, estado);
            
            ficheroProducto.Ingresarficheroregistros(producto);
            ficheroProducto.llenarTabla(vista.tabalProductos);
            
            ficheroProducto.llenarTabla(ControladorCaja.vista.tablaProductos);
            
            } catch (IOException ex) {
                Logger.getLogger(ControladorInventario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
