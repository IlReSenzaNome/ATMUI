package Interfaces;

import Logic.BankLogic;
import java.nio.charset.Charset;

public class Query extends javax.swing.JFrame {

    private BankLogic banklogic = new BankLogic();

    public Query() {
        initComponents();
        setLocationRelativeTo(null);
        queryconsult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Date = new javax.swing.JLabel();
        available = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 63, 90));
        jLabel1.setText("Balance Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 320, 40));

        jButton1.setBackground(new java.awt.Color(31, 64, 104));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 174, 70, 30));

        Date.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Consultation Date:");
        Date.setToolTipText("");
        Date.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DateMouseMoved(evt);
            }
        });
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 340, 30));

        available.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        available.setForeground(new java.awt.Color(255, 255, 255));
        available.setText("- Available Balance: $");
        available.setToolTipText("");
        available.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                availableMouseMoved(evt);
            }
        });
        jPanel1.add(available, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 370, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BankUI bankui = new BankUI();
        this.setVisible(false);
        bankui.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void DateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseMoved
        //
    }//GEN-LAST:event_DateMouseMoved

    public void queryconsult() {
        String acurrentdate = banklogic.datecurrent("dd-MM-yyyy");
        Date.setText("Consultation Date: " + acurrentdate);
        double saldo = banklogic.availableBalan();
        available.setText("- Available Balance: $ " + saldo);
    }

    private void availableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_availableMouseMoved
        //
    }//GEN-LAST:event_availableMouseMoved

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
            java.util.logging.Logger.getLogger(Query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Query.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Query().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel available;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
