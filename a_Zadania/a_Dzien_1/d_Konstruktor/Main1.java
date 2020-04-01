package a_Zadania.a_Dzien_1.d_Konstruktor;

public class Main1 {
    public static void main(String[] args) {

        Burger burger = new Burger(12, 23);

        Person person = new Person("imie", "nazwisko");
        Person person1 = new Person("imie", 23);
        Person person2 = new Person("imie", "nazwisko", 12, 'F');



        Calculator calculator = new Calculator();

        calculator.add(2,4);
        calculator.divide(10, 2);
        calculator.multiply(3,3);
        calculator.subtract(10, 5);

        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();


    }
}
