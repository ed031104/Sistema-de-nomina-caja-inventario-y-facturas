package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;        
public class FicheroEmpleado {

    public FicheroEmpleado(){
    }
    
    public void Ingresarficheroregistros(Empleado registro){
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("Empleados.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personales
            Rg.print(registro.getNºINNS()+",");
            Rg.print(registro.getCargo()+",");
            Rg.print(registro.getSalario()+",");
            Rg.print(registro.getNombres()+",");
            Rg.print(registro.getApellidos()+",");
            Rg.print(registro.getDireccion()+",");
            Rg.print(registro.getCedula()+",");
            Rg.print(registro.getSexo()+",");
            Rg.print(registro.getCorreo()+",");
            Rg.print(registro.getTelefono()+"\n");
            
            //Rg.print(registro.getFoto()+"\n");
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    
    public ArrayList<Empleado> extraerDatosempleadoFicheros() throws IOException{
        
    ArrayList<Empleado> listaEmpleado = new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 10) {
            int nºinns = Integer.parseInt(datos[0]);
            String cargo = datos[1];
            double salario = Double.parseDouble(datos[2]);
            String nombres = datos[3];
            String apellidos = datos[4];
            String direccion = datos[5];
            String cedula = datos[6];
            String sexo = datos[7];
            String correo = datos[8];
            int telefono = Integer.parseInt(datos[9]);
            //String foto = datos[10];
          
            
            
            Empleado factura = new Empleado(nºinns, cargo, salario, nombres, apellidos, direccion, cedula, sexo, correo, telefono);
            
            listaEmpleado.add(factura);
        }
    }

    // Devuelve la lista de clientes
    return listaEmpleado;
    }
    
    public DefaultComboBoxModel llenarComboBox() throws IOException  {
        
    DefaultComboBoxModel<Empleado> dcm = new DefaultComboBoxModel<>();
    ArrayList<Empleado> listaEmpleado = new ArrayList<>();
       
    //se llena el array listaclientes con la infromacion del fichero
    listaEmpleado = extraerDatosempleadoFicheros();
    
    if (listaEmpleado != null) { // Verificar si la lista no es nula
        for (Empleado cliente : listaEmpleado) {
            dcm.addElement(cliente);
        }
        //se devuelve la lista
        return dcm;
    } else {
        JOptionPane.showMessageDialog(null, "No hay usuarios registrados.");
        // Manejar el caso en el que la lista sea nula o esté vacía Puedes mostrar un mensaje o realizar una acción apropiada.
        }
        return null;
    }

    public DefaultListModel<Empleado> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Empleado> flm = new DefaultListModel<>();
        
        
        for(Empleado empleado : extraerDatosempleadoFicheros()){
            flm.addElement(empleado);
        }
        return flm;
    }
    
}
