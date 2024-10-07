package homework_18.pet_object2;

import homework_18.pet_object2.model.Cat;
import homework_18.pet_object2.model.Dog;

public class HouseAppl {
    public static void main(String[] args) {

        Dog dog1 = new Dog(56, 2, "Mormo", "Pom", 14, 2);
        Dog dog2 = new Dog(34, 6, "Nora", "Pom", 20, 4);


        Cat cat1 = new Cat(6, 2, "Lola", "CAT", 12, 2);
        Cat cat2 = new Cat(9, 4, "Simba", "CAT", 37, 7);
        Cat cat3 = new Cat(12, 1, "Vanesa", "CAT", 24, 5);


        System.out.println("A new day begins in my house :-) ");


        dog1.voice();
        dog2.voice();


        cat1.voice();
        cat2.voice();
        cat3.voice();


    }
}

