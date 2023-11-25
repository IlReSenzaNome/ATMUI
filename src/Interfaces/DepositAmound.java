package Interfaces;

import Logic.BankLogic;

public class DepositAmound extends javax.swing.JFrame {

    public DepositAmound() {
        initComponents();
        setLocationRelativeTo(null);
        dateprint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        valuedeposit = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        responsive = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 63, 90));
        jLabel1.setText("Deposito");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 150, -1));

        jButton1.setBackground(new java.awt.Color(31, 64, 104));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 70, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Value to deposit");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        valuedeposit.setBackground(new java.awt.Color(22, 36, 71));
        valuedeposit.setForeground(new java.awt.Color(255, 255, 255));
        valuedeposit.setBorder(null);
        valuedeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valuedepositActionPerformed(evt);
            }
        });
        jPanel1.add(valuedeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, 40));

        Date.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Deposit Date: ");
        Date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DateMouseMoved(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 410, -1));

        jButton2.setBackground(new java.awt.Color(31, 64, 104));
        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Deposit");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 90, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Balance: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        responsive.setBackground(new java.awt.Color(22, 36, 71));
        responsive.setForeground(new java.awt.Color(255, 255, 255));
        responsive.setBorder(null);
        responsive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsiveActionPerformed(evt);
            }
        });
        jPanel1.add(responsive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BankUI bankui = new BankUI();
        this.setVisible(false);
        bankui.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private BankLogic banklogic = new BankLogic();
    
    public void dateprint(){
        String acurrentdate = banklogic.datecurrent("dd-MM-yyyy");
        Date.setText("Deposit Date: " + acurrentdate);
    }
    
    private void DateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseMoved
        //
    }//GEN-LAST:event_DateMouseMoved

    private void responsiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsiveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            BankLogic banklogic = new BankLogic();
            String value = valuedeposit.getText();
            double pvalue = Double.parseDouble(value);
            double changing = banklogic.depositAmound(pvalue);
            String change = String.valueOf(changing);
            responsive.setText(change);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showConfirmDialog(this, "Solo se aceptan numeros.");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void valuedepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valuedepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valuedepositActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepositAmound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositAmound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositAmound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositAmound.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositAmound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField responsive;
    private javax.swing.JTextField valuedeposit;
    // End of variables declaration//GEN-END:variables
}
