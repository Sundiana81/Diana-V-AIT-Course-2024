package classwork_24.book_library.test;

import classwork_24.book_library.controller.Library;
import classwork_24.book_library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library; // objekt

    Book[] books;
    int size = 0;

//void testMultiply(){ assertEquals(20, calculator.multiply(4,5),"4*5 should be 20");
    @BeforeEach
    void setUp() {

        library = new Library(5); // vyzvoli novyj konstruktor

        books = new Book[5];

        // massiva v kotoryx lezat objekty
        books[0] = new Book("1984", "Oruell", 1_111_111_111_110L,2010);
        books[1] = new Book("T1", "A1", 1_111_111_111_111L,2011);
        books[2] = new Book("T2", "A2", 1_111_111_111_112L,2009);
        books[3] = new Book("T3", "A3", 1_111_111_111_113L,2005);

        // TODO
        // polozit objekty b massiv, kotoryj vnutri objekta libarary
        for (int i = 0; i < books.length -1 ; i++) { // poka 4 knigi kladem v biblioteku // size = 4
            library.addBook(books[i]);
        }
    }
// method addBook on boolean(true libo false)


//- не добавлять больше, чем может вместить в себя библиотека.

    @Test
    void addBookTest(){
        //- не добавлять null
        assertFalse (library.addBook(null));
        //- не добавлять дубликат
        assertFalse(library.addBook(books[2]));
        // dobavliaem knigu
        Book newBook = new Book("T4", "A4",1_111_111_111_114L, 2024);
        assertTrue(library.addBook(newBook));
        assertEquals(5, library.size());
        // dobavliaem escio obnu capacity
        Book oneMoreBook = new Book("T5", "A4",1_111_111_111_115L, 2024);
        assertFalse(library.addBook(oneMoreBook));




    }

    @Test
    void findeBookTest(){
        Book foundBook = library.findBook(1_111_111_111_110L);
        assertEquals(books[0], library.findBook(1_111_111_111_110L)); // verniot objekt 0 books 0
        assertNull(library.findBook(1_111_111_111_119L)); // find absent book

    }

    @Test
    void remuvebBookTest(){
        // udalenie knigi sucectvujuscei
        assertEquals(books[0],library.removeBook( 1_111_111_111_110L)); //Equals on vozvrasciaet
        assertEquals(3,library.size());
        // remuve absent book
        assertNull(library.removeBook(1_111_111_111_119L));

    }
    @Test
    void sizeTest(){
        assertEquals(4, library.size());

    }
    @Test
    void printBookTest(){
        System.out.println("______________");
        library.printBooks();
    }

    @Test
    void updateBookTest(){

        Book newBook = new Book("New book", "Super Puper", 1_111_111_111_114L, 2005);
        library.addBook(newBook);
        //library.update



    }

}