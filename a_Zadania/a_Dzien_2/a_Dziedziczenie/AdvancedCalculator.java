package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {

    private final static double PI = 3.14159265;

    public int pow(int num1, int num2) {
        int result = (int) Math.pow(num1, num2);

        super.saveOperation(String.format("%s ^ %s equals %s", num1, num2, result));

        return result;
    }

    public double root(int num1, int num2) {
        double result = Math.pow(Math.E, Math.log(num1) / num2);

        super.saveOperation(String.format("%s root of %s equals %s", num2, num1, result));
        // może być też this.saveOperation(....

        return result;
    }

    public static double computeCircleArea(double r) {
        double circleArea = PI * r * r;

        // poniże się nie kompiluje bo nie jest metodą statyczną
//        this.saveOperation(String.format("Area of circle with radius %s equals %s", r, circleArea));

        saveGlobalOperation(String.format("Area of circle with radius %s equals %s", r, circleArea));
        return circleArea;
    }


}


