
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.FicheroNomina;
import vista.datosNominas;

public class ControladorNomina implements ActionListener{

    datosNominas vista;
    FicheroNomina fichero;
    
    ControladorNomina(datosNominas vista , FicheroNomina fichero) throws IOException {
        this.fichero = fichero;
        this.vista = vista;
       
        fichero.llenarTabla(vista.tablaNomina);
        
         this.vista.tablaNomina.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {tablaNominaValueChanged(e);} } );
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    
    public void tablaNominaValueChanged(ListSelectionEvent e){
        if(!e.getValueIsAdjusting()){
            int rowSeleccionado = vista.tablaNomina.getSelectedRow();
            
            if(rowSeleccionado != -1){
                
                double sueldoMensual = (double) vista.tablaNomina.getValueAt(rowSeleccionado, 3);
                double inns = (double) vista.tablaNomina.getValueAt(rowSeleccionado, 12);
                double ir = (double) vista.tablaNomina.getValueAt(rowSeleccionado, 13);
                ArrayList<Double> lista = tarifaProgresivaIr(sueldoMensual);
                
                vista.lblSalarioMensual.setText(String.valueOf(sueldoMensual + " C$"));
                vista.lblInssLaboral.setText(String.valueOf(inns + " C$"));
                vista.lblBaseImponible.setText(String.valueOf(sueldoMensual - inns + " C$"));
                vista.lblSalarioAnual.setText(String.valueOf(lista.get(0) + " C$"));
                vista.lblDeducible.setText(String.valueOf(lista.get(1) + " C$"));
                vista.lblSalarioMenosDeducible.setText(String.valueOf(lista.get(4) + " C$"));
                vista.lblPorcentajeSegunLey.setText(String.valueOf(lista.get(2) + " %"));
                vista.lblImpuestoBase.setText(String.valueOf(lista.get(3) + " C$"));
                vista.lblIrAnual.setText(String.valueOf(lista.get(5) + " C$"));
                vista.lblIrMensual.setText(String.valueOf(ir + " C$"));
                
                
            }
        }
    }
   
    private ArrayList<Double> tarifaProgresivaIr(double salarioMensual){
    ArrayList<Double> datos = new ArrayList<>();
    
    double sueldoAnual = salarioMensual * 12;
    double deducible = 0;
    double porcentaje = 0;
    double impuestoBase=0;
    double salarioMenosDeducible=0;
    double IrAnual= 0;
    double IrMensual=0;
    
     if(sueldoAnual >= 1 && sueldoAnual <=100000){
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 100001 && sueldoAnual <=200000){
        deducible = 100000;
        porcentaje= 0.15;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 200001 && sueldoAnual <=350000){
        deducible = 200000;
        porcentaje= 0.2;
        impuestoBase = 15000;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >= 350001 && sueldoAnual <=500000){
        deducible = 350000;
        porcentaje= 0.25;
        impuestoBase = 45000;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
    }
    if(sueldoAnual >=500001){
        deducible = 500000;
        porcentaje= 0.3;
        impuestoBase = 82500;
        salarioMenosDeducible= sueldoAnual-deducible;
       IrAnual= (salarioMenosDeducible * porcentaje) + impuestoBase;
       IrMensual = IrAnual/12;
        }
    
        datos.add(sueldoAnual);
        datos.add(deducible);
        datos.add(porcentaje);
        datos.add(impuestoBase);
        datos.add(salarioMenosDeducible);
        datos.add(IrAnual);
    
        return datos;
    }
}
