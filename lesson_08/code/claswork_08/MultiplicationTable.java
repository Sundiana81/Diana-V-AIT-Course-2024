package claswork_08;

//Распечатать в консоли таблицу умножения от 1 до 10.

import java.sql.SQLOutput;

public class MultiplicationTable {

    public static void main(String[] args) {

       // cikl b cikle
       int i = 1, j = 1;

       while ( i <= 10){   // ili <0 ili 11
         while (j <= 10){

             System.out.print(i + " x " + j + " = " + (i*j) + " | "); // "" simvoly v konsole
             j++;




         } // END OF WHILE J

          j = 1;
          i++;
           System.out.println(); // novaja stroka vostanovit uslovie

       } // END OF WHEL I


    }
}
