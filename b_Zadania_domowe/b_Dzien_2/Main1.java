package b_Zadania_domowe.b_Dzien_2;

public class Main1 {
    public static void main(String[] args) {

        Author author = new Author(1, "Dan", "Brown", "Dany");
        Book book = new Book(1, "Chata", author);
        User user = new User(1, "Jan", "Kowalski");

        Author author1 = new Author(2, "Jan", "Matusz", "John");
        Book book1 = new Book(2, "Było sobie morze");

        book1.setAuthor(author1);
        book1.setCurrentUser(user);

        book.setCurrentUser(user);
        book.equals(book);

        System.out.println(book.printInfoAboutBook());
        System.out.println(book1.printInfoAboutBook());

        //book.returnBook(book);
        System.out.println(book.printInfoAboutBook());

        Person person = new Person();
        person.setName("Maciej");
        person.setLastName("Aniserowicz");
        person.setId(1);

        user.returnBook(book);
        System.out.println(book.printInfoAboutBook());
        user.returnBook(book1);
        System.out.println(book1.printInfoAboutBook());

        System.out.println(book.printSetCurrrentUser());

    }
}
