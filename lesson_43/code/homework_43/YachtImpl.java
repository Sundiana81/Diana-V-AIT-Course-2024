package homework_43;

import java.util.ArrayList;
import java.util.List;

import static homework_43.Yacht.*;

public class YachtImpl {
    public static void main(String[] args) {
        // Create a list of yachts
        List<Yacht> yachts = new ArrayList<>();
        yachts.add(new Yacht("Shipyard 1", "Russia", 2015, 15.5, "wood", 200000));
        yachts.add(new Yacht("Shipyard 2", "USA", 2020, 18.0, "plastic", 300000));
        yachts.add(new Yacht("Shipyard 3", "Germany", 2018, 20.0, "metal", 350000));
        yachts.add(new Yacht("Shipyard 4", "Russia", 2010, 12.0, "wood", 150000));


        System.out.println("All yachts:");
        displayAllYachts(yachts);

        System.out.println("Yachts made of metal:");
        displayYachtsByHullMaterial(yachts, "metal");

        System.out.println("Yachts that cost more than 250000:");
        displayYachtsCostGreaterThan(yachts, 250000);

        System.out.println("Yachts produced between 2015 and 2020:");
        displayYachtsByYearRange(yachts, 2015, 2020);

        System.out.println("Yachts sorted by cost in descending order:");
        sortYachtsByPrice(yachts);

        System.out.println("Average cost of yachts: " + averageCost(yachts));

        System.out.println("Yachts by flag:");
        countYachtsByFlag(yachts);
    }
}

