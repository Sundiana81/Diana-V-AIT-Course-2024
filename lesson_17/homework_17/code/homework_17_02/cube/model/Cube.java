package homework_17_02.cube.model;
//Создать класс Cube, описывающий куб cо стороной a.
// Реализовать в нем методы определения периметра p (сумма длин всех ребер), площади s (сумма площадей всех граней) и объема v.
// Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube.
// Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {

    private double a;

    public Cube(double a) {
        this.a = a;
    }
    public double getPerimeter(){
        return 12 * a;

    }

    public double getSurfaceArea() {
        return 6 * a * a;
    }

    public double getVolume() {
        return a * a * a;
    }

    // METOD

     public void display (){
         System.out.println("Cube with side length: " + a);
         System.out.println("Perimeter: " + getPerimeter());
         System.out.println("Surface Area: " + getSurfaceArea());
         System.out.println("Volume: " + getVolume());
     }
}




