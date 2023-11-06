
package controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.FicheroNomina;
import modelo.Nomina;
import vista.datosNominas;

public class ControladorNomina implements ActionListener{

    datosNominas vista;
    FicheroNomina fichero;
    
    ControladorNomina(datosNominas vista , FicheroNomina fichero) throws IOException {
        this.fichero = fichero;
        this.vista = vista;
        vista.tablaNomina.setModel(fichero.llenarTabla());
        vista.tablaNomina.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        cambiarTamañoColumnasTabla(vista.tablaNomina, 230);
        
        //cambia el color a columnas de la Tabla Nomina
        applyColorToColumn(vista.tablaNomina, 3, Color.green);
        applyColorToColumn(vista.tablaNomina, 5, Color.green);
        applyColorToColumn(vista.tablaNomina, 7, Color.green);
        applyColorToColumn(vista.tablaNomina, 8, Color.green);
        applyColorToColumn(vista.tablaNomina, 9, Color.green);
        applyColorToColumn(vista.tablaNomina, 10, Color.red);
        applyColorToColumn(vista.tablaNomina, 11, Color.red);
        applyColorToColumn(vista.tablaNomina, 12, Color.red);
        applyColorToColumn(vista.tablaNomina, 13, Color.gray);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

  // Método para aplicar color a una columna específica
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
