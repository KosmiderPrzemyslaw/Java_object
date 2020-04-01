package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Employee {
    public String id;
    public String firstName;
    public String lastName;
    public int wage;

    public Employee(String id, String firstName, String lastName, int wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void raiseWage(int percent) {
        if (percent < 0) {
            throw new IllegalArgumentException("Cannot decrease employee's wage");
        }
        this.wage = this.wage + (this.wage * percent / 100);

    }
}
