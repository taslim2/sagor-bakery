package project.model;

/**
 *
 * @author Mnselim
 */
public class Dealer {

    private int dealer_id;
    private String name;
    private String phone_no;
    private String address;
    private float due_balance;

    public int getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(int dealer_id) {
        this.dealer_id = dealer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getDue_balance() {
        return due_balance;
    }

    public void setDue_balance(float due_balance) {
        this.due_balance = due_balance;
    }

}
