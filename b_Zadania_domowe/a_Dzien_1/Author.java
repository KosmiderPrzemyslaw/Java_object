package b_Zadania_domowe.a_Dzien_1;


public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String pseudonym;

    public String authorToString(){
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

    public String additionalAuthorsToString(Author[] authors) {
        String returnValue = "";
        for(int i = 0; i < authors.length; i++) {
            returnValue += String.format("AdAutNum" + i +".: %s, ", authors[i]);

        }
        return returnValue;

    }

    public static void main(String[] args) {
        Author author = new Author(1, "name", "lastname", "s");
        Author author1 = new Author(2, "name2", "lastname1", "t");
        Author author2 = new Author(3, "name3", "lastname2", "w");
        Author[] authors = {author, author1, author2};

        System.out.println(author.additionalAuthorsToString(authors));
    }

}
