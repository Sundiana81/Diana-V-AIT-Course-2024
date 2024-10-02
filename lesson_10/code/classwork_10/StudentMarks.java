package classwork_10;

//Имеются оценки абитуриента из его аттестата.
//Найдите средний балл абитуриента.

public class StudentMarks {

    public static void main(String[] args) {

    // PRIAMAJA INZILIZACIJA MASIVA

    int[] marks = { 1, 6, 1, 4, 3, 1, 2, 3, 3, 2, 5, 2, 2 };   //objavlenie masiva v javnom vide i zapolnili

      int sum = 0;

        for (int i = 0; i < marks.length ; i++) {  //fori
            sum = sum + marks[i];  // ukazyvaem indeks msiva // K NULIU DABAVLIAET PERVYJ CIKL{1,2,3,

        }

        System.out.println("Sum = "+ sum);

        double averageMark = (double) sum / marks.length; // SUMMU NA KOL OCENOK // kasting (double)
        System.out.println("Average mark = " + averageMark);


        }

    }


