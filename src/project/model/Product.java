package project.model;

/**
 *
 * @author Mnselim
 */
public class Product {

    private int product_id;
    private String name;
    private float unite_price;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getUnite_price() {
        return unite_price;
    }

    public void setUnite_price(float unite_price) {
        this.unite_price = unite_price;
    }

}
