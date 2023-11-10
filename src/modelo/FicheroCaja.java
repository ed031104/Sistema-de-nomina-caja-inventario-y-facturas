
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

public class FicheroCaja {
     
    public void Ingresarficheroregistros(Caja caja){
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("caja.txt" , true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personalesp
            Rg.print(caja.getNumeroFactura()+",");
            Rg.print(caja.getDate()+",");
            
            Rg.print(caja.getCliente().getId()+",");
            Rg.print(caja.getCliente().getNombres()+",");
            Rg.print(caja.getCliente().getApellidos()+",");
            Rg.print(caja.getCliente().getDireccion()+",");
            Rg.print(caja.getCliente().getCedula()+",");
            Rg.print(caja.getCliente().getSexo()+",");
            Rg.print(caja.getCliente().getCorreo()+",");
            Rg.print(caja.getCliente().getTelefono()+",");
            
            Rg.print(caja.getSubTotal()+",");
            
            Rg.print(caja.getTotal()+",");
            
            Rg.print(caja.getVuelto()+",");
            
            for(int i = 0 ; i < caja.getProducto().size(); i++){
                Producto producto = caja.getProducto().get(i);
                Rg.print(producto.getId() +",");
                Rg.print(producto.getNombre()+",");
                Rg.print(producto.getCategoria()+",");
                Rg.print(producto.getPrecio()+",");
                Rg.print(producto.getCantidad()+",");
                Rg.print(producto.getEstado()+",");
            }
            
            Rg.print("\n");
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
        
    }
    
    public ArrayList<Caja> leerCajasDesdeArchivo() {
        ArrayList<Caja> cajas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("caja.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                
                
                // Aquí asumimos que los datos en cada línea están en el mismo orden que al escribirlos en Ingresarficheroregistros
                int numeroFactura = Integer.parseInt(datos[0]);
                String fecha = datos[1];
                
                int idCliente = Integer.parseInt(datos[2]);
                String nombresCliente = datos[3];
                String apellidosCliente = datos[4];
                String direccionCliente = datos[5];
                String cedulaCliente = datos[6];
                String sexoCliente = datos[7];
                String correoCliente = datos[8];
                int telefonoCliente = Integer.parseInt(datos[9]);
                
                double subTotal = Double.parseDouble(datos[10]);
                double total = Double.parseDouble(datos[11]);
                double vuelto = Double.parseDouble(datos[12]);

                // Crear un objeto Cliente y un objeto Caja con los datos leídos
                Clientes cliente = new Clientes(idCliente, nombresCliente, apellidosCliente, direccionCliente,
                        cedulaCliente, sexoCliente, correoCliente, telefonoCliente);
                
                Caja caja = new Caja(numeroFactura, fecha, cliente, subTotal, total, vuelto, new ArrayList<>());

                // Leer productos desde los datos restantes
                for (int i = 13; i < datos.length; i += 6) {
                    int idProducto = Integer.parseInt(datos[i]);
                    String nombreProducto = datos[i + 1];
                    String categoriaProducto = datos[i + 2];
                    double precioProducto = Double.parseDouble(datos[i + 3]);
                    int cantidadProducto = Integer.parseInt(datos[i + 4]);
                    String estadoProducto = datos[i + 5];

                    Producto producto = new Producto(idProducto, nombreProducto, categoriaProducto,
                            precioProducto, cantidadProducto, estadoProducto);

                    // Agregar el producto a la lista de productos en la caja
                    caja.getProducto().add(producto);
                }

                // Agregar la caja al array de cajas
                cajas.add(caja);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return cajas;
    }

    public DefaultListModel <Caja> llenarJlist() throws IOException, ParseException{
    
        DefaultListModel<Caja> flm = new DefaultListModel<>();
        
        
        for(Caja caja : leerCajasDesdeArchivo()){
            flm.addElement(caja);
        }
        return flm;
    }
    
}
