
package project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import project.model.Product;
import project.util.DataUtil;

/**
 *
 * @author Mnselim
 */
public class ProductDao implements SagorBakery<Product>{
    DataUtil dataUtil = new DataUtil();
    
    
    @Override
    public ArrayList<Product> getAll() throws SQLException {
        String sql="SELECT * FROM product";
        ArrayList<Product> products = new ArrayList<Product>();
        ResultSet rs = dataUtil.select(sql);
            while(rs.next()){
                Product p = new Product();
                p.setProduct_id(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setUnite_price(rs.getFloat(3));
                
                products.add(p);
            }
        return products;
    }

    @Override
    public boolean save(Product value) throws SQLException {
        String sql="INSERT INTO product VALUES("+value.getProduct_id()+",'"+value.getName()+"',"+value.getUnite_price()+")";
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean update(Product value) throws SQLException {
        String sql="UPDATE product SET name='"+value.getName()+"', unite_orice="+value.getUnite_price()+" WHERE product_id="+value.getProduct_id();
        dataUtil.DML(sql);
        return true;
    }

    @Override
    public boolean delete(Product value) throws SQLException {
        String sql="DELETE FROM product WHERE product_id="+value.getProduct_id();
        return true;
    }

    @Override
    public Product find(int id) throws SQLException {
        String sql="SELECT * FROM product WHERE product_id="+id;
        ArrayList<Product> products= new ArrayList<Product>();
        ResultSet rs = dataUtil.select(sql);
                while(rs.next()){
                    Product p = new Product();
                    p.setProduct_id(rs.getInt(1));
                    p.setName(rs.getString(2));
                    p.setUnite_price(rs.getFloat(3));
                    return p;
                }
                return null;
    }
    
}
