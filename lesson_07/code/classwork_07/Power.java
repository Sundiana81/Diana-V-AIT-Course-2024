package classwork_07;
//Возведите 3 в степень 10, выведите на печать все промежуточные результаты.


public class Power {

    public static void main(String[] args) {

        int pow = ( int ) Math.pow (3, 10); // priobrazovanie tipov
        System.out.println(pow);

        // nacialnoe znacenie

        int count = 0 ; // parametry cikla
        int res = 1;

        while (count < 10){

            res = res * 3; // vozvedenie v stepen
            count++; // IZMENENIE PARAMETRA CIKLA
            System.out.println(res + " = 3 in power " + count);


        }



    }
}
