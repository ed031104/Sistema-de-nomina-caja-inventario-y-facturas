package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class FicheroNomina {
    public void Ingresarficheroregistros(Nomina nomina, Empleado empleado){
        
        nomina.valorHoras(empleado);
        nomina.pagoHoras();
        nomina.HorasExtras();
        nomina.pagoExtras();
        nomina.pagoantiguedad(empleado);
        nomina.salariobruto();
        nomina.inss();
        nomina.calculoir(empleado);
        nomina.totaldeducciones();
        nomina.salarioneto();
        nomina.inssp(empleado);
        nomina.inatec(empleado);
        
        FileWriter fw = null;
        try{
            fw = new FileWriter("nominas.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            
            Rg.print(nomina.getEmpleado().NºINNS+",");
            Rg.print(nomina.getEmpleado().Nombres+",");
            Rg.print(nomina.getEmpleado().Apellidos+",");
            Rg.print(nomina.getEmpleado().Direccion+",");
            Rg.print(nomina.getEmpleado().Cedula+",");
            Rg.print(nomina.getEmpleado().Sexo+",");
            Rg.print(nomina.getEmpleado().Cargo+",");
            Rg.print(nomina.getEmpleado().Correo+",");
            Rg.print(nomina.getEmpleado().Telefono+",");
            Rg.print(nomina.getEmpleado().Salario+",");
            
            Rg.print(nomina.getHoras()+",");
            Rg.print(nomina.getValorH()+",");
            Rg.print(nomina.getPagoH()+",");
            //Bonos
            Rg.print(nomina.getHorasE()+",");
            Rg.print(nomina.getPagoE()+",");
            Rg.print(nomina.getAntiguedad()+",");
            Rg.print(nomina.getPagoA()+",");
            //Otras Bonificaciones
            Rg.print(nomina.getIncentivo()+",");
            Rg.print(nomina.getComicion()+",");
            
            Rg.print(nomina.getSalarioB()+",");
            
            //Deducciones
            Rg.print(nomina.getINNS()+",");
            Rg.print(nomina.getIR()+",");
            Rg.print(nomina.getOtrasD()+",");
            
            
            Rg.print(nomina.getNetoR()+",");
            
            //Otros
            Rg.print(nomina.getINNSP()+",");
            Rg.print(nomina.getInatec()+",");
            
            //Prestaciones Sociales
            Rg.print(nomina.getAguinaldo()+",");
            Rg.print(nomina.getVacaciones()+"\n");
            
            
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    
    public ArrayList<Nomina> extraerDatosNominaFicheros() throws IOException, ParseException{
        
    ArrayList<Nomina> listaNomina = new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("nominas.txt"));
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 29) {
            int nºinns = Integer.parseInt (datos[0]);
            String nombre = datos[1];
            String apellido = datos[2];
            String direccion = datos[3];
            String cedula = datos[4];
            String sexo = datos[5];
            String cargo = datos[6];
            String correo = datos[7];
            int telefono = Integer.parseInt(datos[8]);
            double salario = Double.parseDouble(datos[9]);
            
            double horas = Double.parseDouble(datos[10]);
            double valorhoras = Double.parseDouble(datos[11]);
            double pagohoras = Double.parseDouble(datos[12]);
            double horasextras = Double.parseDouble(datos[13]);
            double pagoextras = Double.parseDouble(datos[14]);
            int Antiguedad = Integer.parseInt(datos[15]);
            double pagoantiguedad = Double.parseDouble(datos[16]);
            double incentivo = Double.parseDouble(datos[17]);
            double comicion = Double.parseDouble(datos[18]);
            double salariobruto = Double.parseDouble(datos[19]);;
            double netoarecibir = Double.parseDouble(datos[20]);
            double salarioanual = Double.parseDouble(datos[21]);
            double inns = Double.parseDouble(datos[22]);
            double ir = Double.parseDouble(datos[23]);
            double otrasdeducciones = Double.parseDouble(datos[24]);
            double innspatronal = Double.parseDouble(datos[25]);
            
            double inatec = Double.parseDouble(datos[26]);
            double aguinaldo = Double.parseDouble(datos[27]);
            double vacaciones = Double.parseDouble(datos[28]);
            
            Empleado cliente = new Empleado(nºinns, nombre, apellido, direccion, cedula, sexo, cargo, correo, telefono, salario);
            
            Nomina factura = new Nomina(cliente, horas, valorhoras, pagohoras, horas, inatec, Antiguedad, 
                    pagohoras, incentivo, comicion, salario, inatec, salario, inns, ir, horas, inns, inatec, 
                    aguinaldo, vacaciones);
            
            listaNomina.add(factura);
        }
    }

    // Devuelve la lista de clientes
    return listaNomina;
    }
    
    public DefaultListModel <Nomina> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Nomina> flm = new DefaultListModel<>();
        
        
        for(modelo.Nomina factura : extraerDatosNominaFicheros()){
            flm.addElement(factura);
        }
        return flm;
    }
}
