package classwork_07;
//Задача 2.
//Запустить обратный отсчет старта ракеты от 10 до 0.
//Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        // start uslovija
        int countDown = 10;
        System.out.println("We have " + countDown + " sec befor");
        while (countDown > 0) {
            countDown--;
            System.out.println("We have" + countDown + " till start.");
        }
        System.out.println("Here we go!...");
    }

}
