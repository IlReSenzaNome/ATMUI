package Interfaces;

import Logic.BankLogic;

public class newPassword extends javax.swing.JFrame {

    public newPassword() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        Close = new javax.swing.JButton();
        changePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(27, 27, 47));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(228, 63, 90));
        jLabel1.setText("Change Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Type a new password: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        newPassword.setBackground(new java.awt.Color(22, 36, 71));
        newPassword.setForeground(new java.awt.Color(255, 255, 255));
        newPassword.setText("Password");
        newPassword.setBorder(null);
        newPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newPasswordMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newPasswordMousePressed(evt);
            }
        });
        jPanel1.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 260, 40));

        Close.setBackground(new java.awt.Color(31, 64, 104));
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        changePassword.setBackground(new java.awt.Color(31, 64, 104));
        changePassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        changePassword.setForeground(new java.awt.Color(255, 255, 255));
        changePassword.setText("Change");
        changePassword.setActionCommand("");
        changePassword.setBorder(null);
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });
        jPanel1.add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPasswordMouseClicked
        newPassword.setText("");
    }//GEN-LAST:event_newPasswordMouseClicked

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        BankUI bankui = new BankUI();
        this.setVisible(false);
        bankui.setVisible(true);
    }//GEN-LAST:event_CloseActionPerformed

    private void newPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newPasswordMousePressed
        newPassword.setText("");
    }//GEN-LAST:event_newPasswordMousePressed

    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordActionPerformed
        BankLogic banklogic = new BankLogic();
        try {
            String password = new String(newPassword.getPassword());
            int enteredPassword = Integer.parseInt(password);
            boolean respond = banklogic.validateNewPassword(enteredPassword);
            if (respond) {
               javax.swing.JOptionPane.showConfirmDialog(this, "Password changed succesfully");
            } else {
                javax.swing.JOptionPane.showConfirmDialog(this, "Set no compatibel");
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showConfirmDialog(this, "La contraseña debe ser un número.");
        }
    }//GEN-LAST:event_changePasswordActionPerformed

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
            java.util.logging.Logger.getLogger(newPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton changePassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newPassword;
    // End of variables declaration//GEN-END:variables
}
