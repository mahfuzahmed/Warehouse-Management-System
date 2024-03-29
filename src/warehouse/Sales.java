
package warehouse;


public class Sales extends javax.swing.JPanel {

    public Sales() 
    {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1210, 810));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WAREHOUSE MANAGEMENT SYSTEM");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 540, 100));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jButton2.setToolTipText("Back To Database");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(70, 70));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 150, 60));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WELCOME");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 150, 60));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 160));

        jLabel4.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Product Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 50));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(29, 32, 38));
        jTextField4.setBorder(null);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 350, 40));

        jLabel14.setFont(new java.awt.Font("Zapfino", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Quantity");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 120, 50));

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(29, 32, 38));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 350, 40));

        jSeparator8.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 370, 30));

        jSeparator15.setBackground(new java.awt.Color(29, 32, 38));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 370, 10));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("SELL ITEM");
        jButton6.setActionCommand("");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 240, 60));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("BUY ITEM");
        jButton7.setActionCommand("");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, 240, 60));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("[DON'T KEEP ANY FIELD BLANK]");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 160, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/warehouse2.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 740, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
