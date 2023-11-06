
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.FicheroEmpleado;
import modelo.FicheroNomina;
import modelo.Nomina;
import vista.RegistroNomina;

public class ControladorRegistroNomina implements ActionListener{

    ControladorRegitroEmpleado ctnEmpleado;
    RegistroNomina vista;
    FicheroNomina fichero;
    FicheroEmpleado ficheroEmpleado = new FicheroEmpleado();
    
    public ControladorRegistroNomina( RegistroNomina vista, FicheroNomina fichero, ControladorNomina controladorNomina) throws IOException, ParseException{
    this.vista = vista;
    this.vista.agregar.addActionListener(this);
    this.fichero = fichero;
     vista.jcbEmpleados.setModel(ficheroEmpleado.llenarComboBox());
     vista.ListaRegistroNomina.setModel(fichero.llenarJlist());
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.agregar){
            try {
            double horas = vista.spfHorasLaboradas.getValue();
            int añosAntiguedad = vista.spfAñosAntiguedad.getValue();
            double incentivo = Double.parseDouble(vista.txtIncentivo.getText());
            double comision = Double.parseDouble(vista.txtComision.getText());
            Empleado empleado = (Empleado) vista.jcbEmpleados.getSelectedItem();
            
            Nomina nomina = new Nomina(horas, 0, 0, 0 , 0, añosAntiguedad, 0, incentivo, comision, 0, 0 , 0, 0 , 0, 0, 0, 0, 0, 0, empleado);
            
            fichero.Ingresarficheroregistros(nomina);
            
                vista.ListaRegistroNomina.setModel(fichero.llenarJlist());
            } catch (IOException ex) {
                Logger.getLogger(ControladorRegistroNomina.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorRegistroNomina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
