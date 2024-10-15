package homework_23_dok.document_archive.model;

import java.util.Objects;

public class Document {

    public static final int DOCUMENT_ID_LENGTH = 10; // Константа для длины ID

    // Поля класса
    private String title;
    private String author;
    private long documentId; // Уникальный номер документа (10 цифр)

    // Конструктор
    public Document(String title, String author, long documentId) {
        this.title = title;
        this.author = author;
        this.documentId = checkDocumentId(documentId); // Проверка номера документа
    }

    // Метод для проверки корректности номера документа
    private long checkDocumentId(long documentId) {
        if (countDigits(documentId)) {
            return documentId;
        }
        throw new IllegalArgumentException("Invalid Document ID. It must be exactly 10 digits.");
    }

    // Метод для подсчета количества цифр в номере документа
    //temp — временная переменная, которой присваивается значение documentId.
    // Используем временную переменную, чтобы не изменять сам documentId,
    // так как оригинальное значение может еще понадобиться.
    private boolean countDigits(long documentId) {
        int count = 0;  // temp derzatel Id
        long temp = documentId;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        return count == DOCUMENT_ID_LENGTH;
    }


    public long getDocumentId() {
        return documentId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document document)) return false;
        return documentId == document.documentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId);
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", documentId=" + documentId +
                '}';
    }
}
