package supermarkt.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {

    private long barCode;        // Штрих-код товара
    private String name;           // Название товара
    private String category;       // Категория товара
    private double price;          // Цена товара
    private LocalDate expDate;     // Дата истечения срока годности

    public Product(long barCode, String name, String category, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.category = category;
        this.price = price;
        this.expDate = expDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return barCode == product.barCode && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name) && Objects.equals(category, product.category) && Objects.equals(expDate, product.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode, name, category, price, expDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("barCode=").append(barCode);
        sb.append(", name='").append(name).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", price=").append(price);
        sb.append(", expDate=").append(expDate);
        sb.append('}');
        return sb.toString();
    }
}
    //@Override
    // public String toString() {
    // return String.format("Product{barCode='%s', name='%s', category='%s', price=%.2f, expDate=%s}",
    //barCode, name, category, price, expDate);
    //}

// %s — это спецификатор для строк (используется для barCode, name, category, и expDate,
// так как expDate — объект типа LocalDate, который будет автоматически преобразован в строку).
// %.2f — спецификатор для чисел с плавающей запятой (используется для price), указывает,
// что число будет отображено с двумя знаками после запятой.
