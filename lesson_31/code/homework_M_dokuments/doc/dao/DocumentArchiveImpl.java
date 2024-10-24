package homework_M_dokuments.doc.dao;

import homework_M_dokuments.doc.model.Document;

import java.util.ArrayList;
import java.util.List;

public class DocumentArchiveImpl implements DocumentArchive {

    private List<Document> documents = new ArrayList<>();

    @Override
    public void addDocument(Document document) {
        documents.add(document);
    }

    @Override
    public boolean removeDocumentById(String id) {
        return documents.removeIf(doc -> doc.getId().equals(id));
    }
    @Override
    public Document findDocumentByTitle(String title) {
        for (Document doc : documents) {
            if (doc.getTitle().equalsIgnoreCase(title)) {
                return doc;
            }
        }
        return null;
    }

    @Override
    public List<Document> findDocumentsByAuthor(String author) {
        List<Document> result = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getAuthor().equalsIgnoreCase(author)) {
                result.add(doc);
            }
        }
        return result;
    }

    @Override
    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }
}