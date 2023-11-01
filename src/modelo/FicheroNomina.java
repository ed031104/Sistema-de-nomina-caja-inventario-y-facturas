package modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class FicheroNomina {
    
    public void Ingresarficheroregistros(Nomina nomina){
        
        nomina.valorHoras();
        nomina.pagoHoras();
        nomina.HorasExtras();
        nomina.pagoExtras();
        nomina.pagoantiguedad();
        nomina.salariobruto();
        nomina.inss();
        nomina.calculoir();
        nomina.totaldeducciones();
        calculonomina.salarioneto(registro);
        calculonomina.inssp(registro);
        calculonomina.inatec(registro);
        FileWriter fw = null;
        try{
            fw = new FileWriter("nominas.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter Rg = new PrintWriter (bw);
            Rg.close();
            
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
        }
    }
}
