package classwork_10;

public class Task3 {

    public static void main(String[] args) {

        int[] array = { - 145, 75, 34, -15, -123, 57, -145, 86, 77, -145, 48, -59, -145 };

        int[] arrayOfIndex = new int[array.length];

        int x = -145;
        int count = 0; // SCIOTCIK

        int j = 0; // индекс для массива индексов

        for (int i = 0; i < array.length; i++) {
            if(array[i] == x){
                count++; // SCITAET SKOLKO ELEMENTOV
                System.out.print(i + " "); // PECIATAEM SRAZU
                arrayOfIndex[j] = i; // заносим индекс во 2-й массив
                j++; // увеличиваем индекс 2-го массива
            }
        }

        System.out.println();
        System.out.println(count);

        // печатаем массив индексов
        for (int K = 0; K < j; K++) {  // To KOL MASIVOV CTO POPALI 4 ESCIO OTDELNYJ SCIOTCIK FOR // MOZNO K MOZNO i
            System.out.print(arrayOfIndex[K] + " "); // peciataem sformirovanyj masiv
        }
    }
}