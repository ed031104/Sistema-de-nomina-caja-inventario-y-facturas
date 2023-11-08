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
        
public class FicheroCliente {

    
    public void Ingresarficheroregistros(Clientes cliente){
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("clientes.txt" , true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personales
            Rg.print(cliente.getNombres()+",");
            Rg.print(cliente.getApellidos()+",");
            Rg.print(cliente.getDireccion()+",");
            Rg.print(cliente.getCedula()+",");
            Rg.print(cliente.getSexo()+",");
            Rg.print(cliente.getCorreo()+",");
            Rg.print(cliente.getTelefono()+"\n");
            
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
    
    public ArrayList<Clientes> extraerClienteFicheros() throws IOException{
        
    ArrayList<Clientes> listaClienteses= new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("clientes.txt"));
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 7) {
            
            String nombre = datos[0];
            String apellido = datos[1];
            String direccion = datos[2];
            String cedula = datos[3];
            String sexo = datos[4];
            String correo = datos[5];
            int telefono= Integer.parseInt(datos[6]);
        
          
            
            Clientes cliente = new Clientes(nombre, apellido, direccion, cedula, sexo, correo, telefono);
            listaClienteses.add(cliente);
        }
    }

    // Devuelve la lista de clientes
    return listaClienteses;
    }
    
    public DefaultComboBoxModel llenarComboBox() throws IOException  {
        
    DefaultComboBoxModel<Clientes> dcm = new DefaultComboBoxModel<>();
    ArrayList<Clientes> listaEmpleado = new ArrayList<>();
       
    //se llena el array listaclientes con la infromacion del fichero
    listaEmpleado = extraerClienteFicheros();
    
    if (listaEmpleado != null) { // Verificar si la lista no es nula
        for (Clientes cliente : listaEmpleado) {
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
    
    public DefaultListModel <Clientes> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Clientes> flm = new DefaultListModel<>();
        
        
        for(Clientes factura : extraerClienteFicheros()){
            flm.addElement(factura);
        }
        return flm;
    }
    
}
