package homework_17_02;

import homework_17_02.cube.model.Cube;

public class CubeApp {
    public static void main(String[] args) {

        // 3 ekzempliara kuba
        Cube cube1 = new Cube(6);
        Cube cube2 = new Cube(12);
        Cube cube3 = new Cube(7);


        // Вызов методов и вывод результатов для каждого куба
        System.out.println("Cube 1:");
        cube1.display();

        System.out.println("Cube 2:");
        cube2.display();

        System.out.println("Cube 3:");
        cube3.display();
    }
    }

