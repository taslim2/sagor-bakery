/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import project.gui.Order;
import project.model.Dealer;
import project.model.Purchase;
import project.model.PurchaseProduct;
import project.util.DataUtil;

/**
 *
 * @author Mnselim
 */
public class Product_purchase  implements SagorBakery<Product_purchase>{
    
    private Dealer dealer;
    private Purchase purchase;
    private ArrayList<PurchaseProduct> pp;

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public ArrayList<PurchaseProduct> getPp() {
        return pp;
    }

    public void setPp(ArrayList<PurchaseProduct> pp) {
        this.pp = pp;
    }

    @Override
    public ArrayList<Product_purchase> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean save(Product_purchase value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Product_purchase value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Product_purchase value) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void findPP(int id){
        DataUtil util = new DataUtil();
        String sql ="SELECT * FROM dealer as d,purchase as p,product_purchase as pp WHERE d.dealer_id=p.dealer_id AND p.purchase_id=pp.purchase_id AND pp.purchase_id="+id;
        try {
            
            ResultSet rs = util.select(sql);
            
            Dealer del = new Dealer();
            Purchase pur = new Purchase();
            ArrayList<PurchaseProduct> ppp = new ArrayList<PurchaseProduct>();
            
           while(rs.next()){
               
               PurchaseProduct p = new PurchaseProduct();
               
                // for dealer
                del.setDealer_id(rs.getInt("dealer_id"));
                del.setName(rs.getString("name"));
                del.setDue_balance(rs.getFloat("due_balance"));
                
                // for purchase
                pur.setPurchase_id(rs.getInt("purchase_id"));
                pur.setDate(rs.getDate("purchase_date"));
                pur.setTotal_price(rs.getFloat("total_balance"));
                pur.setSubmite_amount(rs.getFloat("submit_balance"));
                pur.setToday_due(rs.getFloat("due_balance"));
                
                // for product purchase
                p.setProduct_name(rs.getString("product_name"));
                p.setQuantity(rs.getInt("quantity"));
                p.setProduct_price(rs.getFloat("total_price"));
                p.setUnite_price(rs.getFloat("unite_price"));
                
                
                ppp.add(p);
               
           }
           this.setDealer(del);
           this.setPurchase(pur);
           this.setPp(ppp);
       } catch (SQLException ex) {
           Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public Product_purchase find(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
