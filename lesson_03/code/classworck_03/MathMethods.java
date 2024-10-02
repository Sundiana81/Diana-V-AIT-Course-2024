package classworck_03;

public class MathMethods {

    public static void main(String[] args) {

//  площадь круга
        double radius = 100; // создаем, задаем переменную и ее значение
        double area1 = areaOfCircle(radius); // вызываем метод с аргументом 100
        System.out.println("Area of circle with radius " + radius + " = " + area1); // печатаем результат

//  площадь квадрата
        double a = 100;
        double area2 = areaOfSquare(a);
        System.out.println("Area of square with side " + a + " = " + area2);

//  периметр прямоугольника
        double side1 = 100;
        double side2 = 400;
        double perimeter = perimeterOfRectangle(side1, side2);
        System.out.println("Perimeter of rectangle with side " + a + ", and other side " + side2 + " = " + perimeter);


    } // end of main

    private static double areaOfCircle(double radius) {
        double pi = 3.14159;
        return pi * radius * radius;
    }

    private static double perimeterOfRectangle(double side1, double side2) {
        double per = 2 * (side1 + side2);
        return per;
    }

    private static double areaOfSquare(double a) {
        return a * a;
    }

} // end of class
