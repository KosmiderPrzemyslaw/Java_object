package a_Zadania.a_Dzien_2.b_Zaawansowana_obiektowosc;


public class Product {
    private static int nextId;
    private int id;
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price) {
        this.id = nextId;
        nextId++;
        this.setName(name);
        this.setPrice(price);
    }

    public void setPrice(double price) {
        if (price < 0.01) {
            throw new IllegalArgumentException("Price cannot be lower than: " + price);
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}
