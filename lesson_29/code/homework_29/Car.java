package homework_29;

import classwork_29.wine.Wine;

import java.util.Objects;

public class Car implements Comparable <Car> {

    private String model;
    private String color;
    private double cost;
    private int yearOfRelease;


    @Override
    public int compareTo(Car car) {
        return this.getYearOfRelease() - car.getYearOfRelease();
    }

    public Car(String model, String color, double cost, int yearOfRelease) {
        this.model = model;
        this.color = color;
        this.cost = cost;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(cost, car.cost) == 0 && yearOfRelease == car.yearOfRelease && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, cost, yearOfRelease);
    }

    @Override
    public String toString() {
        String sb = "Car{" + "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", yearOfRelease=" + yearOfRelease +
                '}';
        return sb;
    }

}
