package classwork_24.book_library.controller;
// Реализовать методы:
//- печать списка всех книг в библиотеке;
//- получение кол-ва книг в библиотеке;
//- поиска книги по ISBN;
//- добавление книги в библиотеку с учетом требований:
//  - не добавлять null
//  - не добавлять дубликат
//  - не добавлять больше, чем может вместить в себя библиотека.
//- удаление книги из библиотеки.

import classwork_24.book_library.model.Book;

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
     public boolean addBook(Book book){// OBJEKT  siuda prisliut vsio v book
        // negative cases
        if(book == null){
            return false;
        }
        if (size == books.length){
            return false;
        }
        if (!(findBook(book.getIsbn()) == null)){ // vosklicanelinyj znak
            return false;

        }
        // POSITIVE CASE
         books[size] = book; // size eto krajniaja kniga // stavim knigu v konec massiva,
         //mi stavim na pervoe svobodnoe mesto
        size++; // i posle etogo ++ vyrascivaet


        return true;
      }
    // size ++

    //  viod printBooks
    public void printBooks(){
        for (int i = 0; i < size; i++) { // skolko knig poisk
            System.out.println(books[i]);

        }
    }


      public Book findBook(long isbn) {
          for (int i = 0; i < size; i++) {
              if (books[i].getIsbn() == isbn) {
                  return books[i]; // esli sovpali vozbrasciaem i
              }
          }
          return null;   // zameniaet tip objekta null
//        Book foundBook = null;
//        return foundBook;
      }

     public Book removeBook(long isbn) {

         for (int i = 0; i < size; i++) {
             if (books[i].getIsbn() == isbn) {
                 Book victim = books[i];
                 books[i] = books[size - 1];// last book put instead victim
                 books[size - 1] = null;// ZATERAEM POSLEDNIJ ELEMENT MASSIVA KNIGU
                 size--;
                 return victim;
             }
         }
     return null;
     }



    //  boolean updateBook()



    public  int size(){
        return size;
    }

}
