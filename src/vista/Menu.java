
package vista;

import controlador.menuController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.text.ParseException;

public class Menu extends javax.swing.JFrame {

   
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu = new javax.swing.JPopupMenu();
        Opcmenu1 = new javax.swing.JMenuItem();
        background = new Estilos_panel.jpanelEsquinasRedondas();
        menu = new Estilos_panel.jpanelEsquinasRedondas();
        bgNomina = new Estilos_panel.jpanelEsquinasRedondas();
        btnNomina = new javax.swing.JButton();
        bgInventario = new Estilos_panel.jpanelEsquinasRedondas();
        btnInventario = new javax.swing.JButton();
        bgClientes = new Estilos_panel.jpanelEsquinasRedondas();
        btnClientes = new javax.swing.JButton();
        bgCaja = new Estilos_panel.jpanelEsquinasRedondas();
        btnCaja = new javax.swing.JButton();
        bgRegistroNomina = new Estilos_panel.jpanelEsquinasRedondas();
        btnRegistroNomina = new javax.swing.JButton();
        bgEmpleados = new Estilos_panel.jpanelEsquinasRedondas();
        btnEmpleados = new javax.swing.JButton();
        bgFactura = new Estilos_panel.jpanelEsquinasRedondas();
        btnFactura = new javax.swing.JButton();
        content = new Estilos_panel.jpanelEsquinasRedondas();
        header = new Estilos_panel.jpanelEsquinasRedondas();
        brnMenu = new javax.swing.JButton();
        panelFoto = new Estilos_panel.jPanelRedondo();
        txtNombre = new javax.swing.JLabel();
        txtCargo = new javax.swing.JLabel();

        popupMenu.setBackground(new java.awt.Color(255, 255, 255));

        Opcmenu1.setBackground(new java.awt.Color(255, 255, 255));
        Opcmenu1.setText("salir");
        popupMenu.add(Opcmenu1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1250, 740));
        setPreferredSize(new java.awt.Dimension(0, 0));
        setSize(new java.awt.Dimension(0, 0));

        background.setBackground(new java.awt.Color(242, 242, 242));
        background.setPreferredSize(new java.awt.Dimension(0, 0));

        menu.setBackground(new java.awt.Color(51, 51, 51));

        bgNomina.setBackground(new java.awt.Color(51, 51, 51));

        btnNomina.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pila-de-monedas-30.png"))); // NOI18N
        btnNomina.setToolTipText("Nomina");
        btnNomina.setBorder(null);
        btnNomina.setBorderPainted(false);
        btnNomina.setContentAreaFilled(false);
        btnNomina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNomina.setDefaultCapable(false);
        btnNomina.setFocusPainted(false);
        btnNomina.setFocusable(false);
        btnNomina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNomina.setIconTextGap(0);
        btnNomina.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnNomina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNominaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNominaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgNominaLayout = new javax.swing.GroupLayout(bgNomina);
        bgNomina.setLayout(bgNominaLayout);
        bgNominaLayout.setHorizontalGroup(
            bgNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgNominaLayout.setVerticalGroup(
            bgNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgNominaLayout.createSequentialGroup()
                .addComponent(btnNomina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgInventario.setBackground(new java.awt.Color(51, 51, 51));

        btnInventario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-inventario-30.png"))); // NOI18N
        btnInventario.setToolTipText("Inventario");
        btnInventario.setBorder(null);
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInventario.setDefaultCapable(false);
        btnInventario.setFocusPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInventario.setIconTextGap(0);
        btnInventario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnInventario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgInventarioLayout = new javax.swing.GroupLayout(bgInventario);
        bgInventario.setLayout(bgInventarioLayout);
        bgInventarioLayout.setHorizontalGroup(
            bgInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgInventarioLayout.setVerticalGroup(
            bgInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgInventarioLayout.createSequentialGroup()
                .addComponent(btnInventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgClientes.setBackground(new java.awt.Color(51, 51, 51));

        btnClientes.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-añadir-usuario-masculino-30.png"))); // NOI18N
        btnClientes.setToolTipText("Clientes");
        btnClientes.setBorder(null);
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnClientes.setDefaultCapable(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setIconTextGap(0);
        btnClientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgClientesLayout = new javax.swing.GroupLayout(bgClientes);
        bgClientes.setLayout(bgClientesLayout);
        bgClientesLayout.setHorizontalGroup(
            bgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgClientesLayout.setVerticalGroup(
            bgClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgClientesLayout.createSequentialGroup()
                .addComponent(btnClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgCaja.setBackground(new java.awt.Color(51, 51, 51));

        btnCaja.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caja-registradora-30 (1).png"))); // NOI18N
        btnCaja.setToolTipText("Caja");
        btnCaja.setBorder(null);
        btnCaja.setBorderPainted(false);
        btnCaja.setContentAreaFilled(false);
        btnCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCaja.setDefaultCapable(false);
        btnCaja.setFocusPainted(false);
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setIconTextGap(0);
        btnCaja.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCajaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgCajaLayout = new javax.swing.GroupLayout(bgCaja);
        bgCaja.setLayout(bgCajaLayout);
        bgCajaLayout.setHorizontalGroup(
            bgCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgCajaLayout.setVerticalGroup(
            bgCajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCajaLayout.createSequentialGroup()
                .addComponent(btnCaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgRegistroNomina.setBackground(new java.awt.Color(51, 51, 51));
        bgRegistroNomina.setToolTipText("");

        btnRegistroNomina.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnRegistroNomina.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-agregar-propiedad-30.png"))); // NOI18N
        btnRegistroNomina.setToolTipText("Registro de nomina");
        btnRegistroNomina.setBorder(null);
        btnRegistroNomina.setBorderPainted(false);
        btnRegistroNomina.setContentAreaFilled(false);
        btnRegistroNomina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistroNomina.setDefaultCapable(false);
        btnRegistroNomina.setFocusPainted(false);
        btnRegistroNomina.setFocusable(false);
        btnRegistroNomina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroNomina.setIconTextGap(0);
        btnRegistroNomina.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRegistroNomina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistroNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroNominaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroNominaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgRegistroNominaLayout = new javax.swing.GroupLayout(bgRegistroNomina);
        bgRegistroNomina.setLayout(bgRegistroNominaLayout);
        bgRegistroNominaLayout.setHorizontalGroup(
            bgRegistroNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistroNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgRegistroNominaLayout.setVerticalGroup(
            bgRegistroNominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRegistroNominaLayout.createSequentialGroup()
                .addComponent(btnRegistroNomina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgEmpleados.setBackground(new java.awt.Color(51, 51, 51));

        btnEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-abogado-30.png"))); // NOI18N
        btnEmpleados.setToolTipText("Empleados");
        btnEmpleados.setBorder(null);
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.setContentAreaFilled(false);
        btnEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpleados.setDefaultCapable(false);
        btnEmpleados.setFocusPainted(false);
        btnEmpleados.setFocusable(false);
        btnEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setIconTextGap(0);
        btnEmpleados.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnEmpleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgEmpleadosLayout = new javax.swing.GroupLayout(bgEmpleados);
        bgEmpleados.setLayout(bgEmpleadosLayout);
        bgEmpleadosLayout.setHorizontalGroup(
            bgEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgEmpleadosLayout.setVerticalGroup(
            bgEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEmpleadosLayout.createSequentialGroup()
                .addComponent(btnEmpleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgFactura.setBackground(new java.awt.Color(51, 51, 51));
        bgFactura.setToolTipText("");

        btnFactura.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-recibo-aprobado-30 (1).png"))); // NOI18N
        btnFactura.setToolTipText("Factura");
        btnFactura.setBorder(null);
        btnFactura.setBorderPainted(false);
        btnFactura.setContentAreaFilled(false);
        btnFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFactura.setDefaultCapable(false);
        btnFactura.setFocusPainted(false);
        btnFactura.setFocusable(false);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFactura.setIconTextGap(0);
        btnFactura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFacturaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout bgFacturaLayout = new javax.swing.GroupLayout(bgFactura);
        bgFactura.setLayout(bgFacturaLayout);
        bgFacturaLayout.setHorizontalGroup(
            bgFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        bgFacturaLayout.setVerticalGroup(
            bgFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgFacturaLayout.createSequentialGroup()
                .addComponent(btnFactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(bgNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgRegistroNomina, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bgFactura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(bgNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(bgEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgRegistroNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        header.setBackground(new java.awt.Color(255, 255, 255));

        brnMenu.setBackground(new java.awt.Color(255, 255, 255));
        brnMenu.setFont(new java.awt.Font("sansserif", 0, 27)); // NOI18N
        brnMenu.setForeground(new java.awt.Color(51, 51, 51));
        brnMenu.setText("☰");
        brnMenu.setBorder(null);
        brnMenu.setBorderPainted(false);
        brnMenu.setContentAreaFilled(false);

        panelFoto.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        txtNombre.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtNombre.setText("Nombre");

        txtCargo.setBackground(new java.awt.Color(51, 51, 51));
        txtCargo.setForeground(new java.awt.Color(153, 153, 153));
        txtCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtCargo.setText("Cargo");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(brnMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brnMenu)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelFoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerLayout.createSequentialGroup()
                            .addComponent(txtNombre)
                            .addGap(0, 0, 0)
                            .addComponent(txtCargo))))
                .addContainerGap())
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 594, Short.MAX_VALUE)
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnNominaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNominaMouseEntered
        bgNomina.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnNominaMouseEntered

    private void btnNominaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNominaMouseExited
        bgNomina.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnNominaMouseExited

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        bgInventario.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
        bgInventario.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnInventarioMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        bgClientes.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        bgClientes.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnCajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseEntered
        bgCaja.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnCajaMouseEntered

    private void btnCajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseExited
        bgCaja.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnCajaMouseExited

    private void btnRegistroNominaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroNominaMouseEntered
        bgRegistroNomina.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnRegistroNominaMouseEntered

    private void btnRegistroNominaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroNominaMouseExited
        bgRegistroNomina.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnRegistroNominaMouseExited

    private void btnEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseEntered
        bgEmpleados.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnEmpleadosMouseEntered

    private void btnEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseExited
        bgEmpleados.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnEmpleadosMouseExited

    private void btnFacturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseEntered
        bgFactura.setBackground(new Color(75,75,75));
    }//GEN-LAST:event_btnFacturaMouseEntered

    private void btnFacturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturaMouseExited
        bgFactura.setBackground(new Color(51,51,51));                                          
    }//GEN-LAST:event_btnFacturaMouseExited

    
    public static void main(String[] args) throws IOException, ParseException {
        Menu vista = new Menu();
        
        //Abre el frame principal "Menu" y se inicializa sun controlador 
        menuController contorladorMenu = new menuController(vista);
        contorladorMenu.iniciar();
        vista.setVisible(true);
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem Opcmenu1;
    private Estilos_panel.jpanelEsquinasRedondas background;
    public Estilos_panel.jpanelEsquinasRedondas bgCaja;
    public Estilos_panel.jpanelEsquinasRedondas bgClientes;
    public Estilos_panel.jpanelEsquinasRedondas bgEmpleados;
    public Estilos_panel.jpanelEsquinasRedondas bgFactura;
    public Estilos_panel.jpanelEsquinasRedondas bgInventario;
    public Estilos_panel.jpanelEsquinasRedondas bgNomina;
    public Estilos_panel.jpanelEsquinasRedondas bgRegistroNomina;
    public javax.swing.JButton brnMenu;
    public javax.swing.JButton btnCaja;
    public javax.swing.JButton btnClientes;
    public javax.swing.JButton btnEmpleados;
    public javax.swing.JButton btnFactura;
    public javax.swing.JButton btnInventario;
    public javax.swing.JButton btnNomina;
    public javax.swing.JButton btnRegistroNomina;
    public Estilos_panel.jpanelEsquinasRedondas content;
    private Estilos_panel.jpanelEsquinasRedondas header;
    private Estilos_panel.jpanelEsquinasRedondas menu;
    public Estilos_panel.jPanelRedondo panelFoto;
    public javax.swing.JPopupMenu popupMenu;
    public javax.swing.JLabel txtCargo;
    public javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logoInicio.png"));
        return retValue;
    }

}
