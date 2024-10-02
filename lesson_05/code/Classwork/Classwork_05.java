package Classwork;

public class Classwork_05 {
    public static void main(String[] args) {
        // перевод доллара в евро

        double money = 500; // dollars
        double euro = exchangeDollarsToEuro(money);
        System.out.println("Euro:" + euro);


    } // edn of main

    // метод для конвертации
    private static double exchangeDollarsToEuro(double money) {
        double rate = 0.9;
        return money * rate;
    }

}  // end of class

