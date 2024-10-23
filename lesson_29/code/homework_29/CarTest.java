package homework_29;

import classwork_29.wine.Wine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car[] cars;

    @BeforeEach
    void setUp() {

        cars = new Car[4];

        cars[0] = new Car("BMW X7", "red", 120000, 2024);
        cars[1] = new Car("AUDI R8", "black", 160000, 2022);
        cars[2] = new Car("Rolls-Royce", "gold", 503000, 2025);
        cars[3] = new Car("Mercedes Benz G 400", "white", 250000, 2023);



    }
    @Test
    void sortCarByYearTest(){

        Comparator<Car> comparatorByYear = new Comparator<Car>() {
            @Override
            public int compare(Car w1, Car w2) {
                return Integer.compare(w1.getYearOfRelease(), w2.getYearOfRelease());
            }
        } ;   //


        System.out.println("..........List car as is...........");
        printCar(); // print as is

        Arrays.sort(cars, comparatorByYear);  // masiv cars, sorting

        System.out.println("..........List car sort by Year...........");
        printCar(); // print

    }

      @Test
      void sortCarByCostTest(){

          Comparator<Car> comparatorByCost = new Comparator<Car>() {
              @Override
              public int compare(Car w1, Car w2) {
                  return Double.compare(w1.getCost(), w2.getCost());
              }
          } ;

          System.out.println("..........List car as is...........");
          printCar(); // print as is

          Arrays.sort(cars, comparatorByCost);  // masiv cars, sorting

          System.out.println("..........List car sort by Cost...........");
          printCar(); // print


      }




    @Test
    void printCar(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    @Test
    void sortCarByModelTest(){

        Comparator<Car> comparatorByModel = new Comparator<Car>() {
            @Override
            public int compare(Car w1, Car w2) {
                return w1.getModel().compareTo(w2.getModel());
            }
        } ;//return Double.compare(w1.getCost(), w2.getCost());

        System.out.println("..........List car by Model...........");
        printCar(); // print as is

        Arrays.sort(cars, comparatorByModel);  // masiv cars, sorting

        System.out.println("..........List car sort by Model...........");
        printCar(); // print


    }


    } // end of main


