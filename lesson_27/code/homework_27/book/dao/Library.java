package homework_27.book.dao;


import homework_27.book.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements Searchable {

    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (author.equalsIgnoreCase(book.getAuthor())) {
                result.add(book);
            }
        }
        return result;
    }
}
