
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
    ControladorRegistroNomina ctnNomina;
    
    public ControladorRegitroEmpleado(RegistroEmpleados vista, FicheroEmpleado fichero, ControladorRegistroNomina ctnNomina) throws IOException, ParseException{
        this.vista = vista;
        this.fichero = fichero;
        this.ctnNomina = ctnNomina;
        vista.agregar.addActionListener(this);
        vista.btnEliminar.addActionListener(this);
        vista.ListaEmpleados.setModel(fichero.llenarJlist());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == vista.agregar){
            
            try {
                int INNS = Integer.parseInt(vista.numeroINNS.getText());
                String cargo = (String) vista.cargo.getSelectedItem();
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
                
                ctnNomina.vista.jcbEmpleados.setModel(fichero.llenarComboBox());
            
            } catch (IOException | ParseException ex) {
                Logger.getLogger(ControladorRegitroEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(e.getSource() == vista.btnEliminar){
            
            try{
            Empleado empleado = vista.ListaEmpleados.getSelectedValue();
               
                fichero.EliminarCliente(empleado.getNºINNS());   
                vista.ListaEmpleados.setModel(fichero.llenarJlist());
                ctnNomina.vista.jcbEmpleados.setModel(fichero.llenarComboBox());
            } catch (IOException | ParseException ex) {
                Logger.getLogger(ControladorRegistroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
