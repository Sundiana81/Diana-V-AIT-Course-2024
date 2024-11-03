package homework_37_02.list.dao;

import homework_37_02.list.model.Planet;

import java.util.List;

public interface PlanetService {
        void addPlanet(Planet planet);
        void sortByOrder();
        void sortByAlphabet();
        void sortByMass();
        void sortByNumberOfMoons();
        List<Planet> getPlanets();
    }

