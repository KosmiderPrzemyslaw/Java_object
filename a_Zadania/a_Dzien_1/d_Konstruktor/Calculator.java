package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {

    private String[] lastOperations;
    protected static String[] globalOperations;

    // blok static wykonuje się tylko raz gdy aplikacja się włącza (ClassLoader ładuje klasę)
    static {
        globalOperations = new String[]{};
    }

    public Calculator() {
        this.lastOperations = new String[]{};
    }

    public int add(int num1, int num2) {
        int sum = num1 + num2;
        this.saveOperation("Added " + num1 + " to " + num2 + " got result " + sum);
        return sum;
    }

    public int multiply(int num1, int num2) {
        int multiply = num1 * num2;
        this.saveOperation(String.format("Multiplied %s with %s got result %s", num1, num2, multiply));
        return multiply;
    }

    public int subtract(int num1, int num2) {
        int subtract = num1 - num2;
        this.saveOperation(String.format("Subtracted %s from %s got result %s", num2, num1, subtract));
        return subtract;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }

        int divide = num1 / num2;
        this.saveOperation(String.format("Divided %s by %s got result %s", num1, num2, divide));
        return divide;
    }

    public void printOperations() {
        System.out.println("Operations: ");

        for (String operation : this.lastOperations) {
            System.out.println(operation);
        }
    }

    public static void printGlobalOperations() {
        System.out.println("Global operations: ");

        for (String operation : globalOperations) {
            System.out.println(operation);
        }
    }


    public void clearOperations() {
        this.lastOperations = new String[]{};
    }

    // made protected to be visible in AdvancedCalculator
    protected void saveOperation(String result) {
//        String[] newOperations = new String[lastOperations.length + 1];
//        for (int i = 0; i < this.lastOperations.length; i++) {
//            newOperations[i] = this.lastOperations[i];
//        }
//        this.lastOperations = newOperations;

        this.lastOperations = Arrays.copyOf(this.lastOperations, this.lastOperations.length + 1);

        this.lastOperations[this.lastOperations.length - 1] = result;

        saveGlobalOperation(result);
    }

    protected static void saveGlobalOperation(String result) {
        globalOperations = Arrays.copyOf(globalOperations, globalOperations.length + 1);
        globalOperations[globalOperations.length - 1] = result;
    }

    public static void printGlobalOperations(int length) {
        System.out.println(length + "last global operations: ");

        int firstIndex = globalOperations.length - length;

        for (int i = firstIndex; i < globalOperations.length; i++) {
            System.out.println(globalOperations[i]);
        }
    }
}