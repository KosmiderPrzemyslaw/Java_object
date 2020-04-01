package a_Zadania.a_Dzien_2.a_Dziedziczenie;

import a_Zadania.a_Dzien_1.d_Konstruktor.Calculator;

public class AdvancedCalculatorExample {

    public static void main(String[] args) {
        // kalkulator 1
        AdvancedCalculator calc1 = new AdvancedCalculator();

        calc1.pow(4, 2); // 16
        calc1.root(16, 2); // 4
        calc1.root(2, 2); // 1,4....
        calc1.root(125, 3); // 5

        calc1.add(150, 250); // 400

        calc1.printOperations();
        System.out.println();

        // kalkulator 2
        AdvancedCalculator calc2 = new AdvancedCalculator();
        calc2.multiply(150, 4); // 600
        calc2.divide(180, 3); // 60

        calc2.printOperations();
        System.out.println();

        // global operations na 4 różne sposoby
        calc1.printGlobalOperations();
        calc2.printGlobalOperations();
        AdvancedCalculator.printGlobalOperations();
        Calculator.printGlobalOperations(2);

    }

}