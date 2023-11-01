
package vista;

import java.awt.Color;
import java.awt.Font;
import javafx.scene.AccessibleAttribute;
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

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER); // Establece la alineación central

        for (int i = 0; i < tablaNomina.getColumnCount(); i++) {
            tablaNomina.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dashboard = new Estilos_panel.jpanelEsquinasRedondas();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaNomina = new javax.swing.JTable();

        jScrollPane1.setBorder(null);

        dashboard.setBackground(new java.awt.Color(255, 255, 255));

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
        tablaNomina.setSelectionBackground(new java.awt.Color(232, 57, 95));
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

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(dashboard);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Estilos_panel.jpanelEsquinasRedondas dashboard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable tablaNomina;
    // End of variables declaration//GEN-END:variables
}
