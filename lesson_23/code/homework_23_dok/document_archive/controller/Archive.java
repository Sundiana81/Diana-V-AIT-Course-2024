package homework_23_dok.document_archive.controller;

//Реализуйте класс Document и приложение Archive по аналогии с Book и Library.
// Уникальный номер документа содержит 10 цифр.

import homework_23_dok.document_archive.model.Document;

public class Archive {

    // Поля
    private Document[] documents;  // Массив для хранения документов
    private int size;              // Текущее количество документов

    // Конструктор
    public Archive(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }

    // Метод для добавления документа
    public boolean addDocument(Document document) {
        // Проверка на негативные случаи
        //Эта проверка определяет, заполнен ли массив documents.
        // Если текущее количество документов (size) равно длине массива, это значит, что больше документов добавить нельзя.
        //В этом случае метод возвращает false.
        //Эта строка проверяет, существует ли уже документ с таким же идентификатором в массиве.//
        // Метод findDocument() возвращает документ, если он найден, и null, если не найден. Если документ с таким documentId уже существует, метод также возвращает false.

        if (document == null) return false;
        if (size == documents.length) return false;
        if (findDocument(document.getDocumentId()) != null) return false;

        // Добавление документа
        //documents[size] — это обращение к массиву documents по индексу size.
       // В массиве documents хранятся объекты типа Document.
        documents[size] = document;
        size++;
        return true;
    }

    // Метод для поиска документа по уникальному номеру
   // на каждой итерации цикла проверяется,
    // совпадает ли идентификатор текущего документа (documents[i].getDocumentId())
    // с переданным идентификатором documentId.
    public Document findDocument(long documentId) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId) {
                return documents[i];
            }
        }
        return null;
    }

    // Метод для удаления документа по уникальному номеру
    //Document victim = documents[i];: найденный документ сохраняется в переменной victim, чтобы потом вернуть его в конце метода.

    //documents[i] = documents[size - 1];: текущий документ (documents[i]) заменяется последним документом в массиве (documents[size - 1]).
    // Это позволяет избежать "дыр" в массиве после удаления, сохраняя все оставшиеся документы непрерывно.

   // documents[size - 1] = null;: последний элемент массива (который теперь скопирован на место удаленного документа) устанавливается в null, чтобы явно указать, что место пустое.
    // Это также предотвращает утечку памяти.

    // size--;: уменьшается количество документов в архиве на 1, так как один документ был удален.
     // return victim;: метод возвращает удаленный документ.
    public Document removeDocument(long documentId) {
        for (int i = 0; i < size; i++) {
            if (documents[i].getDocumentId() == documentId) {
                Document victim = documents[i];
                documents[i] = documents[size - 1];
                documents[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    // Метод для получения текущего количества документов
    public int getSize() {
        return size;
    }

    public void printDocuments() {
        for (int i = 0; i < size; i++) {
            System.out.println(documents[i]);
        }
    }
}
