/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.model.Dealer;
import project.util.DataUtil;

/**
 *
 * @author Mnselim
 */
public class DealerDao implements SagorBakery<Dealer>{
        
    DataUtil dataUtil = new DataUtil();
    
    @Override
    public ArrayList<Dealer> getAll() throws SQLException {
        String sql = "SELECT * FROM dealer";
       ArrayList<Dealer> dealer = new ArrayList<Dealer>();
        ResultSet rs = dataUtil.select(sql);
            while(rs.next()){
                Dealer d = new Dealer();
                d.setDealer_id(rs.getInt(1));
                d.setName(rs.getString(2));
                d.setPhone_no(rs.getString(3));
                d.setAddress(rs.getString(4));
                d.setDue_balance(rs.getFloat(5));
                
                dealer.add(d);
            }
        return dealer;
    }

    @Override
    public boolean save(Dealer value) throws SQLException {
        String sql="INSERT INTO dealer VALUES ("+value.getDealer_id()+",'"+value.getName()+"','"
                +value.getPhone_no()+"','"+value.getAddress()+"',"+value.getDue_balance()+")";
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean update(Dealer value) throws SQLException {
        String sql ="UPDATE dealer SET name='"+value.getName()+"',phone_no='"+value.getPhone_no()+"',address='"
                +value.getAddress()+"',due_balance="+value.getDue_balance()+" WHERE dealer_id="+value.getDealer_id();
        dataUtil.DML(sql);
        return true;
    }
        
    @Override
    public boolean delete(Dealer value) throws SQLException {
        String sql="DELETE FROM dealer WHERE dealer_id="+value.getDealer_id();
        dataUtil.DML(sql);
       return true;
    }

    @Override
    public Dealer find(int id) throws SQLException {
        String sql = "SELECT * FROM dealer WHERE dealer_id="+id;
        ArrayList<Dealer> dealers = new ArrayList<Dealer>();
        ResultSet rs = dataUtil.select(sql);
        while(rs.next()){
            Dealer d = new Dealer();
            d.setDealer_id(rs.getInt(1));
            d.setName(rs.getString(2));
            d.setPhone_no(rs.getString(3));
            d.setAddress(rs.getString(4));
            d.setDue_balance(rs.getFloat(5));
            
            return d;
        }
        return null;
    }
    
}
