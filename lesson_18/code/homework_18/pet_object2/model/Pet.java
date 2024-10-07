package homework_18.pet_object2.model;
//В классе Pet имеются поля:
//
//    id
//    вид
//    возраст
//    кличка
//
//Создайте дочерние от класса Pet классы Cat и Dog c дополнительными полями:
//
//    порода
//    рост
//    вес
//
//Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog. Создайте HouseAppl, в котором есть метод main.
// Поселите в доме 2 собаки и 3 кошки. Смоделируйте жизнь в этом доме в течение дня.

public class Pet {
    private int id;
    private String species;
    private int age;
    private String name;

    public Pet(int id, String species, int age, String name) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice() {
        System.out.println(name + " makes a sound.");
    }
}
