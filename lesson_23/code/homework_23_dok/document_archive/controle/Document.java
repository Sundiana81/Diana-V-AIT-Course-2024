package homework_23_dok.document_archive.controle;
//Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.

import java.util.Objects;

public class Document {

    public static final int ISBN_LENGH = 10;

    private String titel;
    private long isbn;

    public Document(String titel, long isbn) {
        this.titel = titel;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;

        this.isbn = checkIsbn(isbn);
    }

    private long checkIsbn(long isbn) {


        // proverit dlinu isbn po kalicestvu cifr v etom cisle
        if (countDigit(isbn)) {
            return isbn;
        }
        return -1; // signal ne vernyj
    }

    private boolean countDigit(long isbn) {
        //  String.valueOf(isbn).length() == 10; // xoroshij podhod; TREBUETSIA MNOGO RESUSSOV
        // MOZNO CIKLOM FOR TEK KAK IZVESTNO SKOLKO RAZ DOLZNO OTRBOTAT
        int count = 0;
        while ((isbn / 10 != 0)) {
            count++;
        }
        return count == ISBN_LENGH;  // v return logiceskoe vyrazenie

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return isbn == document.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

}


