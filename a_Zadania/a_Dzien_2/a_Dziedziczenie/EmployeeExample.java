package a_Zadania.a_Dzien_2.a_Dziedziczenie;

public class EmployeeExample {
    public static void main(String[] args) {
        Employee pierwszyPracownik = new Employee("1", "pierwszy", "pracownik", 100);
        Employee drugiPracownik = new Employee("2", "drugi", "pracownik", 200);

        pierwszyPracownik.raiseWage(100);
        drugiPracownik.raiseWage(200);

        System.out.println(String.format("Pierwszy pracownik zarabia teraz %s, a drugi %s",
                pierwszyPracownik.wage, drugiPracownik.wage));

        HourlyEmployee hourlyEmployee = new HourlyEmployee("3", "hourly",
                "employee", 100);
        SalariedEmployee salariedEmployee = new SalariedEmployee("4", "salaried",
                "employee", 120);

        int zarobiWTydzien = hourlyEmployee.calculatePayment(40);
        System.out.println("Zarobi w tydz " + zarobiWTydzien);

        int zarobiWMies = salariedEmployee.calculatePayment();
        System.out.println("Zarobi w mies " + zarobiWMies);
    }
}