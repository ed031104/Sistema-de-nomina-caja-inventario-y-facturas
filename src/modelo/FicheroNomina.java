package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FicheroNomina {
    
    public void Ingresarficheroregistros(Nomina nomina){
        
        nomina.valorHoras();
        nomina.pagoHoras();
        nomina.HorasExtras();
        nomina.pagoExtras();
        nomina.pagoantiguedad();
        nomina.salariobruto();
        nomina.inss();
        nomina.calculoir();
        nomina.totaldeducciones();
        nomina.salarioneto();
        nomina.inssp();
        nomina.inatec();
        FileWriter fw = null;
        try{
            fw = new FileWriter("nominas.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter (bw);
            
            pw.print(nomina.getHoras()+",");
            pw.print(nomina.getValorH()+",");
            pw.print(nomina.getPagoE()+",");
            pw.print(nomina.getAntiguedad()+",");
            pw.print(nomina.getPagoA()+",");
            pw.print(nomina.getIncentivo()+",");
            pw.print(nomina.getComicion()+",");
            pw.print(nomina.getSalarioB()+",");
            pw.print(nomina.getNetoR()+",");
            pw.print(nomina.getSalarioA()+",");
            pw.print(nomina.getINNS()+",");
            pw.print(nomina.getIR()+",");
            pw.print(nomina.getOtrasD()+",");
            pw.print(nomina.getINNSP()+",");
            pw.print(nomina.getInatec()+",");
            pw.print(nomina.getAguinaldo()+",");
            pw.print(nomina.getVacaciones()+",");
            
            pw.print(nomina.getEmpleado().getNºINNS()+",");
            pw.print(nomina.getEmpleado().getNombres()+",");
            pw.print(nomina.getEmpleado().getApellidos()+",");
            pw.print(nomina.getEmpleado().getDireccion()+",");
            pw.print(nomina.getEmpleado().getCedula()+",");
            pw.print(nomina.getEmpleado().getSexo()+",");
            pw.print(nomina.getEmpleado().getCargo()+",");
            pw.print(nomina.getEmpleado().getCorreo()+",");
            pw.print(nomina.getEmpleado().getTelefono()+",");
            pw.print(nomina.getEmpleado().getSalario()+",");
            
            pw.close();
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
}
