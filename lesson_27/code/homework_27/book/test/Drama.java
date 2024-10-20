package homework_27.book.test;

import homework_27.book.dao.Library;
import homework_27.book.model.Book;
import homework_27.book.model.FictiotBook;

import java.util.List;

public class Drama {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new FictiotBook(1236, "The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction"));

        System.out.println("Books by F. Scott Fitzgerald:");
        List<Book> booksByFitzgerald;
        booksByFitzgerald = library.searchByAuthor("F. Scott Fitzgerald");
        for (Book book : booksByFitzgerald) {
            System.out.println(book);
        }
        }

        }


