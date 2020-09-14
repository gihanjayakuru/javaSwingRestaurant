/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class ManageFoods extends javax.swing.JFrame {

    /**
     * Creates new form MannageFoods
     */
    FOOD food=new FOOD();
    
    public ManageFoods() {
        initComponents();
        
        jTextFieldITEMNO.setBackground(new java.awt.Color(0,0,0,1));
        jTextFieldNAME.setBackground(new java.awt.Color(0,0,0,1));
        jTextFieldPRICE.setBackground(new java.awt.Color(0,0,0,1));
        //populate the food table
        food.fillFoodTable(jTable1);
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldITEMNO = new javax.swing.JTextField();
        jTextFieldNAME = new javax.swing.JTextField();
        jTextFieldPRICE = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdite = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("FOOD MANAGE");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(255, 24, 201, 33);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/titleback2.jpg"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 800, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ITEM NO :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 210, 68, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NAME :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 270, 43, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PRICE :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 320, 45, 15);

        jTextFieldITEMNO.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldITEMNO.setOpaque(false);
        jPanel1.add(jTextFieldITEMNO);
        jTextFieldITEMNO.setBounds(110, 210, 118, 16);

        jTextFieldNAME.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldNAME.setOpaque(false);
        jPanel1.add(jTextFieldNAME);
        jTextFieldNAME.setBounds(110, 270, 118, 16);

        jTextFieldPRICE.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldPRICE.setOpaque(false);
        jPanel1.add(jTextFieldPRICE);
        jTextFieldPRICE.setBounds(110, 320, 118, 16);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Name", "Price"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jPanel1.add(jScrollPane1);
    jScrollPane1.setBounds(280, 120, 452, 250);

    jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
    jButtonAdd.setText("ADD");
    jButtonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAddActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonAdd);
    jButtonAdd.setBounds(40, 380, 100, 40);

    jButtonEdite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
    jButtonEdite.setText("EDITE");
    jButtonEdite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButtonEdite.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonEditeActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonEdite);
    jButtonEdite.setBounds(40, 430, 100, 40);

    jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
    jButtonRemove.setText("REMOVE");
    jButtonRemove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoveActionPerformed(evt);
        }
    });
    jPanel1.add(jButtonRemove);
    jButtonRemove.setBounds(150, 380, 100, 40);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
    jButton1.setText("ClearFields");
    jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });
    jPanel1.add(jButton1);
    jButton1.setBounds(140, 130, 100, 40);

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Background.jpg"))); // NOI18N
    jLabel5.setPreferredSize(new java.awt.Dimension(800, 600));
    jPanel1.add(jLabel5);
    jLabel5.setBounds(0, 80, 810, 430);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addContainerGap())
    );

    setSize(new java.awt.Dimension(816, 539));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        
        String itemno=jTextFieldITEMNO.getText();
        String name=jTextFieldNAME.getText();
        String price=jTextFieldPRICE.getText();
        
        if(itemno.trim().equals("") || name.trim().equals("") || price.trim().equals(""))
        {
         JOptionPane.showMessageDialog(rootPane, "Some Fields are empty!!", "EMPTY", JOptionPane.WARNING_MESSAGE);
        
        }
        else{
            if(food.addfood(itemno, name, price))
            {
            JOptionPane.showMessageDialog(rootPane, "New Food Added successfuly!!", "ADD FOOD", JOptionPane.INFORMATION_MESSAGE);
            }
        else{
             JOptionPane.showMessageDialog(rootPane, "New Food Added Failed!!", "ADD FOOD", JOptionPane.ERROR_MESSAGE);
            }        
        }
        jTextFieldITEMNO.setText("");//clear textfields
        jTextFieldNAME.setText("");
        jTextFieldPRICE.setText("");
        
        //clear te table to refresh
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Item No","Name","Price"}));
        //populate table
        food.fillFoodTable(jTable1);
        
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditeActionPerformed

        // edite selected employee
        //get dta from text fields
        int itemno= 0;
        String name =jTextFieldNAME.getText();
        String price =jTextFieldPRICE.getText();

        if(name.trim().equals("") || price.trim().equals("") )
        {
          JOptionPane.showMessageDialog(rootPane, "Fields are empty!!","EMPTY", JOptionPane.ERROR_MESSAGE);   
        }
        else{
              
            try{
            itemno = Integer.valueOf(jTextFieldITEMNO.getText()); 
                
            if(food.editfood(itemno, name, price ))// pass values to food.java editefood()
               {
                JOptionPane.showMessageDialog(rootPane, "Food Updated Successfuly!!","EDIT FOOD", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(rootPane, "Food Updated Failed!!","EDIT FOOD", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter Item No", "Item No ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        jTextFieldITEMNO.setText("");//clear textfields
        jTextFieldNAME.setText("");
        jTextFieldPRICE.setText("");
        
        //clear te table to refresh
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Item No","Name","Price"}));
        //populate table
        food.fillFoodTable(jTable1);
        
    }//GEN-LAST:event_jButtonEditeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        jTextFieldITEMNO.setEnabled(false);
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextFieldITEMNO.setText(model.getValueAt(rIndex,0).toString());
        jTextFieldNAME.setText(model.getValueAt(rIndex,1).toString());
        jTextFieldPRICE.setText(model.getValueAt(rIndex,2).toString());
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        //delete select data
         try{
           int itemno= Integer.valueOf(jTextFieldITEMNO.getText()); 
                
            if(food.removeFood(itemno))// pass values to FOOD.java removeFood()
               {
                JOptionPane.showMessageDialog(rootPane, "Food Deleted Successfuly!!","Remove Food", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(rootPane, "Food Data Delete Failed!!","Remove Food Error", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter Item No", "Item No ERROR", JOptionPane.ERROR_MESSAGE);
            }
        jTextFieldITEMNO.setText("");//clear textfields
        jTextFieldNAME.setText("");
        jTextFieldPRICE.setText("");
        
        //clear te table to refresh
        jTable1.setModel(new DefaultTableModel(null,new Object[]{"Item No","Name","Price"}));
        //populate table
        food.fillFoodTable(jTable1);
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextFieldITEMNO.setEnabled(true);
        jTextFieldITEMNO.setText("");
        jTextFieldNAME.setText("");
        jTextFieldPRICE.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFoods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonEdite;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldITEMNO;
    private javax.swing.JTextField jTextFieldNAME;
    private javax.swing.JTextField jTextFieldPRICE;
    // End of variables declaration//GEN-END:variables
}
