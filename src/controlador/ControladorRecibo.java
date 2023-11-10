
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Caja;
import modelo.FicheroCaja;
import modelo.Producto;
import vista.Factura;

public class ControladorRecibo implements ActionListener{
    
    Factura panelFactura;
    FicheroCaja ficehro = new FicheroCaja();
    
    ControladorRecibo(Factura panelFactura) throws IOException, ParseException {
        this.panelFactura = panelFactura;
        panelFactura.listaFactura.setModel(ficehro.llenarJlist());
        
        this.panelFactura.listaFactura.addListSelectionListener(new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            try {listaFacturaValueChanged(e);} catch (IOException | ParseException ex) {
                Logger.getLogger(ControladorCaja.class.getName()).log(Level.SEVERE, null, ex);}}});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
     public void listaFacturaValueChanged(ListSelectionEvent e) throws IOException, ParseException{
        if (!e.getValueIsAdjusting()) {
            Caja factura = panelFactura.listaFactura.getSelectedValue();
                if (factura != null) {
                    panelFactura.txtFecha.setText(factura.getDate());
                    panelFactura.txtNumeroFactura.setText(String.valueOf(factura.getNumeroFactura()));
                    panelFactura.txtCliente.setText(factura.getCliente().getNombres());
                    panelFactura.lblSubtotal.setText(String.valueOf(factura.getSubTotal()));
                    panelFactura.lblTotal.setText(String.valueOf(factura.getTotal()));
                    
                    DefaultTableModel dftm = new DefaultTableModel();
                    
                    dftm.addColumn("ID");
                    dftm.addColumn("NOMBRE");
                    dftm.addColumn("CATEGORIA");
                    dftm.addColumn("PRECIO");
                    dftm.addColumn("CANTIDAD");
                    
                    for(Producto productos : factura.getProducto()){
                    Object[] fila = {productos.getId(), productos.getNombre(), productos.getCategoria(), productos.getPrecio(), productos.getCantidad()};
                    dftm.addRow(fila);
                    }
                    panelFactura.tablaProductos.setModel(dftm);
                    for (int i = 0; i < panelFactura.tablaProductos.getColumnCount(); i++) {
                    panelFactura.tablaProductos.getColumnModel().getColumn(i).setPreferredWidth(250);
                    }
                }
                    
            }
        }
     
}
