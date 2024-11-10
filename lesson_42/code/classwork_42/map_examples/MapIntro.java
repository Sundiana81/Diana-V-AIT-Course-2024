package classwork_42.map_examples;

//сформируем Map - города и их население

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapIntro {
    public static void main(String[] args) {

        Map<String, Integer> cityMap = new TreeMap<>();
        cityMap.put("Hamburg", 1_800_000);
        cityMap.put("Berlin", 3_500_000);
        cityMap.put("Munich", 1_500_000);
        cityMap.put("Cologne", 1_080_000);
        cityMap.put("Ingolstad", 140_000);
        cityMap.put("Ausburg", 350_000);
        cityMap.put("Isny", 14_835);

        System.out.println(cityMap.size());// 7
        System.out.println(cityMap.isEmpty()); // false

        System.out.println("________________________");
        Integer population = cityMap.get("Berlin");
        System.out.println(population);

    }
}
