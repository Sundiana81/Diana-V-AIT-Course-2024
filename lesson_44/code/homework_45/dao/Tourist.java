package homework_45.dao;

class Tourist {
    private final String name;
    private final String[] visitedCountries;

    public Tourist(String name, String... visitedCountries) {
        this.name = name;
        this.visitedCountries = visitedCountries;
    }

    public String getName() {
        return name;
    }

    public String[] getVisitedCountries() {
        return visitedCountries;
    }
}