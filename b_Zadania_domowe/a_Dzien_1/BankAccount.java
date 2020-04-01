package b_Zadania_domowe.a_Dzien_1;

public class BankAccount {
    private int number;
    private float cash = 0;

    public int getNumber() {
        return this.number;
    }

    public float getCash() {
        return this.cash;
    }

    public BankAccount (int number) {
        this.number = number;
    }
    void depositCash(double amount) {
        if(amount > 0) {
            cash += amount;
        }
    }

    double withdrawCash(double amount) {
        if(amount > 0 && amount <= cash) {
            cash -= amount;
            return cash;
        }
        else {
            return cash;
        }
    }
    String printInfo() {
      return String.format("Numer konta: %s, Stan konta: %s", this.number, this.cash);
    }
}
