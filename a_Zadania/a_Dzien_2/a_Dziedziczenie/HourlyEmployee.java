package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class HourlyEmployee extends Employee {
    public HourlyEmployee(String id, String firstName, String lastName, int wage) {
        super(id, firstName, lastName, wage);
    }

    public int calculatePayment(int hours) {
        return wage * hours;
    }
}
