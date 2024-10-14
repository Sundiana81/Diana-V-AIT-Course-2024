package classwork_23.book_library.controller;

import classwork_23.book_library.model.Book;

public class Library {

    // fields
    private Book[] books;  // peremennaja
    private int size;// tekuscee kol-vo knig  // skolko zaniatyh

    // contruktos

    public Library(int capacity) {
        this.books = new Book[capacity];  // nuznoj dlinny masiv
        this.size = 0; // objektov 0
    }

    // CRUD METHODS
    //  boolean addbook(Book book) objekt
    // size ++

    //  viod printBooks




      public Book findBook(long isbn){
        Book foundBook = null;
        return foundBook;
     }



    // BOOK removeBook(long isbn)
    // size --


    //  boolean updateBook()



    public  int size(){
        return size;
    }



}
