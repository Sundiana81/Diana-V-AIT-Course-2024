package classwork_45.file_copy;
//пишем утилиту для копирования файла
// имена файлов передаются в аргументы командной строки


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageAppl {

    public static void main(String[] args) {
       // String[] args - он отвечает за получение аргументов
        // проверяем что аргумента 2
        if(args.length !=2 ){
            System.out.println("Wrong numbers of arguments.");
        }
        // print file
        // аргументы имена файлов
        System.out.println("Source file:" + args[0]);
        System.out.println("Destination file:" + args[1]);


        try (FileInputStream fin = new FileInputStream(args[0])) {
            FileOutputStream fout = new FileOutputStream(args[1]);

            // читает пока не наткнёмся на != -1б пишем во 1 -й файл
            int a = fin.read(); // read 1st byte
            while (a != -1) {
                fout.write(a);
                a = fin.read();
            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}