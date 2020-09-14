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
public class FOOD {
    
    MYCONNECTION myconnection =new MYCONNECTION();
    //functin to  add Foods
    public boolean addfood(String itemno, String name, String price){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `foods`(`itemno`, `name`, `price`) VALUES (?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, itemno);
            st.setString(2, name);
            st.setString(3, price);   
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
    public boolean editfood(int itemno, String name,String price)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery="UPDATE `foods` SET `name`=?,`price`=? WHERE `itemno`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(editQuery);
            
            st.setString(1, name);
            st.setString(2, price);
            st.setInt(3, itemno);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }          
    }

         //remove FOODS function
     public boolean removeFood(int itemno)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `foods` WHERE `itemno`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setInt(1, itemno);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }
    
    
    
    
    
    //function to populate table with database data
    public void fillFoodTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `foods`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[3];//column on table
                row[0]=rs.getInt(1);
                row[1]= rs.getString(2);
                row[2]= rs.getString(3);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
    
    
    
}
