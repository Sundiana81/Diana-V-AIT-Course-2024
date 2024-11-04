package homework_38_01.local_date;

import java.util.List;

public class TemperatureAnalyzer {
    public static double calculateAverageTemperature(List<DayTemperature> temperatures) {
        double sum = 0;
        for (DayTemperature temp : temperatures) {
            sum += temp.getTemperature();
        }
        //Здесь temperatures.isEmpty() сначала проверяет, пуст ли список. Если пуст, возвращается 0; если нет,
        // производится расчет средней температуры, деля сумму на размер списка.
        return temperatures.size() > 0 ? sum / temperatures.size() : 0;
    }

    public static DayTemperature findMinTemperatureDay(List<DayTemperature> temperatures) {
        DayTemperature minTempDay = temperatures.get(0);
        for (DayTemperature temp : temperatures) {
            if (temp.getTemperature() < minTempDay.getTemperature()) {
                minTempDay = temp;
            }
        }
        return minTempDay;
    }

    public static DayTemperature findMaxTemperatureDay(List<DayTemperature> temperatures) {
        DayTemperature maxTempDay = temperatures.get(0);
        for (DayTemperature temp : temperatures) {
            if (temp.getTemperature() > maxTempDay.getTemperature()) {
                maxTempDay = temp;
            }
        }
        return maxTempDay;
    }
}
