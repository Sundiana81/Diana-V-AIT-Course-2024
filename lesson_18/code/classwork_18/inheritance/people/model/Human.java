package classwork_18.inheritance.people.model;
//boolean Gender;
//double height;
//double weight;
//String race;
//String country;
//String eyeColor;

public class Human {

    boolean gender; // default modifier - not presence
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;


    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }

}
