package homework_27.produkte.model;

import java.util.Objects;

public class Food extends Product {

    //private String expDate;
    private String expirationDate; // Поле для хранения срока годности


    // delaem construktor


    public Food(double price, String name, long barCode, String expirationDate) {
        super(price, name, barCode);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expirationDate, food.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expirationDate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Food{");
        sb.append("expirationDate='").append(expirationDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}