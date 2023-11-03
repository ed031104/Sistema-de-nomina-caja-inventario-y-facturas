
package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javafx.scene.AccessibleAttribute;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Nomina extends javax.swing.JPanel {

    public Nomina() {
        initComponents();
        
        
        
        tablaNomina.getTableHeader().setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));
        tablaNomina.getTableHeader().setOpaque(false);
        tablaNomina.getTableHeader().setBackground(new Color(32, 136, 203));
        tablaNomina.getTableHeader().setForeground(new Color(255,255,255));
        tablaNomina.setRowHeight(50);

        
    // Configurar el renderizador para centrar el texto en toda la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tablaNomina.setDefaultRenderer(Object.class, centerRenderer);
        
    
    // Aplicar color a filas específicas
        applyColorToColumn(tablaNomina, 3, Color.green);
        applyColorToColumn(tablaNomina, 5, Color.green);
        applyColorToColumn(tablaNomina, 7, Color.green);
        applyColorToColumn(tablaNomina, 8, Color.green);
        applyColorToColumn(tablaNomina, 9, Color.green);
        applyColorToColumn(tablaNomina, 10, Color.red);
        applyColorToColumn(tablaNomina, 11, Color.red);
        applyColorToColumn(tablaNomina, 12, Color.red);
        applyColorToColumn(tablaNomina, 13, Color.gray);
        applyColorToColumn(tablaNomina, 14, Color.green);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dashboard = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblSalarioMensual = new javax.swing.JLabel();
        lblInssLaboral = new javax.swing.JLabel();
        lblBaseImponible = new javax.swing.JLabel();
        lblSalarioAnual = new javax.swing.JLabel();
        lblDeducible = new javax.swing.JLabel();
        lblSalarioMenosDeducible = new javax.swing.JLabel();
        lblPorcentajeSegunLey = new javax.swing.JLabel();
        lblImpuestoBase = new javax.swing.JLabel();
        lblIrAnual = new javax.swing.JLabel();
        lblIrMensual = new javax.swing.JLabel();
        jpanelEsquinasRedondas2 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel2 = new javax.swing.JLabel();
        jpanelEsquinasRedondas3 = new Estilos_panel.jpanelEsquinasRedondas();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaNomina = new javax.swing.JTable();
        jpanelEsquinasRedondas4 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel23 = new javax.swing.JLabel();

        jScrollPane1.setBorder(null);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));
        dashboard.setPreferredSize(new java.awt.Dimension(1120, 521));

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cáculos de IR");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("(+) Salario Mensual en C$ :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(-) INSS Laboral (7%) : ");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("(=) Base imponible :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(x 12) Salario anual :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("(- Deducible) :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("(=) Salario menos el deducible :");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("(x_%_) Porcentaje aplicable según la ley :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(+) Impuesto Base según Ley :");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("(=) IR anual :");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("(Entre 12) IR mensual :");

        lblSalarioMensual.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioMensual.setText("0.00 C$");

        lblInssLaboral.setForeground(new java.awt.Color(255, 51, 51));
        lblInssLaboral.setText("0.00 C$");

        lblBaseImponible.setForeground(new java.awt.Color(255, 255, 255));
        lblBaseImponible.setText("0.00 C$");

        lblSalarioAnual.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioAnual.setText("0.00 C$");

        lblDeducible.setForeground(new java.awt.Color(255, 51, 51));
        lblDeducible.setText("0.00 C$");

        lblSalarioMenosDeducible.setForeground(new java.awt.Color(255, 255, 255));
        lblSalarioMenosDeducible.setText("0.00 C$");

        lblPorcentajeSegunLey.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcentajeSegunLey.setText("0.00 C$");

        lblImpuestoBase.setForeground(new java.awt.Color(255, 255, 255));
        lblImpuestoBase.setText("0.00 C$");

        lblIrAnual.setForeground(new java.awt.Color(255, 255, 255));
        lblIrAnual.setText("0.00 C$");

        lblIrMensual.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblIrMensual.setForeground(new java.awt.Color(0, 204, 102));
        lblIrMensual.setText("0.00 C$");

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalarioMensual)
                    .addComponent(lblInssLaboral)
                    .addComponent(lblBaseImponible)
                    .addComponent(lblSalarioAnual)
                    .addComponent(lblDeducible)
                    .addComponent(lblSalarioMenosDeducible)
                    .addComponent(lblPorcentajeSegunLey)
                    .addComponent(lblImpuestoBase)
                    .addComponent(lblIrAnual)
                    .addComponent(lblIrMensual))
                .addGap(22, 22, 22))
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblSalarioMensual))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblInssLaboral))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblBaseImponible))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSalarioAnual))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblDeducible))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblSalarioMenosDeducible))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblPorcentajeSegunLey))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblImpuestoBase))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lblIrAnual))
                .addGap(18, 18, 18)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblIrMensual))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jpanelEsquinasRedondas2.setBackground(new java.awt.Color(32, 136, 203));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pila-de-monedas-30.png"))); // NOI18N
        jLabel2.setText("Nómina");

        javax.swing.GroupLayout jpanelEsquinasRedondas2Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas2);
        jpanelEsquinasRedondas2.setLayout(jpanelEsquinasRedondas2Layout);
        jpanelEsquinasRedondas2Layout.setHorizontalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelEsquinasRedondas2Layout.setVerticalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpanelEsquinasRedondas3.setBackground(new java.awt.Color(32, 136, 203));

        jScrollPane3.setBorder(null);
        jScrollPane3.setFocusable(false);
        jScrollPane3.setOpaque(false);
        jScrollPane3.setRequestFocusEnabled(false);

        tablaNomina.setBackground(new java.awt.Color(255, 255, 255));
        tablaNomina.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        tablaNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Fernando", "Ing", "12000", "2", "1250", "2", "456456", "345345", "345", "345345", "345345", "354345", "345345", "34535"},
                {"2", "Juan", "Contador", "8000", "3", "1234", "3", "456456", "34535", "345345", "345354", "34535", "34545", "3454", "34535"},
                {"3", "Pedro", "Gerente", "50000", "4", "234", "6", "456", "3453534", "34535", "345345", "34535", "345345", "345345", "345345"},
                {"4", "Iasaías", "Caja", "10000", "5", "5345", "8", "456", "345345", "345345", "345354", "34535", "35435", "345345", "345345"},
                {"5", "Michael", "Limpieza", "2000", "7", "3453", "7", "456", "345345", "345345", "34535", "34535", "345354", "34535", null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO INSS", "NOMBRE", "CARGO", "SUELDO MENSUAL", "HORAS EXTRAS", "PAGO DE HORAS EXTRAS", "AÑOS ANTIGUEDAD", "PAGO POR ANTIGUEDAD", "BONO", "SALARIO BRUTO", "INSS LABORAL", "IR", "PRESTAMOS", "TOTAL DEDUCIONES", "NETO RECIBIR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaNomina.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaNomina.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tablaNomina.setFocusable(false);
        tablaNomina.setGridColor(new java.awt.Color(204, 204, 204));
        tablaNomina.setRequestFocusEnabled(false);
        tablaNomina.setRowHeight(30);
        tablaNomina.setSelectionBackground(new java.awt.Color(204, 255, 204));
        tablaNomina.setShowVerticalLines(false);
        tablaNomina.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaNomina);
        if (tablaNomina.getColumnModel().getColumnCount() > 0) {
            tablaNomina.getColumnModel().getColumn(0).setMinWidth(80);
            tablaNomina.getColumnModel().getColumn(0).setMaxWidth(80);
            tablaNomina.getColumnModel().getColumn(1).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(1).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(2).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(2).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(3).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(3).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(4).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(4).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(5).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(5).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(6).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(6).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(7).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(7).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(8).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(8).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(9).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(9).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(10).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(10).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(11).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(11).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(12).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(12).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(13).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(13).setMaxWidth(250);
            tablaNomina.getColumnModel().getColumn(14).setMinWidth(250);
            tablaNomina.getColumnModel().getColumn(14).setMaxWidth(250);
        }

        jpanelEsquinasRedondas4.setBackground(new java.awt.Color(32, 136, 203));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PLANILLA PARA CALCULO DE NOMINA");

        javax.swing.GroupLayout jpanelEsquinasRedondas4Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas4);
        jpanelEsquinasRedondas4.setLayout(jpanelEsquinasRedondas4Layout);
        jpanelEsquinasRedondas4Layout.setHorizontalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas4Layout.setVerticalGroup(
            jpanelEsquinasRedondas4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jpanelEsquinasRedondas3Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas3);
        jpanelEsquinasRedondas3.setLayout(jpanelEsquinasRedondas3Layout);
        jpanelEsquinasRedondas3Layout.setHorizontalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
            .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelEsquinasRedondas3Layout.setVerticalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addComponent(jpanelEsquinasRedondas4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );

        jScrollPane1.setViewportView(dashboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos_panel.jpanelEsquinasRedondas dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas2;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas3;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas4;
    public javax.swing.JLabel lblBaseImponible;
    public javax.swing.JLabel lblDeducible;
    public javax.swing.JLabel lblImpuestoBase;
    public javax.swing.JLabel lblInssLaboral;
    public javax.swing.JLabel lblIrAnual;
    public javax.swing.JLabel lblIrMensual;
    public javax.swing.JLabel lblPorcentajeSegunLey;
    public javax.swing.JLabel lblSalarioAnual;
    public javax.swing.JLabel lblSalarioMenosDeducible;
    public javax.swing.JLabel lblSalarioMensual;
    public javax.swing.JTable tablaNomina;
    // End of variables declaration//GEN-END:variables

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
}
