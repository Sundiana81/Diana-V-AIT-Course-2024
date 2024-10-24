package homework_M_dokuments.doc.dao;

import homework_M_dokuments.doc.model.Document;

import java.util.List;

public interface DocumentArchive {

    void addDocument(Document document);
    boolean removeDocumentById(String id);
    Document findDocumentByTitle(String title);
    List<Document> findDocumentsByAuthor(String author);
    List<Document> getAllDocuments();
}


