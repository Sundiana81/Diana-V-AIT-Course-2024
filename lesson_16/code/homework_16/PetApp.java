package homework_16.pet_objekt;

import homework_16.pet_objekt.model.Pet;

public class PetApp {
    public static void main(String[] args) {



        Pet pet1 = new Pet(1, "Pom", 5, "Mormo");
        Pet pet2 = new Pet(2, "Pom", 3, "Nora");
        Pet pet3 = new Pet(3, "Pom", 2, "Kenzo");


        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(pet3);


        System.out.println("A day in the life of the pets:");


        pet1.eat();
        pet1.walks();
        pet1.plays();
        pet1.makesAsound();
        pet1.sleep();

        System.out.println();


       pet2.eat();
       pet2.walks();
        pet2.plays();
        pet2.makesAsound();
        pet2.sleep();

        System.out.println();


        pet3.eat();
        pet3.walks();
        pet3.plays();
        pet3.makesAsound();
        pet3.sleep();


    }
}
