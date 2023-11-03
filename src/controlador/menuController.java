package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import vista.AsientoContable;
import vista.Caja;
import vista.Factura;
import vista.Inventario;
import vista.Menu;
import vista.Nomina;
import vista.RegistroEmpleados;
import vista.RegistroNomina;
import vista.registroClientes;

public class menuController implements ActionListener{

    private Menu vista; 
    
    Nomina panelNomina = new Nomina();
    registroClientes panelClientes = new registroClientes();
    RegistroEmpleados panelempleados = new RegistroEmpleados();
    Caja panelCaja = new Caja();
    RegistroNomina panelRegistroNomina= new RegistroNomina();
    Inventario panelInventario = new Inventario();
    AsientoContable panelAsientoContable = new AsientoContable();
    Factura panelFactura = new Factura();
    
    public menuController(Menu vista){
    this.vista = vista;
    this.vista.btnNomina.addActionListener(this);
    this.vista.btnAsientoContable.addActionListener(this);
    this.vista.btnInventario.addActionListener(this);
    this.vista.btnClientes.addActionListener(this);
    this.vista.btnCaja.addActionListener(this);
    this.vista.brnMenu.addActionListener(this);
    this.vista.Opcmenu1.addActionListener(this);
    this.vista.btnRegistroNomina.addActionListener(this);
    this.vista.btnEmpleados.addActionListener(this);
    this.vista.btnFactura.addActionListener(this);
      
    
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setTitle("Sistema Mirna Perez");
        vista.setIconImage(vista.getIconImage());
        
         ControladorRegitroEmpleado ControladorRegitroEmpleado = new ControladorRegitroEmpleado();
         ControladorNomina ControladorNomina = new ControladorNomina(ControladorRegitroEmpleado);
         ControladorAsientoContable ControladorAsientoContable = new ControladorAsientoContable(ControladorNomina);
         
         ControladorRegistroCliente ControladorRegistroCliente = new ControladorRegistroCliente();
         ControladorInventario ControladorInventario = new ControladorInventario();
         ControladorCaja ControladorCaja = new ControladorCaja(ControladorRegistroCliente, ControladorInventario);
         ControladorRecibo ControladorRecibo = new ControladorRecibo(ControladorCaja);
        
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
         cambiarPanel(vista.content, panelAsientoContable);   
        }
        if(e.getSource() == vista.btnInventario){
            cambiarPanel(vista.content, panelInventario);
        }
        if(e.getSource() == vista.btnClientes){
            cambiarPanel(vista.content, panelClientes);
        }
        if(e.getSource() == vista.btnEmpleados){
            cambiarPanel(vista.content, panelempleados);
        }
        if(e.getSource() == vista.btnCaja){
           cambiarPanel(vista.content, panelCaja);
        }
        if(e.getSource() == vista.btnRegistroNomina){
            cambiarPanel(vista.content, panelRegistroNomina);
        }
        if(e.getSource() == vista.btnFactura){
            cambiarPanel(vista.content, panelFactura);
        }
    }
    
}
