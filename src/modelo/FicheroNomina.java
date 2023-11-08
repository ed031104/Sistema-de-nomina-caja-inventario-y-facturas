package modelo;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class FicheroNomina {
    
    public void Ingresarficheroregistros(Nomina nomina){
        
        nomina.valorHoras(nomina);
        nomina.HorasExtras(nomina);
        nomina.pagoHoras(nomina);
        nomina.pagoExtras(nomina);
        nomina.pagoantiguedad(nomina);
        nomina.salariobruto(nomina);
        nomina.inss(nomina);
        nomina.calculoir(nomina);
        nomina.totaldeducciones(nomina);
        nomina.salarioneto(nomina);
        nomina.inssp(nomina);
        nomina.inatec(nomina);
        nomina.calculoVacaciones(nomina);
        nomina.aguinaldo(nomina);
        
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
            
            Nomina nomina = new Nomina(horas, valorH, pagoH, horasE, pagoExtra, antiguedad, pagoAntiguedad, dincentivo, comicion, salarioBruto,
                    netoRecibir, salarioAnual, Inss, Ir, otrasD, InssPatronal, Inatec, Aguinaldo, vacaciones, empleados);
            
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
 
    public void llenarTabla(JTable tablaNomina) throws IOException{
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("NO INSS");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CARGO");
        dtm.addColumn("SUELDO MENSUAL");
        dtm.addColumn("HORAS TRABAJADAS");
        dtm.addColumn("HORAS EXTRAS");
        dtm.addColumn("PAGO HORAS EXTRAS");
        dtm.addColumn("AÑOS ANTIGUEDAD");
        dtm.addColumn("PAGO POR ANTIGUEDAD");
        dtm.addColumn("INCENTIVO");
        dtm.addColumn("COMISION");
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
            Object[] fila = {nomina.getEmpleado().getNºINNS(), nomina.getEmpleado().getNombres(), nomina.getEmpleado().getCargo(), 
            nomina.getEmpleado().getSalario(),nomina.getHoras(),nomina.getHorasE(), nomina.getPagoE(), nomina.getAntiguedad(),
            nomina.getPagoA(), nomina.getIncentivo(), nomina.getComicion(), nomina.getSalarioB(),nomina.getINNS(), nomina.getIR(),
            nomina.getOtrasD(), nomina.getNetoR(), nomina.getINNSP(), nomina.getInatec(), nomina.getAguinaldo(), nomina.getVacaciones()};
            dtm.addRow(fila);
            }
        }
        
        tablaNomina.setModel(dtm);
        
        tablaNomina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        cambiarTamañoColumnasTabla(tablaNomina, 270);
        
        //cambia el color a columnas de la Tabla Nomina
        applyColorToColumn(tablaNomina, 3, Color.green);
        applyColorToColumn(tablaNomina, 5, Color.green);
        applyColorToColumn(tablaNomina, 7, Color.green);
        applyColorToColumn(tablaNomina, 8, Color.green);
        applyColorToColumn(tablaNomina, 9, Color.green);
        applyColorToColumn(tablaNomina, 10, Color.red);
        applyColorToColumn(tablaNomina, 11, Color.red);
        applyColorToColumn(tablaNomina, 12, Color.red);
        applyColorToColumn(tablaNomina, 13, Color.gray);
        
    }
    
     private static void applyColorToColumn(JTable table, int columnIndex, Color color) {
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component rendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                rendererComponent.setForeground(color); // Cambiar el color del texto
                setHorizontalAlignment(SwingConstants.CENTER); // Centrar el texto
                return rendererComponent;
            }
        });    
    }
    private void cambiarTamañoColumnasTabla(JTable table, int tamañoColumna){
    int anchoColumna = tamañoColumna;
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(anchoColumna);
        }
    }
    
}