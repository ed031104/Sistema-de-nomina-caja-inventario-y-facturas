
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

    //se declaran objetos de distintos tipos de clase
    registroClientes panelClientes;
    FicheroCliente ficheroCliente;
    ControladorCaja ControladorCaja;
    
    ControladorRegistroCliente(registroClientes panelClientes, FicheroCliente ficheroCliente, ControladorCaja ControladorCaja) throws IOException, ParseException{
        //se cargan los objetos con los objetos recibidos en el constructor
        this.panelClientes = panelClientes;
        this.ControladorCaja = ControladorCaja;
        this.ficheroCliente = ficheroCliente;
        
        //se agrega a los botones de la vista eventos
        this.panelClientes.agregar.addActionListener(this);
        this.panelClientes.eliminar.addActionListener(this);
        
        panelClientes.ListaClientes.setModel(ficheroCliente.llenarJlist());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == panelClientes.agregar){
           try {
           //se extraen los datos de la vista
           String Nombres = panelClientes.nombres.getText();
           String Apellidos = panelClientes.apellidos.getText();
           String Direccion = panelClientes.direccion.getText();
           String Cedula = panelClientes.cedula.getText();
           String Sexo = (String) panelClientes.sexo.getSelectedItem();
           String Correo = panelClientes.correo.getText();
           int telefono = Integer.parseInt(panelClientes.telefono.getText());
           int id = Integer.parseInt(panelClientes.txtId.getText());
            
           //se agregan los datos a la nueva instancia de clase clientes.
           Clientes cliente = new Clientes(id, Nombres, Apellidos, Direccion, Cedula, Sexo, Correo, telefono);
            
           //se agrega la instancia de cliente al metodo de registrarfichero de la clase "FicherosClientes"
           ficheroCliente.Ingresarficheroregistros(cliente);
            
           //se agrega al Jlist listaClientes el model que se encunetra en "FicherosClientes"
           panelClientes.ListaClientes.setModel(ficheroCliente.llenarJlist());
            
           ControladorCaja.vista.jcbClientes.setModel(ficheroCliente.llenarComboBox());
            
           } catch (IOException | ParseException ex) {
               Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
        if(e.getSource() == panelClientes.eliminar){
         
            try {
                
                Clientes cliente = panelClientes.ListaClientes.getSelectedValue();
               
                ficheroCliente.EliminarCliente(cliente.getId());
                
                panelClientes.ListaClientes.setModel(ficheroCliente.llenarJlist());
            
            } catch (IOException | ParseException ex) {
                Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    
}
