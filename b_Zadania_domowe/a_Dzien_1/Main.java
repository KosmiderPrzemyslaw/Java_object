package b_Zadania_domowe.a_Dzien_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author = new Author(1, "Maiciej,", "Aniserowicz", "Ans");
        Author author1 = new Author(2, "Kamil", "Jakiś", "KAM");
        Author author2 = new Author(3, "Marek", "Kowalski", "Kowal");
        Author author3 = new Author(4, "Oliwier", "Nowak", "Oli");
        Author[] authors = {author, author1, author3};



        Book book = new Book(1, "Zawód programista", author);
        Book book1 = new Book(2, "Księga dżungli", author1);
        Book book2 = new Book(3, "Motomyszy z marsa");
        book2.setAuthor(author2);
        book2.setAdditionalAuthors(authors);
        System.out.println(String.format("add: %s", Arrays.toString(book2.getAdditionalAuthors())));



        User user = new User(1, "Jan", "Kowalski");
        User user1 = new User(2, "Bogdan", "Zając");
        User user2 = new User(3, "Krystian", "Ronaldo");

        //user.addBook(book);
        user1.addBook(book1);
        book1.setCurrentUser(user1);
        book1.setAdditionalAuthors(authors);
        System.out.println(book1.isAvailable());

        user2.addBook(book2);
        book2.setCurrentUser(user2);
        System.out.println(book2.isAvailable());

        System.out.println(user1.currentUserToString());
        System.out.println(book1.printInfoAboutBook());


    }
}
