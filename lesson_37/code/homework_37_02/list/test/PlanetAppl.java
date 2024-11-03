package homework_37_02.list.test;

import homework_37_02.list.dao.PlanetService;
import homework_37_02.list.model.Planet;
import homework_37_02.list.model.PlanetServiseImpl;

public class PlanetAppl {

        public static void main(String[] args) {
            PlanetService planetService = new PlanetServiseImpl();

            // Добавляем планеты в список
            planetService.addPlanet(new Planet("Mercury", 57.91, 3.30e23, 0));
            planetService.addPlanet(new Planet("Venus", 108.21, 4.87e24, 0));
            planetService.addPlanet(new Planet("Earth", 149.60, 5.97e24, 1));
            planetService.addPlanet(new Planet("Mars", 227.92, 6.42e23, 2));
            planetService.addPlanet(new Planet("Jupiter", 778.57, 1.90e27, 79));
            planetService.addPlanet(new Planet("Saturn", 1433.53, 5.68e26, 83));
            planetService.addPlanet(new Planet("Uranus", 2872.46, 8.68e25, 27));
            planetService.addPlanet(new Planet("Neptune", 4497.07, 1.02e26, 14));

            // Сортировка по порядку расположения
            System.out.println("Сортировка по порядку расположения в солнечной системе:");
            planetService.sortByOrder();
            planetService.getPlanets().forEach(System.out::println);

            // Сортировка по алфавиту
            System.out.println("Сортировка по алфавиту:");
            planetService.sortByAlphabet();
            planetService.getPlanets().forEach(System.out::println);

            // Сортировка по массе
            System.out.println("Сортировка по массе:");
            planetService.sortByMass();
            planetService.getPlanets().forEach(System.out::println);

            // Сортировка по количеству спутников
            System.out.println("Сортировка по количеству спутников:");
            planetService.sortByNumberOfMoons();
            planetService.getPlanets().forEach(System.out::println);
        }
    }


