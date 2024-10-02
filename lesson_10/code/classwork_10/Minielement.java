package classwork_10;

//**Задача 4.**
//Создайте массив, который содержит возраст студентов группы.
//- какой возраст максимальный?
//- какой возраст минимальный?

public class Minielement {

    public static void main(String[] args) {

     int[] ages = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18,38, 35, 41, 18, 43};

     int min = ages[0];
        for (int i = 0; i < ages.length; i++) {
          if(ages[i] < min) { //ESLI MENSE MIN TO MIN MY EGO I DELAEM
              min = ages[i];

          }
        }
        System.out.println("Min age = " + min);

    }

}
