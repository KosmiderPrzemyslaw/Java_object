package a_Zadania.a_Dzien_1.c_Metody;

public class Car {
    public String brand;
    public String model = "Opel";
    public int price;

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public void setModel(String model) {
        this.model = model;

    }

    public void setPrice(int price) {

        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {

        return model;
    }

    public int getPrice() {

        return price;
    }

    public String toString() {

        return "brand: " + this.brand + ", model: " + this.model + ", price: " + this.price;

    }


}
