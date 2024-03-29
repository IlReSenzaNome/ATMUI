package Interfaces;

import Logic.BankLogic;
import java.awt.Color;

public class BankUI extends javax.swing.JFrame {

    public BankUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        sendCheckPassword = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        wrongPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        root.setBackground(new java.awt.Color(27, 27, 47));
        root.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Images/Fondbackground.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        root.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 340, 270));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        root.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 20));

        inputPassword.setBackground(new java.awt.Color(22, 36, 71));
        inputPassword.setForeground(new java.awt.Color(255, 255, 255));
        inputPassword.setBorder(null);
        inputPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputPasswordMousePressed(evt);
            }
        });
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        inputPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputPasswordKeyPressed(evt);
            }
        });
        root.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, 30));

        sendCheckPassword.setBackground(new java.awt.Color(31, 64, 104));
        sendCheckPassword.setForeground(new java.awt.Color(255, 255, 255));
        sendCheckPassword.setText("Continue");
        sendCheckPassword.setBorder(null);
        sendCheckPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendCheckPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sendCheckPasswordMouseClicked(evt);
            }
        });
        sendCheckPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendCheckPasswordActionPerformed(evt);
            }
        });
        root.add(sendCheckPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(228, 63, 90));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Images/archlinux.png"))); // NOI18N
        jLabel3.setText("Arch Bank");
        root.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 220, 60));

        jPanel1.setBackground(new java.awt.Color(27, 27, 47));

        exitButton.setBackground(new java.awt.Color(27, 27, 47));
        exitButton.setText("  X");
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 578, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        root.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        wrongPassword.setForeground(new java.awt.Color(27, 27, 47));
        wrongPassword.setText("Password wrong");
        root.add(wrongPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendCheckPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendCheckPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendCheckPasswordActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void inputPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputPasswordMousePressed
        inputPassword.setText("");
    }//GEN-LAST:event_inputPasswordMousePressed

    private int attempts = 0;

    private void sendCheckPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendCheckPasswordMouseClicked
        BankLogic banklogic = new BankLogic();
        MainMenu mainmenu = new MainMenu();
        int attemptsinput;
        try {
            String passwordString = new String(inputPassword.getPassword());
            int enteredPassword = Integer.parseInt(passwordString);
            boolean respond = banklogic.validatePassword(enteredPassword);
            if (respond) {
                wrongPassword.setForeground(new Color(27, 27, 47));
                this.setVisible(false);
                mainmenu.setVisible(true);
            } else {
                attempts++;
                int attemptsRestant = 3 - attempts;
                wrongPassword.setForeground(Color.red);
                String wrongPasswordMessage = "Wrong password: " + attemptsRestant + " attemp";
                wrongPassword.setText(wrongPasswordMessage);
                if (attempts >= 3) {
                    System.exit(0);
                }
            }
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showConfirmDialog(this, "The password must be just a number.");
        }
    }//GEN-LAST:event_sendCheckPasswordMouseClicked

    private void inputPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPasswordKeyPressed
        // TODO add your handing code here.
    }//GEN-LAST:event_inputPasswordKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel root;
    private javax.swing.JButton sendCheckPassword;
    private javax.swing.JLabel wrongPassword;
    // End of variables declaration//GEN-END:variables
}
