package classwork_16.car_object.model;

public class Car {
    //Car imia klassa//
    // OBSTRAGIROVANYJ PRINCEP; OPISALI POLIA
    private String brande; // BRAND NAZVANIJA POLIA
    private int year;
    private double price;
    private String color;
    private boolean isNew;
    // OBSTRAGIROVANYJ PRINCEP; OPISALI POLIA


    // CONSTRUKTOR - ETO METOD; NO ON NICEGO NE VOZVRASCIAET


    public Car(String brande, int year, double price, String color, boolean isNew) {
        this.brande = brande;  // String brand tam cveta
        this.year = year;
        this.price = price;
        this.color = color;
        this.isNew = isNew;
    }
    // vyvodim metody
    // getters and setters, pomogajut  getters polucit, i setters -  ustanovit znacenija
    // smozem meniat

    public String getBrande() {
        return brande;
    }

    public void setBrande(String brande) {
        this.brande = brande;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    public String display() {  // polucili metod , pulicnyj vozvrasciaet string
        return "Car{" +
                "brande='" + brande + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", isNew=" + isNew +
                '}';

    } // END OF MAIL

   // KOPSULIACIJA
    public void move (){
        System.out.println("Car is moving...");

    }

       public void stop(){
           System.out.println("Car stopped.");
   }
} // END OF CLASS





