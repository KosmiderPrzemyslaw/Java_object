package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", radius [" + this.radius + "]";
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircuit() {
        return 2 * radius * Math.PI;
    }

}
