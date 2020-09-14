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
public class EMPLOYEE {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    //functin to  add employees
    public boolean addEmployee(String id, String status, String fname, String gender, String phone,String email){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `employees`(`id`, `status`, `first_name`, `gender`, `phone`, `email`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, id);
            st.setString(2, status);
            st.setString(3, fname);
            st.setString(4, gender);
            st.setString(5, phone);
            st.setString(6, email);
            
             return (st.executeUpdate()>0);   
            
        } catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
     public boolean editEmployee(int id,String status, String fname, String gender, String phone,String email)
     {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `employees` SET `status`=?,`first_name`=?,`gender`=?,`phone`=?,`email`=? WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, status);
            st.setString(2, fname);
            st.setString(3, gender);
            st.setString(4, phone);
            st.setString(5, email);
            st.setInt(6, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }         
     
     
     }
    
     
     //remove employee function
     public boolean removeEmployee(int id)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `employees` WHERE `id`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setInt(1, id);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
    
    
    
    //function to populate table with database data
    public void fillEmployeeTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `employees`";
        
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
            Logger.getLogger(EMPLOYEE.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
