package homework_45.compare_file;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide the names of two files to compare.");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            // Check file lengths
            //  Проверка длины файлов
            long length1 = fis1.getChannel().size();
            long length2 = fis2.getChannel().size();

            if (length1 != length2) {
                System.out.println("Files differ in length and are not identical.");
                return;
            }

            // Byte-by-byte content comparison
            // Сравнение содержимого побайтово
            int byte1, byte2;
            boolean areFilesIdentical = true;

            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {//означают, что цикл будет продолжаться
                                                            // только если оба файла содержат ещё байты для чтения.
                if (byte1 != byte2) { //проверяется, равны ли значения считанных байтов из обоих файлов.
                    areFilesIdentical = false;
                    break;
                }
            }

            if (areFilesIdentical) {
                System.out.println("The files are identical.");
            } else {
                System.out.println("The files differ in content.");
            }

        } catch (IOException e) {
            System.out.println("Error while processing files: " + e.getMessage());
        }
    }
}
