package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import modelo.Clientes;
import modelo.FicheroCliente;
import vista.registroClientes;

public class ControladorRegistroCliente implements ActionListener{

    registroClientes vista;
    FicheroCliente fichero;
    
    ControladorInventario controlador;
    
    public ControladorRegistroCliente(){
    }
    
    public ControladorRegistroCliente(FicheroCliente fichero, registroClientes vista, ControladorInventario controlador ) throws IOException{
        
        this.vista = vista;
        this.fichero = fichero;
        this.vista.agregar.addActionListener(this);
        
        vista.ListaClientes.setModel(fichero.mostrarDatosTabla());
        
        this.controlador = controlador;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.agregar){
            
            
            String nombre = vista.nombres.getText();
            String apellido = vista.apellidos.getText();
            String direccion = vista.direccion.getText();
            String cedula = vista.cedula.getText();
            String sexo = (String) vista.sexo.getSelectedItem();
            String correo = (String)vista.correo.getText();
            int telefono = Integer.parseInt(vista.nombres.getText());
            //se registra un nuevo cliente
            Clientes cliente = new Clientes(nombre,apellido,direccion,cedula,sexo,correo,telefono);
            
            //se agrega al fichero
            fichero.Ingresarficheroregistros(cliente);
           
            try {
                //se muetra el cliente en el Jtable
                vista.ListaClientes.setModel(fichero.mostrarDatosTabla());
                controlador.vista.Cliente.setModel(fichero.llenarComboBox());
            } catch (IOException ex) {
            }
            
        }
        
        
    }
    
}
