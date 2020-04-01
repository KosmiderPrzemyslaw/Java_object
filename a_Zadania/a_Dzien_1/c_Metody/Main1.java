package a_Zadania.a_Dzien_1.c_Metody;


public class Main1 {

    public static void main(String[] args) {

        Person person = new Person();
        person.setAge(19);
        person.setGender('F');
        person.setName("Konrad");
        person.setSurname("Kowalski");
        System.out.println(person);
        System.out.println(person.getFullName("imię", "nazwisko"));
        person.increaseAge(18);

        Product product = new Product();
        product.setName("NameOfProduct");
        System.out.println(product.getName());

        Car car = new Car();
        car.setPrice(123);
        car.setModel("Corolla");
        car.setBrand("Toyota");

        System.out.println(car);
    }
}
