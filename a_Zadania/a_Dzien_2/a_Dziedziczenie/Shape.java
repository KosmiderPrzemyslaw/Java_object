package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {

        return String.format("center [%s, %s], color [%s]", this.x, this.y, this.color);
    }

    public double getDistance(Shape shape) {
        return Math.sqrt(
                Math.pow(shape.x - this.x, 2) + Math.pow(shape.y - this.y, 2)
        );
    }
}
