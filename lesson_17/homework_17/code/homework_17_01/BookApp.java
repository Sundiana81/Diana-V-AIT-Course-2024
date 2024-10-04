package homework_17_01;

import homework_17_01.book_objekt.model.Book;

public class BookApp {
    public static void main(String[] args) {

        Book myBook = new Book(  8, "title", "author", 1956, "genge");
         myBook.toString();
        System.out.println(myBook);

        myBook.book();

    }
}
