package classwork_09;
//В программе задаются часы, минуты и секунды.
// Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

public class Homeworck_09_01 {

    public static void main(String[] args) {

        // naprimer  8:20:57

        int hours = 8;
        int minutes = 20;
        int seconds = 57;
        int result = convertToSeconds(hours, minutes, seconds); // VYVOD OBSCEGO KOL, SEKUND

        System.out.println("Total numbers of sekonds:" + result); // OBSCIE KOL, SEKUND + RESULT


    } // end of main

    public static int convertToSeconds(int hours, int minutes, int seconds) {

        int totalSeconds = hours * 3600 + minutes * 60 + seconds; // PEREVOD CASOV V SEK I DOBAVLENIE MIN V SEK
        return totalSeconds;

    }
}