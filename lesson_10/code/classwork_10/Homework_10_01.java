package classwork_10;

//Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.

public class Homework_10_01 {

    public static void main(String[] args) {

    double[] temperatura = { 23.3, 18.4, 19.4, 27.2, 30.0, 35.0, 26.0}; //TEMP NEDELI

        double sum = 0;

        for (double i = 0; i < temperatura.length ; i++) {

            sum = sum + temperatura[(int) i];

        }
        System.out.println("Tuesday:" + temperatura [1] + "°C");
        System.out.println("Thursday:" + temperatura [3]+"°C");

        double averageTemperature = sum / temperatura.length; //TEMP ZA NEDELIU
        System.out.println("Average temperature for the week:" + averageTemperature + "°C");

    }
}
