package homework_37_01.list.model;
// На основе класса Computer:
//    создать собственный ArrayList;
//    добавить в него не менее 6 элементов;
//    отсортировать список по бренду;
//    отсортировать список по размеру RAM, затем размеру SSD при равенстве RAM;
//    подсчитать общий суммарный объем и среднее значение SSD.

public class Computer {
    private String brand;
    private int ram; // Размер оперативной памяти в ГБ
    private int ssd; // Размер SSD в ГБ

    public Computer(String brand, int ram, int ssd) {
        this.brand = brand;
        this.ram = ram;
        this.ssd = ssd;
    }

    public String getBrand() { return brand; }
    public int getRam() { return ram; }
    public int getSsd() { return ssd; }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", ssd=" + ssd +
                '}';
    }
}

