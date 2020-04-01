/*package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


import a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc.CartItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> cartItems = new ArrayList<>();
    boolean foundProduct = false;

    public void addProduct(Product product, int quantity) {
        for (CartItem cartItem : this.cartItems) {
            if (cartItem.getProduct().equals(product)) {
                foundProduct = true;
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            }

        }
        if (!foundProduct) {
            cartItems.add(new CartItem(product, quantity));
        }

    }

    public void removeProduct(Product product) {
        this.cartItems.removeIf(cartItem -> cartItem.getProduct().equals(product));
    }

    public void updateProduct(Product product, int quantity) {
        boolean foundProduct = false;
        for (CartItem cartItem : this.cartItems) {
            if (cartItem.getProduct().equals(product)) {
                foundProduct = true;
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
            }

        }
        if (!foundProduct) {
            throw new IllegalArgumentException("Cannot set quantity for product " + product.getName() +
                    "because is not present in the cart");
        }

    }

    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (CartItem cartItem : this.cartItems) {
            totalQuantity += cartItem.getQuantity();
        }
        return totalQuantity;
    }

    public double getTotalSum() {
        double totalSum = 0.0;
        for (CartItem cartItem : this.cartItems) {
            totalSum += cartItem.getQuantity() * cartItem.getProduct().getPrice();
        }
        return totalSum;
    }

    public void printRecipt() {

        for(CartItem cartItem: this.cartItems) {
            System.out.println(String.format("%s: %s, %s%s = %s",
                    cartItem.getProduct().getId(),
                    cartItem.getProduct().getName(),
                    cartItem.getQuantity(),
                    cartItem.getProduct().getPrice(),
                    cartItem.getSum()
                    ));
        }
        System.out.println("    ---");
        System.out.println("    Razem: " + getTotalSum());
    }
}
*/