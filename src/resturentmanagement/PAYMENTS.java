/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class PAYMENTS extends javax.swing.JFrame {

    /**
     * Creates new form PAYMENTS
     */
    EMPLOYEE employee=new EMPLOYEE();
    EMPPAYMENT payment=new EMPPAYMENT();
    
    public PAYMENTS() {
        
        
        initComponents();
        jTextFieldDate.setBackground(new java.awt.Color(0,0,0,1));
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
       
        
        setdisable();
        employee.fillEmployeeTable(jTable2);//populate the jtable
        payment.fillpaymentTable(jTable1);//populate the jtable
        currentdate();
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
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextFieldDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(810, 620));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("EMPLOYEE PAYMENT");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(240, 30, 338, 33);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/titleback1.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 800, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 80);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Name", "Worked days", "Day Payment", "Total payment"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(72, 274, 580, 161);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton1.setText("Calculate");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 550, 110, 40);

        jLabel2.setText("Enter number worked days :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(56, 482, 144, 14);

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(210, 479, 66, 16);

        jLabel3.setText("Enter pay amount for a day :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(56, 520, 144, 14);

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(210, 517, 66, 16);

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(185, 568, 91, 16);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton2.setText("ADD");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 490, 100, 40);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton4.setText("Remove");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(460, 490, 110, 40);

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(84, 453, 73, 16);

        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField5.setOpaque(false);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(242, 453, 161, 16);

        jTextField6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextField6.setOpaque(false);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(499, 453, 188, 16);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Status", "Name", "Gender", "Phone No", "Email"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(72, 107, 580, 161);

        jLabel4.setText("ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(56, 456, 18, 14);

        jLabel5.setText("Status :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(194, 456, 38, 14);

        jLabel6.setText("Name :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(421, 456, 34, 14);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton5.setText("Print paysheet");
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(400, 550, 120, 40);

        jTextFieldDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextFieldDate.setOpaque(false);
        jPanel1.add(jTextFieldDate);
        jTextFieldDate.setBounds(640, 80, 132, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Background.jpg"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(800, 620));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 80, 800, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(800, 649));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void setdisable()
    {
        jTextField4.setEnabled(false);
        jTextField5.setEnabled(false);
        jTextField6.setEnabled(false);
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
        jTextField5.setBackground(new java.awt.Color(0,0,0,1));
        jTextField6.setBackground(new java.awt.Color(0,0,0,1));
        
    
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
      
        int rIndex = jTable1.getSelectedRow();//get the select row index
         
        jTextField1.setText(model.getValueAt(rIndex,3).toString());
        jTextField2.setText(model.getValueAt(rIndex,4).toString());
        jTextField3.setText(model.getValueAt(rIndex,5).toString());
        jTextField4.setText(model.getValueAt(rIndex,0).toString());
        jTextField5.setText(model.getValueAt(rIndex,1).toString());
        jTextField6.setText(model.getValueAt(rIndex,2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
                int v=0;
        v = Integer.parseInt(jTextField2.getText().toString())* Integer.parseInt(jTextField1.getText().toString());
        jTextField3.setText(v+".00");
        jTextField3.setEditable(false);
       // jTextField1.setEditable(false);        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
public void currentdate()
{
        
    Calendar cal =new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);
    int year =cal.get(Calendar.YEAR);
    int day= cal.get(Calendar.DAY_OF_MONTH);
    jTextFieldDate.setText(year+"/"+(month+1)+"/"+day);
    jTextFieldDate.setEditable(false);



}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String id =jTextField4.getText();
        String status =jTextField5.getText();
        String name =jTextField6.getText();
        String workdays =jTextField1.getText();
        String daypayment =jTextField2.getText();
        String totalpayment =jTextField3.getText();

        if(id.trim().equals("") ||status.trim().equals("") || name.equals("") || workdays.trim().equals("") )
        {
          JOptionPane.showMessageDialog(rootPane, "Fields are empty!!","EMPTY", JOptionPane.ERROR_MESSAGE);   
        }
        else{
                    
             if(payment.addpayment(id, status, name, workdays, daypayment, totalpayment))// pass values to payemnet
                 {
                 JOptionPane.showMessageDialog(rootPane, "Payment added Successfuly!!","ADD PAYMENT", JOptionPane.INFORMATION_MESSAGE);
                 }
             else{
                 JOptionPane.showMessageDialog(rootPane, "Payment added Failed!!","ADD PAYMENT", JOptionPane.ERROR_MESSAGE);
                }  
        }        
        refreshTable(); // refreshTable function
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
        //delete select data 
         try{
           int id= Integer.valueOf(jTextField4.getText()); 
                
            if(payment.removepayment(id))// pass values to employee.java
               {
                JOptionPane.showMessageDialog(rootPane, "Payment Deleted Successfuly!!","Remove PAYMENT", JOptionPane.INFORMATION_MESSAGE);
               }
            else{
                JOptionPane.showMessageDialog(rootPane, "Payment Data Delete Failed!!","Remove Payment Error", JOptionPane.ERROR_MESSAGE);
                }  
            
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage()+"Enter Employee ID", "EMPLOYEE ID ERROR", JOptionPane.ERROR_MESSAGE);
            }
         
         refreshTable(); // refreshTable function
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void refreshTable()
{
    //clear te table to refresh
    jTable1.setModel(new DefaultTableModel(null,new Object[]{"ID","Status","Name","Worked Days","Day Payment","Total Payment"}));
    //populate table
    payment.fillpaymentTable(jTable1);

}
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");//clear text fields when click jtable2(employee data table)
        
        DefaultTableModel  model = (DefaultTableModel)jTable2.getModel();

        int rIndex = jTable2.getSelectedRow();//get the select row index

        //get value from table to textfields

        jTextField4.setText(model.getValueAt(rIndex,0).toString());
        jTextField5.setText(model.getValueAt(rIndex,1).toString());

        jTextField6.setText(model.getValueAt(rIndex,2).toString());
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        MessageFormat header= new MessageFormat("PAYSHEET");
        MessageFormat footer= new MessageFormat("..................................");
        
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header,footer);
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(rootPane, "Print Failed","Printer Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
                        int v=0;
        v = Integer.parseInt(jTextField2.getText().toString())* Integer.parseInt(jTextField1.getText().toString());
        jTextField3.setText(v+".00");
        jTextField3.setEditable(false);
    }//GEN-LAST:event_jTextField2KeyReleased

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
            java.util.logging.Logger.getLogger(PAYMENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PAYMENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PAYMENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PAYMENTS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PAYMENTS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldDate;
    // End of variables declaration//GEN-END:variables
}