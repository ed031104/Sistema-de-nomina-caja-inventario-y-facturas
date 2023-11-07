
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
    
    public ControladorRegistroCliente(){}
    
    public ControladorRegistroCliente(registroClientes vista, FicheroCliente fichero, ControladorInventario controlador) throws IOException{
        
        this.vista = vista;
        this.fichero = fichero;
        this.vista.agregar.addActionListener(this);
        
        vista.tablaClientes.setModel(fichero.llenarComboBox());
        
        this.controlador= controlador;
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.agregar){
            
            String sexo = (String) vista.sexo.getSelectedItem();
            
            //se registra un nuevo cliente
            Clientes cliente = new Clientes(vista.nombres.getText(),vista.apellidos.getText(),vista.direccion.getText(),
                        vista.cedula.getText(), sexo ,vista.correo.getText(),Integer.parseInt(vista.telefono.getText()));
            
            //se agrega al fichero
            fichero.Ingresarficheroregistros(cliente);
           
            try {
                //se muetra el cliente en el Jtable
                vista.tablaClientes.setModel(fichero.llenarComboBox());
                controlador.vista.R.setModel(fichero.llenarComboBox());
            } catch (IOException ex) {
            }
            
        }
        
    
    }
    
}
