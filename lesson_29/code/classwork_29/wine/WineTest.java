package classwork_29.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {

    Wine[]  wines;   // wines indifikator

    @BeforeEach
    void setUp() {

        wines = new Wine[5];
        wines[0] = new Wine("type1", "AAA", 2021, 6);
        wines[1] = new Wine("type2", "CCC", 2024, 3);
        wines[2] = new Wine("type3", "XXX", 2022, 5);
        wines[3] = new Wine("type3", "OOO", 2015, 7);
        wines[4] = new Wine("type4", "SSS", 2000, 20);



    }

    @Test
    void sortWineByAgeTest(){
        System.out.println("..........List wine as is...........");
        printWine(); // print as is

        Arrays.sort(wines);  // masiv wines, sorting

        System.out.println("..........List wines sort by age...........");
        printWine(); // print

    }

    @Test
    void sortCarByPriceTest(){
        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return Double.compare(w1.getPrice(), w2.getPrice()); // na metod sort
            }
        } ;   // nezabyt ;


        System.out.println("..........List car as is...........");
        printWine(); // print as is

        Arrays.sort(wines, comparatorByPrice);  // masiv wines, sorting

        System.out.println("..........List wines sort by price...........");
        printWine(); // print


    }

    @Test
    void sortWineByTitleTest (){

        Comparator<Wine> comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitle().compareTo(w2.getTitle());
            }
        };


        System.out.println("..........List wine as is...........");
        printWine(); // print as is

        Arrays.sort(wines, comparatorByTitle);  // masiv wines, sorting

        System.out.println("..........List wines sort by title...........");
        printWine(); // print
    }



    @Test
    void printWine(){
        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }


} // end of main