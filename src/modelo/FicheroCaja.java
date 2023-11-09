
package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FicheroCaja {
     
    public void Ingresarficheroregistros(Caja caja){
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("caja.txt" , true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            //Datos personales
            Rg.print(caja.getCliente()+",");
            Rg.print(caja.getSubTotal()+",");
            Rg.print(caja.getTotal()+",");
            Rg.print(caja.getVuelto()+",");
            Rg.print(caja.getProducto()+"\n");
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
}
