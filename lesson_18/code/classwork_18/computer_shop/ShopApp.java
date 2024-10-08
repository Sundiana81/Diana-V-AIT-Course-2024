package classwork_18.computer_shop;

//Создать несколько экземпляров каждого класса.
//Какой общий объем памяти у всех устройств на складе?
//Какова общая стоимость всех устройств на складе?

import classwork_18.computer_shop.model.Computer;
import classwork_18.computer_shop.model.Laptop;
import classwork_18.computer_shop.model.SmartPhone;

public class ShopApp {
    public static void main(String[] args) {

        // IMPORT KLASSOV = IMPORT TOPOV

        Computer computer = new Computer("i7", 8, 256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2", 8, 256, "Apple AirBook", 2200, 14, 1.5, 10, "lueb");
        System.out.println(laptop);


        Computer[] computers = new Computer[6];  // tip- Computer ( roditelskij klass

        computers[0] = new Computer("i7", 8, 256, "Acer", 1200);
        computers[1] = new Computer("i5", 16, 256, "HP", 1200);
        computers[2] = new Computer("AMD", 8, 256, "NoName", 1200);
        computers[3] = new Laptop("Apple", 8, 256, "MacBook", 2800, 14, 1.5, 10, "rose");
        computers[4] = new Laptop("Apple", 8, 512, "MacBook Air", 2500, 14, 1.5, 12, "blue");
        computers[5] = new SmartPhone("A1", 128, 256, "Samsung", 1300, 9, 0.45, 12, "pink", 176L);

        double totalWeight = 0;

        for (int i = 0; i < computers.length; i++) {
            if (computers[i] instanceof Laptop) {
                Laptop myLaptop = (Laptop) computers[i]; // upper casting
                totalWeight += myLaptop.getWeight();
            }
        }

        System.out.println("Total weight = " + totalWeight);

        System.out.println("=================================");

            int totalSsd = 0;
            for (int i = 0; i < computers.length; i++) {
                totalSsd += computers[i].getSsd();  // tekuscij ojekt [i] zadali tockoi to cto nado poscitat


            }
            System.out.println("Total ssd:" + totalSsd);

            double totalPrice = 0;
            for (int i = 0; i < computers.length; i++) {
                totalPrice += computers[i].getPrice();

            }
            System.out.println("Total price:" + totalPrice);

            System.out.println("-----------------------------------");
            for (int i = 0; i < computers.length; i++) {
                System.out.println(computers[i]);


            }
        }
    }

