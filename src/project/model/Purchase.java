
package project.model;

import java.util.Date;

/**
 *
 * @author Mnselim
 */
public class Purchase {
    private int purchase_id;
    private int dealer_id;
    private Date date;
    private float total_price;
    private float submite_amount;
    private float today_due;

    public float getToday_due() {
        return today_due;
    }

    public void setToday_due(float today_due) {
        this.today_due = today_due;
    }
    
    

    public int getPurchase_id() {
        return purchase_id;
    }

    public void setPurchase_id(int purchase_id) {
        this.purchase_id = purchase_id;
    }

    public int getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(int dealer_id) {
        this.dealer_id = dealer_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = total_price;
    }

    public float getSubmite_amount() {
        return submite_amount;
    }

    public void setSubmite_amount(float submite_amount) {
        this.submite_amount = submite_amount;
    }
    
    
    
}
