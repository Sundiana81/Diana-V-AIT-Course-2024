package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class Yacht {
    private String manufacturer; // производитель
    private String countryFlag;  // страна (флаг)
    private int yearOfProduction; // год выпуска
    private double length; // длина
    private String hullMaterial; // материал корпуса
    private double cost; // стоимость

    public Yacht(String manufacturer, String countryFlag, int yearOfProduction, double length, String hullMaterial, double cost) {
        this.manufacturer = manufacturer;
        this.countryFlag = countryFlag;
        this.yearOfProduction = yearOfProduction;
        this.length = length;
        this.hullMaterial = hullMaterial;
        this.cost = cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getLength() {
        return length;
    }

    public String getHullMaterial() {
        return hullMaterial;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Yacht{");
        sb.append("manufacturer='").append(manufacturer).append('\'');
        sb.append(", countryFlag='").append(countryFlag).append('\'');
        sb.append(", yearOfProduction=").append(yearOfProduction);
        sb.append(", length=").append(length);
        sb.append(", hullMaterial='").append(hullMaterial).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }

    // displayAllYachts: отображает все яхты.
    public static void displayAllYachts(List<Yacht> yachts) {
        yachts.forEach(yacht -> System.out.println(yacht));
    }

    // displayYachtsByHullMaterial: фильтрует яхты по материалу корпуса.
    public static void displayYachtsByHullMaterial(List<Yacht> yachts, String material) {
        yachts.stream()
                .filter(yacht -> yacht.getHullMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);
    }
    // displayYachtsCostGreaterThan: фильтрует яхты по цене.
    public static void displayYachtsCostGreaterThan(List<Yacht> yachts, double price) {
        yachts.stream()
                .filter(yacht -> yacht.getCost() > price)
                .forEach(System.out::println);
    }

    //displayYachtsByYearRange: фильтрует яхты по диапазону годов выпуска.
    public static void displayYachtsByYearRange(List<Yacht> yachts, int startYear, int endYear) {
        yachts.stream()
                .filter(yacht -> yacht.getYearOfProduction() >= startYear && yacht.getYearOfProduction() <= endYear)
                .forEach(System.out::println);
    }


    public static void sortYachtsByPrice(List<Yacht> yachts) {
        yachts.stream()
                .sorted((y1, y2) -> Double.compare(y2.getCost(), y1.getCost()))
                .forEach(System.out::println);
    }

    // averageCost: вычисляет среднюю стоимость всех яхт.
    public static double averageCost(List<Yacht> yachts) {
        return yachts.stream()
                .mapToDouble(Yacht::getCost)
                .average()
                .orElse(0.0);
    }

    // countYachtsByFlag: группирует яхты по флагам и отображает их количество.
    public static void countYachtsByFlag(List<Yacht> yachts) {
        yachts.stream()
                .collect(Collectors.groupingBy(Yacht::getCountryFlag))
                .forEach((flag, yachtsList) -> {
                    System.out.println("Flag: " + flag + ", Number of yachts: " + yachtsList.size());
                    yachtsList.forEach(System.out::println);
                });
    }

}
