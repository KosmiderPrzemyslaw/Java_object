package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;

public class CartItem {
    protected Product product;
    protected int quantity;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getSum() {
        return this.quantity + this.product.getPrice();
    }
}
