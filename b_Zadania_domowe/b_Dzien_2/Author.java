package b_Zadania_domowe.b_Dzien_2;


public class Author extends Person {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;


    public String authorToString() {
        return String.format("\n\tImie: %s\t\n" +
                        "\tNazwisko: %s\t\n" +
                        "\tPseudonim: %s",
                firstName, lastName, pseudonym);
    }

    Author(int id, String firstName, String lastName, String pseudonym) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pseudonym = pseudonym;
    }
}
