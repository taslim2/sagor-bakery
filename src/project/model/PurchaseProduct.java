package project.model;

import java.util.Date;

/**
 *
 * @author Mnselim
 */
public class PurchaseProduct {

    
    private String product_name;
    private float unite_price;
    private int quantity;
    private float product_price;



    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getUnite_price() {
        return unite_price;
    }

    public void setUnite_price(float unite_price) {
        this.unite_price = unite_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }    
}
