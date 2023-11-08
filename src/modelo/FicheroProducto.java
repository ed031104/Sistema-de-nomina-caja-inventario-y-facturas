
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

public class FicheroProducto {

 public void Ingresarficheroregistros(Producto producto){
     
        producto.estadoProducto(producto);
     
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("Productos.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personales
            Rg.print(producto.getNombre()+",");
            Rg.print(producto.getCategoria()+",");
            Rg.print(producto.getPrecio()+",");
            Rg.print(producto.getCantidad()+",");
            Rg.print(producto.getId()+",");
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
            
            String nombre = datos[0];
            String categoria = datos[1];
            double Precio = Double.parseDouble(datos[2]);
            int Cantidad = Integer.parseInt(datos[3]);
            int id = Integer.parseInt(datos[4]);
            String Estado = datos[5];
            
            Producto producto = new Producto(nombre, categoria, Precio, Cantidad, id, Estado);
            listaProductos.add(producto);
        }
    }

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
        
        dtm.addColumn("NOMBRE");
        dtm.addColumn("CATEGORIA");
        dtm.addColumn("PRECIO");
        dtm.addColumn("CANTIDAD");
        dtm.addColumn("ID");
        dtm.addColumn("ESTADO");
        
        ArrayList<Producto> Listaproducto = extraerProductosFicheros();
        
        if(Listaproducto != null){
            
        for(Producto productos : Listaproducto){
            
            Object[] fila = {productos.getNombre(), productos.getCategoria(), productos.getPrecio(), productos.getCantidad(), productos.getId()
            , productos.getEstado()};
            dtm.addRow(fila);
            
            }
        }
        
        tablaInventario.setModel(dtm);
        for (int i = 0; i < tablaInventario.getColumnCount(); i++) {
            tablaInventario.getColumnModel().getColumn(i).setPreferredWidth(250);
        }
        
    }
}
