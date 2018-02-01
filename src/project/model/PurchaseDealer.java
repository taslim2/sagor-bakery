/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.model;

import java.util.Date;

/**
 *
 * @author Mnselim
 */
public class PurchaseDealer {
    
    private String dealer_name;
    private float due_amount;
    private Date date;

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name;
    }

    public float getDue_amount() {
        return due_amount;
    }

    public void setDue_amount(float due_amount) {
        this.due_amount = due_amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
