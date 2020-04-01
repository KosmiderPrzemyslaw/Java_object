package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class ShapeExample {
    public static void main(String[] args) {
        Shape orangeShape = new Shape(20, 20, "orange");
        Shape blueShape = new Shape(10, 30, "blue");

        double distance = orangeShape.getDistance(blueShape);
        System.out.println(String.format("The distance between [%s] and [%s] is %s",
                orangeShape.getDescription(), blueShape.getDescription(), distance));


        Circle redCircle = new Circle(20, 40, "red", 10);

        System.out.println(String.format(redCircle.getDescription()));
        System.out.println(String.format(""));
        System.out.println(redCircle.getArea());
        System.out.println(redCircle.getCircuit());
    }
}
