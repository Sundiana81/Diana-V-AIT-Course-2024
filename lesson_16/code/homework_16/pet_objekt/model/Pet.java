package homework_16.pet_objekt.model;

    //Создать класс Pet (Домашнее животное) с приватными полями:
//
//    id
//    вид
//    возраст
//    кличка
//
//Стандартные методы:
//
//    конструктор на все поля;
//    геттеры и сеттеры на все поля;
//    метод toString.
//
//Дополнительные методы:
//
//    спать
//    есть
//    делать звук
//    играть
//    гулять
//
//В классе PetAppl создать несколько экземпляров домашних животных. Отобразить прожитый день.
    public class Pet {

        private String pet1;
        private String pet2;
        private String pet3;

        public Pet(String pet1, String pet2, String pet3) {
            this.pet1 = pet1;
            this.pet2 = pet2;
            this.pet3 = pet3;
        }

        private int id;
        private String rasse;
        private int year;
        private String name;

        public Pet(int id, String rassa, int year, String name) {
            this.id = id;
            this.rasse = rasse;
            this.year = year;
            this.name = name;
        }

        public void setName(String name) {

        }

        public int getId() {
            return id;
        }

        public int getYear() {
            return year;
        }

        public String getRassa() {
            return rasse;
        }


        public String display() {
            return "Pet{" +
                    "id=" + id +
                    ", rassa='" + rasse + '\'' +
                    ", year=" + year +
                    ", name='" + name + '\'' +
                    '}';
        }


        public void sleep() {
            System.out.println("Pet sleeping");

        }
        public void eat(){
            System.out.println("Pet eats");
        }
        public void makesAsound() {
            System.out.println("Pet makes a sound");
        }
        public void plays (){
            System.out.println("Pet plays");
        }
        public void walks (){

        }
    }




