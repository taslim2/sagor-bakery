
package project.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Mnselim
 */
public class DataUtil {
    
    public PreparedStatement ps;
    
    public ResultSet select(String sql)throws SQLException{
        return DatabaseUtil.getConnection().createStatement().executeQuery(sql);
    }
    public boolean DML(String sql)throws SQLException{
        Statement stm = DatabaseUtil.getConnection().createStatement();
        stm.executeUpdate(sql);
        stm.close();
        return true;
    }
    public boolean preaperStatement(String sql)throws SQLException{
        ps=DatabaseUtil.getConnection().prepareStatement(sql);
        
        return true;
    }
    
}
