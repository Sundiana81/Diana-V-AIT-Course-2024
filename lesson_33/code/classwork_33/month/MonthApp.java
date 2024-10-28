package classwork_33.month;

public class MonthApp {
    public static void main(String[] args) {

        Month m = Month.AUG;  // переменная m
        System.out.println("Start month:" + m);

        int k = 29;

        m = m.pliusMaonth(k);// m + 6;
        System.out.println("After " + k + " months: " + m);  // res плус 6 месяцев FEB


    }
}
