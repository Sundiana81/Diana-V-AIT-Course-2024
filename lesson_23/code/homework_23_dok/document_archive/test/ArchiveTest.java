package homework_23_dok.document_archive.test;


import homework_23_dok.document_archive.controle.Archive;
import homework_23_dok.document_archive.model.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArchiveTest {

    Archive archive;
    Document[] documents;

    @BeforeEach
    void setUp() {
        archive = new Archive(5); // Создаем архив с вместимостью 5
        documents = new Document[5];

        documents[0] = new Document("Doc1", "Author1", 1_234_567_890L);
        documents[1] = new Document("Doc2", "Author2", 1_234_567_891L);
        documents[2] = new Document("Doc3", "Author3", 1_234_567_892L);
        documents[3] = new Document("Doc4", "Author4", 1_234_567_893L);

        // Добавляем документы в архив
        for (int i = 0; i < documents.length - 1; i++) {
            archive.addDocument(documents[i]);
        }
    }

    @Test
    void addDocumentTest() {
        assertFalse(archive.addDocument(null)); // Не добавлять null
        assertFalse(archive.addDocument(documents[3])); // Не добавлять дубликат
        Document newDocument = new Document("Doc5", "Author5", 1_234_567_894L);
        assertTrue(archive.addDocument(newDocument));
        assertEquals(5, archive.getSize());
        // Попробовать добавить документ
        Document anotherDocument = new Document("Doc6", "Author6", 1_234_567_895L);
        assertFalse(archive.addDocument(anotherDocument));
    }

    @Test
    void findDocumentTest() {
        assertEquals(documents[0], archive.findDocument(1_234_567_890L)); // Найти существующий документ
        assertNull(archive.findDocument(1_234_567_899L)); // Поиск несуществующего документа
    }

    @Test
    void removeDocumentTest() {
        assertEquals(documents[0], archive.removeDocument(1_234_567_890L)); // Удалить существующий документ
        assertEquals(3, archive.getSize());
        assertNull(archive.removeDocument(1_234_567_899L)); // Попытка удалить несуществующий документ
    }

    @Test
    void printDocumentsTest() {
        archive.printDocuments();
    }
}

