package classwork_14;

public class ArrayMethodsApp {

    public static void main(String[] args) {

        // create array with random numbers
       // int[] myArray = ArrayMethods.fillArray(0, 100, 10);

        // print array
      //  ArrayMethods.printArray(myArray);

        // sort array
      //  ArrayMethods.bubbleSort(myArray);

        // print array
      //  ArrayMethods.printArray(myArray);


        int[] newAraay = ArrayMethods.fillArray(15,20,6);
        ArrayMethods.printArray(newAraay);
        ArrayMethods.reverseArray(newAraay);
        ArrayMethods.printArray(newAraay);


        //int[] myArray = ArrayMethods.fillArray(- 10, 20,30);

        // ArrayMethods.printArray(myArray);  // staticeskie metody klassa //

        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("IMPU.");
        //        int n = scanner.nextInt();

        //       boolean isInArray = ArrayMethods.searchInarray(myArray, n );
        //System.out.println(" Numbers" + n + "is in array:" + isInArray);

//        int[] myArray = {10, 20, 30, 40, 50};
//        System.out.println(ArrayMethods.linearSearch(myArray, 10));
//        System.out.println(ArrayMethods.linearSearch(myArray, 100));
//
//        System.out.println("-------------------------------------------");
//
//        int index = ArrayMethods.binarySearch(myArray, 20);
//        System.out.println(index);

    }

}



