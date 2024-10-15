package classwork.book_library.model;

// Создать класс Book с полями:
// long isbn, String title, String author, int yearOfPublishing.
// Проверить ISBN на корректное количество цифр = 13

import java.util.Objects;

public class Book {

    public static final int ISBN_LENGH = 13; // konstanta

    // field  // ABSTRAGIROVANIE
    // DELAEM INKAPSULIACIJU
    private String titel;
    private String author;
    private long isbn;
    private int yeaOfPublishing;

    // contruktor
    public Book(String titel, String author, long isbn, int yeaOfPublishing) {
        this.titel = titel;
        this.author = author;
        this.yeaOfPublishing = yeaOfPublishing;
//        if (IsIsbnValid){    // eto odin metod
//            this.isbn = isbn;
//
//        }

        //VTORIJ METOD
        this.isbn = checkIsbn(isbn);

    }
     // u longa tolko dannye v cisle
    private long checkIsbn(long isbn) {
        // proverit dlinu isbn po kalicestvu cifr v etom cisle
        if(countDigit(isbn)){
            return isbn;
        }
        return -1; // signal ne vernyj
    }

    private boolean countDigit(long isbn) {
        //  String.valueOf(isbn).length() == 13; // xoroshij podhod; TREBUETSIA MNOGO RESUSSOV
        // MOZNO CIKLOM FOR TEK KAK IZVESTNO SKOLKO RAZ DOLZNO OTRBOTAT
        int count = 0;
        long temp = isbn; // perelozili isbn cto by ne isportit znacenije ,
        // i rabotaem v cikle s temp peremennoj

        while ((temp != 0)) {
            temp = temp / 10;
            count++;
        }
        return count == ISBN_LENGH;  // v return logiceskoe vyrazenie

    }

    public long getIsbn() {
        return isbn;
    }

    // ---------------------------------------------------
public void setIsbn(long isbn) {
        if (checkIsbn(isbn) > 0){
            this.isbn = checkIsbn(isbn);

        }else {
            System.out.println("ISBN is not correct");
        }
  //  this.isbn = isbn;
}


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYeaOfPublishing() {
        return yeaOfPublishing;
    }

    public void setYeaOfPublishing(int yeaOfPublishing) {
        this.yeaOfPublishing = yeaOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn; // dblikat ne dobavit
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("titel='").append(titel).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yeaOfPublishing=").append(yeaOfPublishing);
        sb.append('}');
        return sb.toString();
    }


}
