/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import java.awt.Frame;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HOME
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        jTextFieldUsername.setBackground(new java.awt.Color(0,0,0,1));
        jPasswordField1.setBackground(new java.awt.Color(0,0,0,1));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 102, 0));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USER LOGIN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(158, 28, 153, 31);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 504, 0);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(67, 140, 90, 23);

        jTextFieldUsername.setText("testuser");
        jTextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextFieldUsername.setOpaque(false);
        jTextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsernameMouseClicked(evt);
            }
        });
        jPanel1.add(jTextFieldUsername);
        jTextFieldUsername.setBounds(175, 148, 222, 16);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Password ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(73, 193, 90, 22);

        jPasswordField1.setText("pass");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPasswordField1.setOpaque(false);
        jPasswordField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordField1MouseClicked(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(173, 199, 222, 16);

        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButtonLogin.setText("LOGIN STAFF");
        jButtonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin);
        jButtonLogin.setBounds(136, 241, 222, 35);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton1.setText("ORDER FOODS");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(136, 287, 222, 38);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-10, 0, 500, 380);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 490, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
        );

        setBounds(0, 0, 507, 447);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        
        //username and password
        String username = jTextFieldUsername.getText();
        String password = String.valueOf(jPasswordField1.getPassword());
        
        if(username.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Enter User Name to Login", "Empty username", 2);
        }
        else if(password.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Password to Login", "Empty password", 2);
        }
        else{
            
            MYCONNECTION myconnection = new MYCONNECTION();
            
            String selectQuery = "SELECT * FROM `user` WHERE `username`=? AND `password`=?";
            try {
                
                ps = myconnection.createConnection().prepareStatement(selectQuery);
                
                ps.setString(1, username);
                ps.setString(2, password);
                
                rs = ps.executeQuery();
                
                //if the user exist open main form and close login form
                if(rs.next()){
                    MainForm mainform = new MainForm();
                    mainform.setVisible(true);
                    mainform.pack();
                    mainform.setLocationRelativeTo(null);
                    mainform.setExtendedState(JFrame.MAXIMIZED_BOTH);//full screen window(MainForm)
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "wrong User name or Password", "Login error", 2);
                }
            
                
            } catch (SQLException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OrderFoods OBJ=new OrderFoods();
        OBJ.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsernameMouseClicked
        // TODO add your handling code here:
        jTextFieldUsername.setText("");
    }//GEN-LAST:event_jTextFieldUsernameMouseClicked

    private void jPasswordField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordField1MouseClicked
        // TODO add your handling code here:
        jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}