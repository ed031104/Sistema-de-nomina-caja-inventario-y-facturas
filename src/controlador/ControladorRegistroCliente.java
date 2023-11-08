
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Clientes;
import modelo.FicheroCliente;
import vista.registroClientes;

public class ControladorRegistroCliente implements ActionListener{

    registroClientes panelClientes;
    FicheroCliente ficheroCliente;
    ControladorCaja ControladorCaja;
    
    ControladorRegistroCliente(registroClientes panelClientes, FicheroCliente ficheroCliente, ControladorCaja ControladorCaja) throws IOException, ParseException{
        this.panelClientes = panelClientes;
        this.ControladorCaja = ControladorCaja;
        this.ficheroCliente = ficheroCliente;
        this.panelClientes.agregar.addActionListener(this);
        
        panelClientes.ListaClientes.setModel(ficheroCliente.llenarJlist());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == panelClientes.agregar){
            try {
            String Nombres = panelClientes.nombres.getText();
            String Apellidos = panelClientes.apellidos.getText();
            String Direccion = panelClientes.direccion.getText();
            String Cedula = panelClientes.cedula.getText();
            String Sexo = (String) panelClientes.sexo.getSelectedItem();
            String Correo = panelClientes.correo.getText();
            int telefono = Integer.parseInt(panelClientes.telefono.getText());
            
            
            Clientes cliente = new Clientes( Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, telefono);
            
            ficheroCliente.Ingresarficheroregistros(cliente);
            
            panelClientes.ListaClientes.setModel(ficheroCliente.llenarJlist());
            
                ControladorCaja.vista.jcbClientes.setModel(ficheroCliente.llenarComboBox());
            } catch (IOException ex) {
                Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
