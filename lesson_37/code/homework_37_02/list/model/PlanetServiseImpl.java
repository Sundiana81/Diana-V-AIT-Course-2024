package homework_37_02.list.model;


    import homework_37_02.list.dao.PlanetService;

    import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

    public class PlanetServiseImpl implements PlanetService {
        private List<Planet> planets = new ArrayList<>();

        @Override
        public void addPlanet(Planet planet) {
            planets.add(planet);
        }

        @Override
        public void sortByOrder() {
            // Порядок расположения планет в солнечной системе (от Солнца)
            planets.sort(Comparator.comparingDouble(Planet::getDistanceFromSun));
        }

        @Override
        public void sortByAlphabet() {
            // Сортировка по алфавиту
            planets.sort(Comparator.comparing(Planet::getName));
        }

        @Override
        public void sortByMass() {
            // Сортировка по массе
            planets.sort(Comparator.comparingDouble(Planet::getMass));
        }

        @Override
        public void sortByNumberOfMoons() {
            // Сортировка по количеству спутников
            planets.sort(Comparator.comparingInt(Planet::getNumberOfMoons));
        }

        @Override
        public List<Planet> getPlanets() {
            return planets;
        }
    }


