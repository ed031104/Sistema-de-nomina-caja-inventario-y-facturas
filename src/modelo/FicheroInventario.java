package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FicheroInventario {
    
     public void crearFichero(Producto producto) {
        FileWriter fl = null;
        
        try {
            fl = new FileWriter("Producto.txt", true);
            BufferedWriter bw = new BufferedWriter(fl);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.print( producto.getNombre()+",");
            pw.print( producto.getCategoria()+",");
            pw.print( producto.getEstado()+",");
            pw.print( producto.getPrecio()+",");
            pw.print( producto.getCantidad()+",");
            pw.print( producto.getId()+"\n");
            
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
     
     public ArrayList<Producto> ExtraerDatos() throws IOException {
    ArrayList<Producto> listaProducto = new ArrayList<>();
    BufferedReader br = new BufferedReader(new FileReader("Producto.txt"));
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas

        if (datos.length >= 6) {
            String nombre = datos[0];
            String categoria = datos[1];
            double precio = Double.parseDouble(datos[2]);
            int cantidad  = Integer.parseInt(datos[3]);
            int Id = Integer.parseInt(datos[4]);
            String estado = datos[5];
            
            Producto producto = new Producto(nombre, categoria, precio, cantidad, Id, estado);
            listaProducto.add(producto);
        }
    }

    // Devuelve la lista de clientes
    return listaProducto;
}
   
    public DefaultTableModel mostrarDatosTabla() throws IOException {
    ArrayList<Producto> producto = ExtraerDatos();
    
    if (producto == null) {
        // Manejar el caso en el que la lista de clientes sea nula (por ejemplo, lanzar una excepción).
        throw new RuntimeException("No se pudieron extraer los datos de clientes.");
    }
    
    DefaultTableModel modeloTabla = new DefaultTableModel();
    modeloTabla.addColumn("Nombre");
    modeloTabla.addColumn("Categoria");
    modeloTabla.addColumn("Precio");
    modeloTabla.addColumn("Cantodad");
    modeloTabla.addColumn("ID");
    modeloTabla.addColumn("Estado");

    // Agregar datos al modelo de tabla
    for (Producto productos : producto) {
        Object[] fila = {productos.getNombre(), productos.getCategoria(), productos.getPrecio(), productos.getCantidad()
        , productos.getId(), productos.getEstado()};
        modeloTabla.addRow(fila);
        }
        return modeloTabla; 
    }
 
    public DefaultComboBoxModel llenarComboBox() throws IOException  {
        
    DefaultComboBoxModel<Producto> dcm = new DefaultComboBoxModel<>();
    ArrayList<Producto> listaproducto = new ArrayList<>();
       
    //se llena el array listaclientes con la infromacion del fichero
    listaproducto = ExtraerDatos();
    
    if (listaproducto != null) { // Verificar si la lista no es nula
        for (Producto Productos : listaproducto) {
            dcm.addElement(Productos);
        }
        //se devuelve la lista
        return dcm;
    } else {
        JOptionPane.showMessageDialog(null, "No hay producto registrado.");
        // Manejar el caso en el que la lista sea nula o esté vacía Puedes mostrar un mensaje o realizar una acción apropiada.
    }
    return null;
}
    
}
