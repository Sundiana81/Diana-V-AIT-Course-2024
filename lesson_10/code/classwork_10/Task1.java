package classwork_10;

// **Задача 1.**
//Создайте массив и заполните его целыми числами от 1 до 20.

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int [20]; // DLINNA MASSIVA length = 20, indexes from 0 till 19

       // numbers[0] - 1st element of array
        // numbers.length = 20
        // numbers [numbers.length - 1]

        // FILL IN
        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;  // UVELICIT NA EDINICU  I V KONCOLE PECATAETSIA 1-20

        }
        // reint array numbers

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");  // V STOLBIK UDIRAEM LN

        }
        System.out.println();  // PERESLI NA NOVYJU STROCKU
         // print sout
        System.out.println(numbers);    // link gde hranitsia massiv v konsole, massiv eto ssylocnyj tip.

    }
}
