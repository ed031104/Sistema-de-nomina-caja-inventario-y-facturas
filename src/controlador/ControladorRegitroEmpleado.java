
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.FicheroEmpleado;
import vista.RegistroEmpleados;

public class ControladorRegitroEmpleado implements ActionListener{

    RegistroEmpleados vista; 
    FicheroEmpleado fichero;
    
    public ControladorRegitroEmpleado(RegistroEmpleados vista, FicheroEmpleado fichero) throws IOException, ParseException{
        this.vista = vista;
        this.fichero = fichero;
        vista.agregar.addActionListener(this);
        vista.ListaEmpleados.setModel(fichero.llenarJlist());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.agregar){
            
            try {
                int INNS = Integer.parseInt(vista.numeroINNS.getText());
                String cargo = vista.cargo.getText();
                double salario = Double.parseDouble(vista.salario.getText());
                
                String nombres = vista.nombres.getText();
                String apellidos = vista.apellidos.getText();
                String direccion = vista.direccion.getText();
                String cedula = vista.cedula.getText();
                String sexo = (String) vista.sexo.getSelectedItem();
                String correo = vista.correo.getText();
                int telefono = Integer.parseInt(vista.telefono.getText());
                
                Empleado empleado = new Empleado(INNS, cargo, salario, nombres, apellidos, direccion, cedula, sexo, correo, telefono);
                
                fichero.Ingresarficheroregistros(empleado);
                
                vista.ListaEmpleados.setModel(fichero.llenarJlist());
            } catch (IOException ex) {
                Logger.getLogger(ControladorRegitroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorRegitroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
