package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import vista.Menu;
import vista.Nomina;

public class menuController implements ActionListener{

    private Menu vista; 
    Nomina panelNomina = new Nomina();
    

    
    public menuController(Menu vista){
    this.vista = vista;
    this.vista.btnNomina.addActionListener(this);
    this.vista.btnAsientoContable.addActionListener(this);
    this.vista.btnInventario.addActionListener(this);
    this.vista.btnClientes.addActionListener(this);
    this.vista.btnCaja.addActionListener(this);
    this.vista.brnMenu.addActionListener(this);
    this.vista.Opcmenu1.addActionListener(this);
      
    
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setTitle("SNCIF");
        vista.setIconImage(vista.getIconImage());
    }
    public void cambiarPanel(JPanel content,JPanel jp) {
    jp.setVisible(true); // hace visible al panel
    jp.setSize(684, 300); // da el tamaño del panel
    jp.setLocation(0, 0); // centra el panel

    content.removeAll(); // esto elimina lo que se encontraba en content
    content.setLayout(new BorderLayout()); // Establecer el LayoutManager del contenedor Content en BorderLayout
    content.add(jp, BorderLayout.CENTER); // Agregar el panel principal al centro del contenedor Content
    jp.setPreferredSize(content.getSize()); // Asegurarse de que el panel principal ocupe todo el espacio disponible

    content.revalidate(); // notifica al contenedor Content que su diseño ha cambiado y necesita ser validado.
    content.repaint(); // repinta el contenedor Content para que se muestren los cambios realizados.
     }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.brnMenu){
           vista.popupMenu.show(vista.brnMenu, 0, vista.brnMenu.getHeight());
        }
        if(e.getSource() == vista.Opcmenu1){
           System.exit(0);
        }
        if(e.getSource() == vista.btnNomina){
            cambiarPanel(vista.content, panelNomina);
        }
        if(e.getSource() == vista.btnAsientoContable){
        }
        if(e.getSource() == vista.btnInventario){
        }
        if(e.getSource() == vista.btnClientes){
        }
        if(e.getSource() == vista.btnCaja){
        }
    }
    
}
