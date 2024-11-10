package homework_01;

public class Currency {
    public static void main(String[] args) {



        // евро в британские фунты

        double money = 200; // euro
        double euro = exchangeEuroToPfund(money);
        System.out.println("Euro:" +euro);


    }// end of main

// метод для конвертации

    private static double exchangeEuroToPfund(double money) {

        double rate = 1.31;
        return money * rate;

    }
} // end of class






