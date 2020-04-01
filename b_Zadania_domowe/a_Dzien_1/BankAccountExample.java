package b_Zadania_domowe.a_Dzien_1;

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(132131);
        bankAccount.depositCash(300);
        bankAccount.withdrawCash(200);
        System.out.println(bankAccount.getCash());
        System.out.println(bankAccount.getNumber());
        System.out.println(bankAccount.printInfo());
    }
}
