
package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import modelo.Clientes;
import modelo.Producto;

public class Caja extends javax.swing.JPanel {

    public Caja() {
        initComponents();
                  tablaProductos.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        tablaProductos.getTableHeader().setOpaque(false);
        tablaProductos.getTableHeader().setBackground(new Color(32, 136, 203));
        tablaProductos.getTableHeader().setForeground(new Color(255,255,255));
        tablaProductos.setRowHeight(50);

        
    // Configurar el renderizador para centrar el texto en toda la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tablaProductos.setDefaultRenderer(Object.class, centerRenderer);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas2 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel1 = new javax.swing.JLabel();
        jpanelEsquinasRedondas3 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JList<>();
        lblSubTotal = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jcbClientes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEfectivo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));

        jpanelEsquinasRedondas2.setBackground(new java.awt.Color(32, 136, 203));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caja-registradora-30 (1).png"))); // NOI18N
        jLabel1.setText("Caja");

        javax.swing.GroupLayout jpanelEsquinasRedondas2Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas2);
        jpanelEsquinasRedondas2.setLayout(jpanelEsquinasRedondas2Layout);
        jpanelEsquinasRedondas2Layout.setHorizontalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas2Layout.setVerticalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelEsquinasRedondas3.setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setText("TOTAL:");

        jLabel3.setText("SUB TOTAL:");

        jLabel4.setText("PRODUCTOS:");

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setBorder(null);

        listaProductos.setBackground(new java.awt.Color(242, 242, 242));
        listaProductos.setFocusable(false);
        listaProductos.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(listaProductos);

        lblSubTotal.setText("0.00 C$");

        lblTotal.setText("0.00C$");

        javax.swing.GroupLayout jpanelEsquinasRedondas3Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas3);
        jpanelEsquinasRedondas3.setLayout(jpanelEsquinasRedondas3Layout);
        jpanelEsquinasRedondas3Layout.setHorizontalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas3Layout.setVerticalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSubTotal))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblTotal))
                .addGap(24, 24, 24))
        );

        jLabel8.setText("Cliente:");

        jLabel9.setText("Efectivo");

        txtEfectivo.setText("C$");

        jScrollPane3.setBorder(null);
        jScrollPane3.setFocusable(false);
        jScrollPane3.setInheritsPopupMenu(true);

        tablaProductos.setBackground(new java.awt.Color(255, 255, 255));
        tablaProductos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fernando", "Ing", "12000", "2", null},
                {"2", "Juan", "Contador", "8000", "3", null},
                {"3", "Pedro", "Gerente", "50000", "4", null},
                {"4", "Iasaías", "Caja", "10000", "5", null},
                {"5", "Michael", "Limpieza", "2000", "7", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "CATEGORIA", "PRECIO", "SUELDO MENSUAL", "ID", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaProductos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tablaProductos.setFocusable(false);
        tablaProductos.setGridColor(new java.awt.Color(204, 204, 204));
        tablaProductos.setRequestFocusEnabled(false);
        tablaProductos.setRowHeight(30);
        tablaProductos.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tablaProductos.setShowVerticalLines(false);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaProductos);
        if (tablaProductos.getColumnModel().getColumnCount() > 0) {
            tablaProductos.getColumnModel().getColumn(0).setMinWidth(350);
            tablaProductos.getColumnModel().getColumn(1).setMinWidth(350);
            tablaProductos.getColumnModel().getColumn(2).setMinWidth(350);
            tablaProductos.getColumnModel().getColumn(3).setMinWidth(350);
            tablaProductos.getColumnModel().getColumn(4).setMinWidth(350);
            tablaProductos.getColumnModel().getColumn(5).setMinWidth(350);
        }

        btnAgregarProducto.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-compra-30.png"))); // NOI18N
        btnAgregarProducto.setContentAreaFilled(false);
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.setFocusable(false);

        btnCompra.setBackground(new java.awt.Color(255, 255, 255));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-comprar-por-monedas-30.png"))); // NOI18N
        btnCompra.setDefaultCapable(false);
        btnCompra.setFocusPainted(false);
        btnCompra.setFocusable(false);
        btnCompra.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jcbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel9))
                            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompra))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarProducto)
                            .addComponent(btnCompra)
                            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jcbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JComboBox<Clientes> jcbClientes;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas2;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas3;
    public javax.swing.JLabel lblSubTotal;
    public javax.swing.JLabel lblTotal;
    public javax.swing.JList<Producto> listaProductos;
    public javax.swing.JTable tablaProductos;
    public javax.swing.JTextField txtEfectivo;
    // End of variables declaration//GEN-END:variables
}
