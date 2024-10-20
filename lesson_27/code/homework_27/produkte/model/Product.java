package homework_27.produkte.model;

//Создать класс Product, с полями:
//
//    private double price
//    private String name
//    private long barCode;
//    Создать класс Food расширяющий класс Product с полем private String expDate, которое хранит дату истечения срока годности.
//    Создать класс MeatFood расширяющий класс Food с полем private String meatType, которое хранит тип мяса, из которого изготовлен продукт.
//    Создать класс MilkFood расширяющий класс Food с полями private String milkType, private double fat, которые хранят тип молока и жирность продукта соответственно.
//    Во всех классах переопределить метод toString.
//    Создать класс MarketAppl и в нем метод main.
//    В методе main создать массив в котором хранятся по одному объекту для каждого продукта. Реализовать методы:
//    печатающий все продукты из массива, и
//    метод возвращающий сумму цен всех продуктов.

import java.util.Objects;

public class Product {

    private double price;
    private String name;
    private long barCode;

    public Product(double price, String name, long barCode) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", barCode=" + barCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode);
    }


}
