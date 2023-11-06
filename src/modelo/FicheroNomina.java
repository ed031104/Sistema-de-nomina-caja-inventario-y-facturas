package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FicheroNomina {
    
    public void Ingresarficheroregistros(Nomina nomina){
        
        nomina.valorHoras();
        nomina.HorasExtras();
        nomina.pagoHoras();
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
            
            pw.print(nomina.getHoras()+",");
            pw.print(nomina.getValorH()+",");
            pw.print(nomina.getPagoH()+",");
            pw.print(nomina.getHorasE()+",");
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
            pw.print(nomina.getVacaciones()+"\n");
            
            
            pw.close();
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }

    public ArrayList<Nomina> extraerDatosNominaFicheros() throws IOException{
        
    ArrayList<Nomina> listanomina = new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("nominas.txt"));
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 29) {
            
            int nºinns = Integer.parseInt(datos[0]);
            String nombres = datos[1];
            String apellidos = datos[2];
            String direccion = datos[3];
            String cedula = datos[4];
            String sexo = datos[5];
            String cargo = datos[6];
            String correo = datos[7];
            int telefono = Integer.parseInt(datos[8]);
            double salario = Double.parseDouble(datos[9]);
            
            double horas = Double.parseDouble(datos[10]);
            double valorH = Double.parseDouble(datos[11]);
            double pagoH = Double.parseDouble(datos[12]);
            double horasE = Double.parseDouble(datos[13]);
            double pagoExtra = Double.parseDouble(datos[14]);
            int antiguedad = Integer.parseInt(datos[15]);
            double pagoAntiguedad = Double.parseDouble(datos[16]);
            double dincentivo = Double.parseDouble(datos[17]);
            double comicion = Double.parseDouble(datos[18]);
            double salarioBruto = Double.parseDouble(datos[19]);
            double netoRecibir = Double.parseDouble(datos[20]);
            double salarioAnual = Double.parseDouble(datos[21]);
            double Inss = Double.parseDouble(datos[22]);
            double Ir = Double.parseDouble(datos[23]);
            double otrasD = Double.parseDouble(datos[24]);
            double InssPatronal = Double.parseDouble(datos[25]);
            double Inatec = Double.parseDouble(datos[26]);
            double Aguinaldo = Double.parseDouble(datos[27]);
            double vacaciones = Double.parseDouble(datos[28]);
            
            
            
            Empleado empleados = new Empleado(nºinns, cargo, salario, nombres, apellidos, direccion, cedula, sexo, correo, telefono);
            
            Nomina nomina = new Nomina(horas, valorH, pagoH, horasE, pagoH, antiguedad, pagoH, dincentivo, comicion, salario, Inatec, salario, Inss, Ir, otrasD, Inss, Inatec, Aguinaldo, vacaciones, empleados);
            
            listanomina.add(nomina);
        }
    }

    // Devuelve la lista de clientes
    return listanomina;
    }
   
    public DefaultListModel<Nomina> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Nomina> flm = new DefaultListModel<>();
        
        
        for(Nomina empleado : extraerDatosNominaFicheros()){
            flm.addElement(empleado);
        }
        return flm;
    }
 
    public DefaultTableModel llenarTabla() throws IOException{
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("NO INSS");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CARGO");
        dtm.addColumn("SUELDO MENSUAL");
        dtm.addColumn("HORAS EXTRAS");
        dtm.addColumn("PAGO HORAS EXTRAS");
        dtm.addColumn("AÑOS ANTIGUEDAD");
        dtm.addColumn("PAGO POR ANTIGUEDAD");
        dtm.addColumn("BONO");
        dtm.addColumn("SALARIO BRUTO");
        dtm.addColumn("INSS LABORAL");
        dtm.addColumn("IR");
        dtm.addColumn("TOTAL DEDUCCIONES");
        dtm.addColumn("NETO RECIBIR");
        dtm.addColumn("INSS PATRONAL");
        dtm.addColumn("INATEC");
        dtm.addColumn("AGUINALDO");
        dtm.addColumn("VACACIONES");
        
        
        
        ArrayList<Nomina> nominas = extraerDatosNominaFicheros();
        
        if(nominas != null){
        for(Nomina nomina : nominas){
            Object[] fila = {nomina.getEmpleado().getNºINNS(), nomina.getEmpleado().getNombres(), nomina.getEmpleado().getCargo(), nomina.getEmpleado().getSalario(),
            nomina.getHorasE(), nomina.getPagoE(), nomina.getAntiguedad(), nomina.getPagoA(), nomina.getIncentivo(), nomina.getComicion(), nomina.getSalarioB(),
            nomina.getINNS(), nomina.getIR(), nomina.getOtrasD(), nomina.getNetoR(), nomina.getINNSP(), nomina.getInatec(), nomina.getAguinaldo(), nomina.getVacaciones()};
            dtm.addRow(fila);
            }
        }
        return dtm;
    }
}