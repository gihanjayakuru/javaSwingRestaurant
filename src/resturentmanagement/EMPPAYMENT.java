/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class EMPPAYMENT {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    //functin to  add employees
    public boolean addpayment(String id, String status, String name, String workdays, String daypayment,String totalpayment){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `employee_payments`(`id`, `status`, `name`, `workeddays`, `daypayment`, `totalpayment`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, status);
            st.setString(3, name);
            st.setString(4, workdays);
            st.setString(5, daypayment);
            st.setString(6, totalpayment);
            
             return (st.executeUpdate()>0);   
            
        } catch (SQLException ex) {
            Logger.getLogger(EMPPAYMENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean editpayment(int id,String status,String name,String workdays,String daypayment,String totalpayment)
     {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `employee_payments` SET `status`=?,`name`=?,`workeddays`=?,`daypayment`=?,`totalpayment`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, status);
            st.setString(2, name);
            st.setString(3, workdays);
            st.setString(4, daypayment);
            st.setString(5, totalpayment);
            st.setInt(6, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(EMPPAYMENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }         
     
     
     }
    
     
     //remove employee function
     public boolean removepayment(int id)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `employee_payments` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setInt(1, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(EMPPAYMENT.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
    
    
    
    //function to populate table with database data
    public void fillpaymentTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `employee_payments`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[6];//column on table
                row[0]=rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                row[3]= rs.getString(4);
                row[4]= rs.getString(5);
                row[5]= rs.getString(6);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(EMPPAYMENT.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}


