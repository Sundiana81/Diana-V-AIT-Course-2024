//Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

package Classwork;

public class Homework_01 {
    public static void main(String[] args) {

     int a = 47;
     int b = 47;
     int c = 35;


     if(a + b > c & a + c > b & b + c > a ){

         System.out.println("a + b больше c");
         System.out.println("a + c больше b");
         System.out.println("b + c больше a");
         System.out.println("треугольник заданными сторонами существует");

     }


    }



}
