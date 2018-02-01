/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import project.util.DataUtil;
import project.util.DatabaseUtil;

/**
 *
 * @author Mnselim
 */
public class PurchaseDao {
    
    DatabaseUtil dataUtil = new DatabaseUtil();
    DataUtil datUtil = new DataUtil();
    
    public int maxId() throws SQLException {
        String sql="SELECT MAX(purchase_id)+1 FROM purchase";
        ResultSet rs = datUtil.select(sql);
        while (rs.next()) {
            return rs.getInt(1);
        }
        return 1000;
       
    }
}
