
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Factura;

public class ControladorRecibo implements ActionListener{
    
    Factura panelFactura;

    ControladorRecibo(Factura panelFactura) {
        this.panelFactura = panelFactura;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
