package b_Zadania_domowe.b_Dzien_2;
import java.util.Arrays;

public class User extends Person {
    private int id;
    private String firstName;
    private String lastName;
    private Book[] books;


    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addBook(Book book) {
        this.books = new Book[]{};
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

    public String currentUserToString() {
        return  String.format("\n\t ID użytkownika: %d, \n\t Imie: %s, \n\t Nazwisko: %s", this.id
                , this.firstName, this.lastName);
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        this.books[this.books.length - 1] = null;
        try {
            book.setCurrentUser(null);
        } catch (NullPointerException e) {
            System.out.println("Book is available in library");
        }
    }
}