
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.ListModel;
import modelo.Empleado;
import modelo.FicheroEmpleado;
import vista.RegistroEmpleados;

public class ControladorRegitroEmpleado implements ActionListener{

    RegistroEmpleados vista;
    FicheroEmpleado fichero;
    
    ControladorRegistroNomina controladornomina;
    
    public ControladorRegitroEmpleado(){}
            
    public ControladorRegitroEmpleado(RegistroEmpleados vista, FicheroEmpleado fichero,ControladorRegistroNomina controlador2) throws IOException{
        this.vista = vista;
        this.fichero = fichero;
        this.vista.agregar.addActionListener(this);
        
        vista.tablaEmpleados.setModel((ListModel<String>) fichero.mostrarDatosTabla());
        
        this.controladornomina = controlador2;
    
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource() == vista.agregar){
            
            //se registra un nuevo cliente
            Empleado cliente = new Empleado(Integer.parseInt(vista.numeroINNS.getText()),
            vista.nombres.getText(),vista.apellidos.getText(), vista.direccion.getText(), 
            vista.cedula.getText(), (String) vista.sexo.getSelectedItem(),vista.correo.getText(), 
            vista.cargo.getText(),Integer.parseInt(vista.telefono.getText()), 
            Double.parseDouble(vista.salario.getText()));
            
            //se agrega al fichero
            fichero.Ingresarficheroregistros(cliente);
           
            try {
                //se muetra el cliente en el Jtable
                vista.tablaEmpleados.setModel(fichero.mostrarDatosTabla());
                controladornomina.vista.Cliente.setModel(fichero.llenarComboBox());
            } catch (IOException ex) {
            }
            
        }
        
    
    }
}
