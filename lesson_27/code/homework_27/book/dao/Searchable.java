package homework_27.book.dao;

import homework_27.book.model.Book;

import java.util.List;

public interface Searchable {


    List<Book> searchByAuthor(String author);
}
