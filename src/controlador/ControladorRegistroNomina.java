
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.FicheroNomina;
import modelo.Nomina;
import vista.RegistroEmpleados;
import vista.RegistroNomina;

public class ControladorRegistroNomina implements ActionListener{

    ControladorRegitroEmpleado ctnEmpleado;
    RegistroNomina vista;
    FicheroNomina fichero;
    
    public ControladorRegistroNomina(ControladorRegitroEmpleado ctnEmpleado, RegistroNomina vista, FicheroNomina fichero) throws IOException, ParseException{
    this.ctnEmpleado = ctnEmpleado;
    this.vista = vista;
    this.vista.agregar.addActionListener(this);
    this.fichero = fichero;
    vista.jcbEmpleados.setModel(ctnEmpleado.fichero.llenarComboBox());
   // vista.ListaRegistroNomina.setModel(fichero.llenarJlist());
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.agregar){
            
            double horas = vista.spfHorasLaboradas.getValue();
            int añosAntiguedad = vista.spfAñosAntiguedad.getValue();
            double incentivo = Double.parseDouble(vista.txtIncentivo.getText());
            double comision = Double.parseDouble(vista.txtComision.getText());
            Empleado empleado = (Empleado) vista.jcbEmpleados.getSelectedItem();
            
            Nomina nomina = new Nomina(horas, 0, 0, 0 , 0, añosAntiguedad, 0, incentivo, comision, 0, 0 , 0, 0 , 0, 0, 0, 0, 0, 0, empleado);
            
            fichero.Ingresarficheroregistros(nomina);
            
            try {
                vista.ListaRegistroNomina.setModel(fichero.llenarJlist());
            } catch (IOException ex) {
                Logger.getLogger(ControladorRegistroNomina.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ControladorRegistroNomina.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
