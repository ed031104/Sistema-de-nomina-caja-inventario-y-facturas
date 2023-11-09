package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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
            Rg.print(cliente.getId()+",");
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

        if (datos.length >= 8) {
            
            int Id= Integer.parseInt(datos[0]);
            String nombre = datos[1];
            String apellido = datos[2];
            String direccion = datos[3];
            String cedula = datos[4];
            String sexo = datos[5];
            String correo = datos[6];
            int telefono= Integer.parseInt(datos[7]);
        
          
            
            Clientes cliente = new Clientes(Id,nombre, apellido, direccion, cedula, sexo, correo, telefono);
            listaClienteses.add(cliente);
        }
    }
    br.close();
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
   
     public void EliminarCliente(int clienteId) throws IOException, ParseException {
    File inputFile = new File("clientes.txt");
    File tempFile = new File("temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String lineToRemove = Integer.toString(clienteId);
        String currentLine;

        while ((currentLine = reader.readLine()) != null) {
            // Si la línea no contiene el ID del cliente a eliminar, la escribimos en el archivo temporal
            if (!currentLine.startsWith(lineToRemove + ",")) {
                writer.write(currentLine + System.getProperty("line.separator"));
            }
        }
    }

    // Eliminar el archivo original
    if (!inputFile.delete()) {
        System.err.println("No se pudo eliminar el archivo original.");
    }

    // Renombrar el nuevo archivo temporal al original
    int retries = 0;
    while (!tempFile.renameTo(inputFile) && retries < 5) {
        // Si el renameTo falla, intentarlo nuevamente
        retries++;
        try {
            Thread.sleep(100); // Esperar 100 ms antes de reintentarlo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    if (retries == 5) {
        System.err.println("No se pudo renombrar el archivo temporal al original después de 5 intentos.");
    }
}
    
   }
