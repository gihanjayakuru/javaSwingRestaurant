/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturentmanagement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOME
 */
public class MYCONNECTION {
    
  public Connection createConnection(){
      
      Connection connection = null;
      
      MysqlDataSource mds = new MysqlDataSource();
      
      mds.setServerName("localhost");
      mds.setPortNumber(3306);
      mds.setUser("root");
      mds.setPassword("");
      mds.setDatabaseName("java_resturent_db");
      
      try {
          connection = mds.getConnection();
      } catch (SQLException ex) {
          Logger.getLogger(MYCONNECTION.class.getName()).log(Level.SEVERE, null, ex);
      }
      
      return connection;
  
  }  
    
}
