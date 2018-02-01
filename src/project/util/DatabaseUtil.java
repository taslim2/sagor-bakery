
package project.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mnselim
 */
public class DatabaseUtil {

    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConnection(){
        
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sagor_bakery", "root",  "");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
}
