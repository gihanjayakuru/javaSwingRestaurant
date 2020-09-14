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
public class ORDER {
    
        MYCONNECTION myconnection =new MYCONNECTION();
   
   
    public boolean addoder(String tableno, String name, int price, int totalprice){
        
        PreparedStatement st;
        ResultSet rs;
        String addQuery="INSERT INTO `oders`(`tableno`, `name`, `price`, `totalprice`) VALUES (?,?,?,?)";
        
        try {
            st=myconnection.createConnection().prepareStatement(addQuery);
            
            st.setString(1, tableno);
            st.setString(2, name);
            st.setInt(3, price);   
            st.setInt(4, totalprice);
            
            if(st.executeUpdate()>0)
            {
             return true;   
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ORDER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } 

 
    //function to populate table with database data
    public void filloderTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `oders`";
        
        try {
            
            
            ps = myconnection.createConnection().prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
                row = new Object[3];//column on table
                row[0]=rs.getString(1);
                row[1]= rs.getString(2);
                row[2]= rs.getInt(3);
                
                tablemodel.addRow(row);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(FOOD.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }    
    

         //remove FOODS function
     public boolean removeorder(String tableno)
     {
        PreparedStatement st;
        ResultSet rs;
        String deleteQuery="DELETE FROM `oders` WHERE `tableno`=?";
        
        try {
            st=myconnection.createConnection().prepareStatement(deleteQuery);
            

            st.setString(1, tableno);
            
            return (st.executeUpdate()>0); 
            
        }
        catch (SQLException ex) {
            Logger.getLogger(ORDER.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
     
     
     }    




}


