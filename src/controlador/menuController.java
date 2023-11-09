package controlador;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.ParseException;
import javax.swing.JPanel;
import modelo.FicheroCliente;
import modelo.FicheroEmpleado;
import modelo.FicheroNomina;
import modelo.FicheroProducto;
import vista.Caja;
import vista.Factura;
import vista.Inventario;
import vista.Menu;
import vista.datosNominas;
import vista.RegistroEmpleados;
import vista.RegistroNomina;
import vista.registroClientes;

public class menuController implements ActionListener{

    private Menu vista; 
    
    datosNominas panelNomina = new datosNominas();
    FicheroNomina ficheroNomina  = new FicheroNomina();
    RegistroNomina panelRegistroNomina= new RegistroNomina();
    RegistroEmpleados panelempleados = new RegistroEmpleados();
    FicheroEmpleado ficheroEmpelado = new FicheroEmpleado();
    
    FicheroProducto ficheroProducto = new FicheroProducto();
    Caja panelCaja = new Caja();
    
    
    Factura panelFactura = new Factura();
    
    Inventario panelInventario = new Inventario();
    
    registroClientes panelClientes = new registroClientes();
    FicheroCliente ficheroCliente = new FicheroCliente();
    
    
    public menuController(Menu vista){
    this.vista = vista;
    this.vista.btnNomina.addActionListener(this);
    this.vista.btnInventario.addActionListener(this);
    this.vista.btnClientes.addActionListener(this);
    this.vista.btnCaja.addActionListener(this);
    this.vista.brnMenu.addActionListener(this);
    this.vista.Opcmenu1.addActionListener(this);
    this.vista.btnRegistroNomina.addActionListener(this);
    this.vista.btnEmpleados.addActionListener(this);
    this.vista.btnFactura.addActionListener(this);
      
    
    }
    
    public void iniciar() throws IOException, ParseException{
        vista.setLocationRelativeTo(null);
        vista.setTitle("Sistema Ferretería Mirna Perez");
        vista.setIconImage(vista.getIconImage());
         ControladorNomina ControladorNomina = new ControladorNomina(panelNomina, ficheroNomina);
         ControladorRegistroNomina controladorRegistroNomina = new ControladorRegistroNomina(panelRegistroNomina, ficheroNomina, ControladorNomina);
         ControladorRegitroEmpleado ControladorRegitroEmpleado = new ControladorRegitroEmpleado(panelempleados, ficheroEmpelado, controladorRegistroNomina );
           
         ControladorRecibo ControladorRecibo = new ControladorRecibo(panelFactura);
         ControladorCaja ControladorCaja = new ControladorCaja(panelCaja, ControladorRecibo, ficheroProducto, ficheroCliente);
         ControladorRegistroCliente ControladorRegistroCliente = new ControladorRegistroCliente(panelClientes, ficheroCliente, ControladorCaja);
         ControladorInventario ControladorInventario = new ControladorInventario(panelInventario, ficheroProducto, ControladorCaja);
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
