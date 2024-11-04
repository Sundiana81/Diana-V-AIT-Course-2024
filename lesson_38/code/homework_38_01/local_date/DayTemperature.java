package homework_38_01.local_date;

import java.time.LocalDate;

public class DayTemperature {
    private LocalDate date;
    private double temperature;

    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Temperature: " + temperature;
    }
}
