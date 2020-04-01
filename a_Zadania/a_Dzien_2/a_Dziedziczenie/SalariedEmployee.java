package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class SalariedEmployee extends Employee {
    private final static int HOURS_IN_MONTH = 190;

    public SalariedEmployee(String id, String firstName, String lastName, int wage) {
        super(id, firstName, lastName, wage);
    }

    public int calculatePayment() {
        return wage * HOURS_IN_MONTH;
    }
}
