/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HOME
 */
public class OrderFoods extends javax.swing.JFrame {

    /**
     * Creates new form OrderFoods
     */
      FOOD food=new FOOD();
      ORDER order=new ORDER();
    
    public OrderFoods() {
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0,0,0,1));
        jTextField2.setBackground(new java.awt.Color(0,0,0,1));
        jTextField3.setBackground(new java.awt.Color(0,0,0,1));
        jTextField4.setBackground(new java.awt.Color(0,0,0,1));
    food.fillFoodTable(jTable1);   
    
    //set disable edit fields
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 620));
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("ORDER FOODS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(264, 20, 200, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/titleback1.jpg"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(0, 0, 800, 70);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 70);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No", "Name", "Price"
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
        jScrollPane1.setBounds(340, 110, 403, 155);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table No", "Name", "price"
            }
        ));
        jTable2.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(340, 300, 403, 166);

        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setOpaque(false);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(130, 120, 100, 30);

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T1", "T2", "T3", "T4", "T5", "T6", "T7", "T8", "T9", "T10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(21, 118, 59, 20);

        jLabel2.setText("select foods in table  :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(21, 93, 106, 14);

        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setOpaque(false);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 160, 100, 30);

        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setOpaque(false);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(130, 200, 100, 30);

        jLabel3.setText("Item Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(21, 156, 70, 30);

        jLabel4.setText("Item Price :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 200, 80, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton4.setText("remove saved  order");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 310, 140, 40);

        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jTextField4.setOpaque(false);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(150, 390, 98, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton6.setText("add to oder table/list");
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(20, 240, 140, 40);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton7.setText("save oder");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(180, 310, 130, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button.png"))); // NOI18N
        jButton1.setText("remove from oder table");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(180, 240, 150, 40);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 290, 310, 10);

        jLabel5.setText("Total price :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 390, 71, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Background.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(800, 620));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-30, 40, 800, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(800, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String value=jComboBox1.getSelectedItem().toString();
        
        jTextField1.setText(value);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel  model = (DefaultTableModel)jTable1.getModel();
        
        int rIndex = jTable1.getSelectedRow();//get the select row index
        
        jTextField2.setText(model.getValueAt(rIndex,1).toString());
        jTextField3.setText(model.getValueAt(rIndex,2).toString());

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                
      
        String tableno=jTextField1.getText();
        order.removeorder(tableno);// pass values to ORDER.java removeorder()
        
        //clear the table1 and all fields to new order
       // jTable2.setModel(new DefaultTableModel(null,new Object[]{"Table No","Name","Price"}));
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);//reset combobox
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField1.setEditable(false);
        
        String tableno=jTextField1.getText().toString();
        
        if(tableno.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please select Table No!");
        }
        else{
            
        TableModel model1 = jTable1.getModel();

        int[] indexs = jTable1.getSelectedRows();
        Object[] row = new Object[3];
        DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();
        
         
        for(int i = 0; i < indexs.length; i++)
        {
            row[0] = (jTextField1.getText());
            row[1] = model1.getValueAt(indexs[i], 1);
            row[2] = model1.getValueAt(indexs[i], 2);
          
            model2.addRow(row);   
        }
      }
       //continuosly add total price (Total price)
     int rowcount=jTable2.getRowCount();
     int sum=0;
     
     for(int i=0; i<rowcount; i++)
     {
     sum+=Integer.parseInt(jTable2.getValueAt(i, 2).toString());
     }
     jTextField4.setText(Integer.toString(sum));
     
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
     int rows=jTable2.getRowCount();
        int price;
        int totalprice;
     for(int row=0; row<rows; row++){
         
        String tableno=(String)jTable2.getValueAt(row, 0);
        String name=(String)jTable2.getValueAt(row, 1);
        price=Integer.parseInt(jTable2.getValueAt(row,2).toString()); 
        totalprice= Integer.parseInt(jTextField4.getText());
        
        order.addoder(tableno, name, price, totalprice);
        }
        
        jTable2.setModel(new DefaultTableModel(null,new Object[]{"Table No","Name","Price"}));
         
        //clear text fields
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // remove selected row in table
      DefaultTableModel model=(DefaultTableModel)jTable2.getModel();
      
    int SelectedRowIndex=jTable2.getSelectedRow();
    model.removeRow(SelectedRowIndex);
    

//continuosly add total price (Total price)
//if remove item cal again total
     int rowcount=jTable2.getRowCount();
     int sum=0;
     
     for(int i=0; i<rowcount; i++)
     {
     sum+=Integer.parseInt(jTable2.getValueAt(i, 2).toString());
     }
     jTextField4.setText(Integer.toString(sum));
        
        
        
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
            java.util.logging.Logger.getLogger(OrderFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
