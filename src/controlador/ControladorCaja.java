
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import modelo.FicheroCliente;
import modelo.FicheroProducto;
import vista.Caja;

public class ControladorCaja implements ActionListener{

    Caja vista;
    ControladorRecibo ControladorRecibo;
    FicheroProducto ficheroProducto = new FicheroProducto();
    FicheroCliente ficheroCliente = new FicheroCliente();
    
    ControladorCaja(Caja vista, ControladorRecibo ControladorRecibo) throws IOException {
        this.ControladorRecibo = ControladorRecibo;
        this.vista = vista;
        ficheroProducto.llenarTabla(vista.tablaProductos);
        vista.jcbClientes.setModel(ficheroCliente.llenarComboBox());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
