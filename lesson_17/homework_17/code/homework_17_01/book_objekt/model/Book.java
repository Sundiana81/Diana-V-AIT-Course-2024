package homework_17_01.book_objekt.model;

//Создайте класс Book с полями:
//
//    уникальный номер ISBN
//    название title
//    автор author
//    год издания yearOfPublishing
//    жанр genre
//
//В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
// Создайте конструктор, в котором нет поля ISBN. Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    private int ISBN = 8;
    private String title;
    private String author;
    private int yearOfPublishing = 1956;
    private String genre;

    public Book(int ISBN, String title, String author, int yearOfPublishing, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String isbn, Object o) {
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String display() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Book(int ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String author, String title, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }
   public void book(){
       System.out.println("ISBN=" + ISBN +
               ", title '" + title + '\'' +
               ", author '" + author + '\'' +
               ", yearOfPublishing " + yearOfPublishing +
               ", genre '" + genre + '\'' );
   }

}