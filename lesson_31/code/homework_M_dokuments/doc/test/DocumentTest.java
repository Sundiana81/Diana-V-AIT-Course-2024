package homework_M_dokuments.doc.test;

import homework_M_dokuments.doc.dao.DocumentArchive;
import homework_M_dokuments.doc.dao.DocumentArchiveImpl;
import homework_M_dokuments.doc.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    DocumentArchive archive;

    @BeforeEach
    void setUp() {

        archive = new DocumentArchiveImpl();
        archive.addDocument(new Document("1", "Name1", "Autor1"));
        archive.addDocument(new Document("2", "Name2", "Autor2"));
        archive.addDocument(new Document("3", "Name3", "Autor3"));
        archive.addDocument(new Document("4", "Name4", "Autor4"));


    }
    @Test
    void testAddAndFindDocument() {
        Document doc = new Document("5", "Name5", "Autor5");
        archive.addDocument(doc);
        assertEquals(doc, archive.findDocumentByTitle("Name5"));
    }

    @Test
    void testRemoveDocument() {
        assertTrue(archive.removeDocumentById("4"));
        assertNull(archive.findDocumentByTitle("Name4"));
    }

    @Test
    void testFindDocumentsByAuthor() {
        List<Document> orwellDocs = archive.findDocumentsByAuthor("Autor3");
        assertEquals(1, orwellDocs.size());
    }

    @Test
    void testGetAllDocuments() {
        List<Document> documents = archive.getAllDocuments();
        assertEquals(4, documents.size());
    }
}