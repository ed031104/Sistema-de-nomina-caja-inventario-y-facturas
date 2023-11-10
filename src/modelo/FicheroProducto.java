
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
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FicheroProducto {

 public void Ingresarficheroregistros(Producto producto){
     
        producto.estadoProducto(producto);
     
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("Productos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personales
            Rg.print(producto.getId()+",");
            Rg.print(producto.getNombre()+",");
            Rg.print(producto.getCategoria()+",");
            Rg.print(producto.getPrecio()+",");
            Rg.print(producto.getCantidad()+",");
            Rg.print(producto.getEstado()+"\n");
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
 
 public ArrayList<Producto> extraerProductosFicheros() throws IOException{
        
    ArrayList<Producto> listaProductos= new ArrayList<>();
    
    BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
    
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 6) {
            
            int id = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            String categoria = datos[2];
            double Precio = Double.parseDouble(datos[3]);
            int Cantidad = Integer.parseInt(datos[4]);
            String Estado = datos[5];
            
            Producto producto = new Producto(id, nombre, categoria, Precio, Cantidad,  Estado);
            listaProductos.add(producto);
        }
    }
    br.close();
    // Devuelve la lista de clientes
    return listaProductos;
    }
   
  public DefaultListModel<Producto> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Producto> flm = new DefaultListModel<>();
        
        
        for(Producto producto : extraerProductosFicheros()){
            flm.addElement(producto);
        }
        return flm;
    }
 
    public void llenarTabla(JTable tablaInventario) throws IOException{
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("ID");
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CATEGORIA");
        dtm.addColumn("PRECIO");
        dtm.addColumn("CANTIDAD");
        dtm.addColumn("ESTADO");
        
        ArrayList<Producto> Listaproducto = extraerProductosFicheros();
        
        if(Listaproducto != null){
            
        for(Producto productos : Listaproducto){
            
            Object[] fila = {productos.getId(), productos.getNombre(), productos.getCategoria(), productos.getPrecio(), productos.getCantidad(), 
             productos.getEstado()};
            dtm.addRow(fila);
            
            }
        }
        
        tablaInventario.setModel(dtm);
        
        for (int i = 0; i < tablaInventario.getColumnCount(); i++) {
            tablaInventario.getColumnModel().getColumn(i).setPreferredWidth(250);
        }
        
    }
    
    public void EliminarProducto(int id) throws IOException, ParseException {
    File inputFile = new File("Productos.txt");
    File tempFile = new File("temp.txt");

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

        String lineToRemove = Integer.toString(id);
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
 
   public static void EditarProducto(Producto producto) {
    int id = producto.getId();
     
    try {
        // Leer el fichero y almacenar los datos temporalmente
        ArrayList<String> lineas = new ArrayList<>();
        BufferedReader reader;
         reader = new BufferedReader(new FileReader("Productos.txt"));
        String linea;

        while ((linea = reader.readLine()) != null) {
            lineas.add(linea);
        }

        reader.close();

        // Realizar las ediciones necesarias
       for (int i = 0; i < lineas.size(); i++) {
    String[] datosProducto = lineas.get(i).split(",");
    
    int idProducto = Integer.parseInt(datosProducto[0]);

    if (idProducto == id) {
        // Utiliza los datos del objeto 'producto' para crear el Producto actualizado
        Producto productoActualizado = new Producto(
            id,
            producto.getNombre(),
            producto.getCategoria(),
            producto.getPrecio(),
            producto.getCantidad(),
            producto.getEstado()
        );

        // Reemplazar la línea del fichero con la información del nuevo objeto Producto
        lineas.set(i, productoActualizado.String());
    }
}


        // Escribir los datos actualizados en el fichero
        BufferedWriter writer = new BufferedWriter(new FileWriter("Productos.txt"));
        for (String lineaActualizada : lineas) {
            writer.write(lineaActualizada + System.getProperty("line.separator"));
        }

        writer.close();

        System.out.println("Producto editado con éxito.");

    } catch (IOException e) {
        e.printStackTrace();
    }
}          
}
