package b_Zadania_domowe.a_Dzien_1;

public class BookExample {
    public static void main(String[] args) {
        Author author = new Author(1, "George", "Orwl", "gorgi");
        Author author2 = new Author(2, "John", "Utah", "uti");
        Author author3 = new Author(3, "Carolyne", "Arcan", "arci");
        Author[] tabAuthor = new Author[2];
        //tabAuthor[0] = author;
        tabAuthor[0] = author2;
        tabAuthor[1] = author3;
        Book book = new Book(122, "Thinking in Java", author, tabAuthor);


        System.out.println(String.format("Autor: %s", book.getAuthor()));
        System.out.println(book.getBookId());
        System.out.println(book.getBookTittle());

    }

}
