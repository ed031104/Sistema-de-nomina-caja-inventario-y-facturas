
package vista;

public class RegistroNomina extends javax.swing.JPanel {

    public RegistroNomina() {
        initComponents();
        jLabel1.setText("<html>RESGISTRO DE DATOS PARA ELABORACION<br>DE NOMINA</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelEsquinasRedondas1 = new Estilos_panel.jpanelEsquinasRedondas();
        jpanelEsquinasRedondas2 = new Estilos_panel.jpanelEsquinasRedondas();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSpinField2 = new com.toedter.components.JSpinField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jpanelEsquinasRedondas3 = new Estilos_panel.jpanelEsquinasRedondas();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(470, 470));

        jpanelEsquinasRedondas1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelEsquinasRedondas1.setPreferredSize(new java.awt.Dimension(719, 587));

        jpanelEsquinasRedondas2.setBackground(new java.awt.Color(32, 136, 203));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pila-de-monedas-30.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleado");

        agregar.setBackground(new java.awt.Color(255, 255, 255));
        agregar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(32, 136, 203));
        agregar.setText("Agregar");
        agregar.setBorder(null);
        agregar.setBorderPainted(false);
        agregar.setFocusable(false);

        jLabel11.setText("Horas laborales");

        jLabel12.setText("Años de antiguedad");

        jLabel5.setText("Incentivo");

        jTextField2.setText("C$");

        jLabel6.setText("Comisión");

        jTextField3.setText("C$");

        javax.swing.GroupLayout jpanelEsquinasRedondas2Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas2);
        jpanelEsquinasRedondas2.setLayout(jpanelEsquinasRedondas2Layout);
        jpanelEsquinasRedondas2Layout.setHorizontalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16)
                                .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)))
                                    .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField2)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField3)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))))))
                        .addGap(32, 32, 32))))
        );
        jpanelEsquinasRedondas2Layout.setVerticalGroup(
            jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelEsquinasRedondas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(171, 171, 171)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jpanelEsquinasRedondas3.setBackground(new java.awt.Color(32, 136, 203));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setRequestFocusEnabled(false);

        jList2.setBackground(new java.awt.Color(32, 136, 203));
        jList2.setForeground(new java.awt.Color(255, 255, 255));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList2);

        javax.swing.GroupLayout jpanelEsquinasRedondas3Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas3);
        jpanelEsquinasRedondas3.setLayout(jpanelEsquinasRedondas3Layout);
        jpanelEsquinasRedondas3Layout.setHorizontalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas3Layout.setVerticalGroup(
            jpanelEsquinasRedondas3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jpanelEsquinasRedondas1Layout = new javax.swing.GroupLayout(jpanelEsquinasRedondas1);
        jpanelEsquinasRedondas1.setLayout(jpanelEsquinasRedondas1Layout);
        jpanelEsquinasRedondas1Layout.setHorizontalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelEsquinasRedondas1Layout.setVerticalGroup(
            jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelEsquinasRedondas1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jpanelEsquinasRedondas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelEsquinasRedondas3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanelEsquinasRedondas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jpanelEsquinasRedondas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas1;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas2;
    private Estilos_panel.jpanelEsquinasRedondas jpanelEsquinasRedondas3;
    // End of variables declaration//GEN-END:variables
}
