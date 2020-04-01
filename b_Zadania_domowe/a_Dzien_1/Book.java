package b_Zadania_domowe.a_Dzien_1;


public class Book {
    private int bookId;
    private String bookTittle;
    private boolean available = true;
    private Author author;
    private Author[] additionalAuthors;
    private User currentUser;


    public String printInfoAboutBook() {
        return String.format("Informacje o książce: \nID: %d\n" +
                        "Tytuł: %s \n" +
                        "Dostępność: %s\n" +
                        "Autor: %s\n" +
                        "Dodatkowi autorzy: %s\n" +
                        "Aktualnie wyporzyczył: %s\n"
                , bookId, bookTittle, available, author.authorToString(),
                author.additionalAuthorsToString(additionalAuthors),
                currentUser.currentUserToString());
    }

    public void setCurrentUser(User currentUser) {
        available = false;
        currentUser.addBook(this);
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    Book(int bookId, String tittle) {
        this.bookId = bookId;
        this.bookTittle = tittle;
    }

    Book(int bookId, String tittle, Author author) {
        this.bookId = bookId;
        this.bookTittle = tittle;
        this.author = author;
    }

    Book(int bookId, String tittle, Author author, Author[] additionalAuthors) {
        this.bookId = bookId;
        this.bookTittle = tittle;
        this.author = author;
        this.additionalAuthors = additionalAuthors;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public boolean isAvailable() {
        return available;
    }

    public Author getAuthor() {
        return author;
    }

    public Author[] getAdditionalAuthors() {
        return additionalAuthors;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setAdditionalAuthors(Author[] additionalAuthors) {
        this.additionalAuthors = additionalAuthors;

    }
}