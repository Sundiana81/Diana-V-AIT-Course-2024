package classwork_28.car_garage.ait.cars.dao;

import classwork_28.car_garage.ait.cars.model.Car;

import java.util.Comparator;
import java.util.function.Predicate;

public class GarageImpl implements Garage{

    private Car[] cars;
    private int size;

    public GarageImpl(int capacity) {
        this.cars = new Car[capacity];
        this.size = size;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car;
        // size++;
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                Car removedCar = cars[i];
                // Shift remaining cars to the left to fill the gap
                for (int j = i; j < size - 1; j++) {
                    cars[j] = cars[j + 1];
                }
                cars[--size] = null; // Decrease size and set last element to null
                return removedCar;
            }
        }
        return null; // If the car is not found
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (int i = 0; i < size; i++) {
            if(cars[i].getRegNumber().equals(regNumber)){
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate(car -> car.getModel().equals(model));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(car -> car.getCompany().equals(company));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        // priletit v 77 strocku
        return findCarsByPredicate(car-> car.getEngine() > min && car.getEngine() < max);
    }

    @Override
    public Car[] findCarsByColor(String color) {

        return findCarsByPredicate(car -> car.getColor().equals(color));
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printCars() {
        for (int i = 0; i < size; i++) {
            System.out.println(cars[i]);
        }
    }
// zadan metod v interfeice, sdelana implementacija i sam metod sdes
    @Override
    public Car[] printAllCarsSorteByColor() {

        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getColor().compareTo(car2.getColor());
            }
        };
        // [Car]
        return null;
    }

    // в этот метод передаем логическое выражение, которое будет тестировать объекты типа Car
    private Car[] findCarsByPredicate(Predicate<Car> predicate){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(cars[i])){ // объект проходит тест // iz 74 stroki beriot
                count++;
            }
        }
        // читаем массив и перекладываем рез-ты в новый
        Car[] res = new Car[count];
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(predicate.test(cars[i])){
                res[j++] = cars[i];
            }
        }
        return res;
    }



} // end of class
