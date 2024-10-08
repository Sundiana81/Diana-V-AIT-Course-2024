package classwork_18.computer_shop.model;

public class SmartPhone extends Laptop {

    private long imea;

    public SmartPhone(String cpu, int ram, int ssd, String brand, double price, double displaySize, double weight, int batteryLife, String color, long imea) {
        super(cpu, ram, ssd, brand, price, displaySize, weight, batteryLife, color);
        this.imea = imea;
    }
}

