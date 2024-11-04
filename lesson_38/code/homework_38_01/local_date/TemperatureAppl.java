package homework_38_01.local_date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TemperatureAppl {
    public static void main(String[] args) {
        List<DayTemperature> lastWeekOctober = new ArrayList<>();
        List<DayTemperature> firstWeekNovember = new ArrayList<>();


        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 25), 17.3));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 26), 19.1));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 27), 12.7));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 28), 18.5));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 29), 18.0));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 30), 13.4));
        lastWeekOctober.add(new DayTemperature(LocalDate.of(2024, 10, 31), 19.0));


        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 1), 16.3));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 2), 17.6));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 3), 13.0));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 4), 18.5));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 5), 15.5));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 6), 19.9));
        firstWeekNovember.add(new DayTemperature(LocalDate.of(2024, 11, 7), 16.3));


        List<DayTemperature> twoWeeksData = new ArrayList<>();
        twoWeeksData.addAll(lastWeekOctober);
        twoWeeksData.addAll(firstWeekNovember);


        double averageTemperature = TemperatureAnalyzer.calculateAverageTemperature(twoWeeksData);
        System.out.println("Average temperature over the two weeks: " + averageTemperature);


        DayTemperature minTempDay = TemperatureAnalyzer.findMinTemperatureDay(twoWeeksData);
        System.out.println("Day with minimum temperature: " + minTempDay);


        DayTemperature maxTempDay = TemperatureAnalyzer.findMaxTemperatureDay(twoWeeksData);
        System.out.println("Day with maximum temperature: " + maxTempDay);
    }
}
