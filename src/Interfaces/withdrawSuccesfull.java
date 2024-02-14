package Interfaces;

import Logic.BankLogic;

public class withdrawSuccesfull extends javax.swing.JFrame {

    private javax.swing.JTextField withdrawvalue;

    public withdrawSuccesfull() {
        initComponents();
        setLocationRelativeTo(null);
        printdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        print = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        print1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 63, 90));
        jLabel1.setText("Widthdrawal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        Date.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Widthdrawal Date: ");
        Date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DateMouseMoved(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 380, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Valued to withdrawal: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        print.setBackground(new java.awt.Color(22, 36, 71));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setBorder(null);
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 130, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Balance: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 170, 40));

        jButton1.setBackground(new java.awt.Color(31, 64, 104));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Witdthdrawal");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 80, 40));

        jButton2.setBackground(new java.awt.Color(31, 64, 104));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Close");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 60, 30));

        print1.setBackground(new java.awt.Color(22, 36, 71));
        print1.setForeground(new java.awt.Color(255, 255, 255));
        print1.setBorder(null);
        jPanel1.add(print1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            BankLogic banklogic = new BankLogic();
            String value = print.getText();
            double pvalue = Double.parseDouble(value);
            double changing = banklogic.depositAmound(pvalue);
            String change = String.valueOf(changing);
            print1.setText(change);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showConfirmDialog(this, "only numbers are accepted.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BankUI bankui = new BankUI();
        this.setVisible(false);
        bankui.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private BankLogic banklogic = new BankLogic();

    public void printdate() {
        String acurrentdate = banklogic.datecurrent("dd-MM-yyyy");
        Date.setText("Withdraw Date: " + acurrentdate);
    }

    private void DateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseMoved
        // TODO 
    }//GEN-LAST:event_DateMouseMoved

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(withdrawSuccesfull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(withdrawSuccesfull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(withdrawSuccesfull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(withdrawSuccesfull.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new withdrawSuccesfull().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField print;
    private javax.swing.JTextField print1;
    // End of variables declaration//GEN-END:variables
}
