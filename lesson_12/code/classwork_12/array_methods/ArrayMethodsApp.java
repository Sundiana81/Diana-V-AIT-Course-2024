package classwork_12.array_methods;

import java.util.Scanner;

public class ArrayMethodsApp {

    public static void main(String[] args) {

     int[] myArray = ArrayMethods.fillArray(- 10, 20,30);

     ArrayMethods.printArray(myArray);  // staticeskie metody klassa //

        Scanner scanner = new Scanner(System.in);
        System.out.println("IMPU.");
                int n = scanner.nextInt();

                boolean isInArray = ArrayMethods.searchInarray(myArray, n );
        System.out.println(" Numbers" + n + "is in array:" + isInArray);
    }
}
