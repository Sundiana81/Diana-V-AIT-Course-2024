package homework_37_02.list.model;
 //Занести планеты солнечной системы в список, содержащий:
//    наименование;
//    расстояние до Солнца;
//    массу;
//    количество спутников.
//Вывести список планет отсортированный по:
//    порядку расположения в солнечной системе;
//    алфавиту;
//    массе;
//    количеству спутников.

public class Planet {
    private String name;               // Наименование планеты
    private double distanceFromSun;    // Расстояние до Солнца (в миллионах км)
    private double mass;               // Масса планеты (в килограммах)
    private int numberOfMoons;         // Количество спутников

    public Planet(String name, double distanceFromSun, double mass, int numberOfMoons) {
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.mass = mass;
        this.numberOfMoons = numberOfMoons;
    }

    public String getName() { return name; }
    public double getDistanceFromSun() { return distanceFromSun; }
    public double getMass() { return mass; }
    public int getNumberOfMoons() { return numberOfMoons; }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distanceFromSun=" + distanceFromSun +
                " million km, mass=" + mass +
                " kg, numberOfMoons=" + numberOfMoons +
                '}';
    }
}

