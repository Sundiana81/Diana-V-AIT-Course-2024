package homework_18.pet_object2.model;

import homework_18.pet_object2.model.Pet;


public class Cat extends Pet {
    private String breed;
    private int height;
    private int weight;

    public Cat(int id, int age, String name, String breed, int height, int weight) {
        super(id, "Cat", age, name);
        this.breed = breed;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " say: Meow!");
    }
}
