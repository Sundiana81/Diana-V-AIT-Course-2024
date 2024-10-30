package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {

    public static void main(String[] args) {

        // HOW MUCH TIME?  - ISO fotmat: YYYY-mm-DD
        LocalDate ld = LocalDate.now(); // class LocalDate и обьект этого класса klass ld
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("____________________________________");


        LocalDate gagarin = LocalDate.of(1961, 04, 12);
        System.out.println(gagarin);  // ISO
        // какой день недели?
        System.out.println(gagarin.getDayOfWeek());
        // Year?
        System.out.println(gagarin.getDayOfYear());
         // ...
        System.out.println("____________Is leap Year___________________");
        int year = 2024;
        System.out.println("Is year" + year + "leap:" + Year.isLeap(year));
        System.out.println("__________________________________________");
        System.out.println(gagarin.isBefore(ld)); // true
        System.out.println(gagarin.isAfter(ld)); // false
        System.out.println("_________________________________________");
        long period = ChronoUnit.YEARS.between(gagarin, ld);
        System.out.println(period);  // 63 year

        System.out.println("________DateTimeFormatter__________");
        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE; // YYYY-mm-DD
        String date = gagarin.format(df); // LocalDate to String
        System.out.println(date);

        // выбераем другой формат
        df = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(df); // переафамляем страку
        System.out.println(date);

        // задаем другой собственый формат
        System.out.println("________________________");
        df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(df);
        System.out.println(date);


// задаем другой собственый формат
        System.out.println("________________________");
        df = DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); // делаем разные форматы
        date = gagarin.format(df);
        System.out.println(date);

        // locale

        df = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        date = gagarin.format(df); //gagarin localedate
        System.out.println(date);

        // persing LocalDate from String
        System.out.println("//////////////////////////////////////");
        String stringDate = "01:12-2024";
        LocalDate result = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd:MM-yyyy][dd/MM/yyyy][dd-MM-yyyy"));
        System.out.println(result);  // ISO format  2024-10-29 в консоле


        System.out.println("-----------------------------------------");

        String diannaBirthday = "23.06.1983";
        LocalDate dianaBirt = LocalDate.parse(diannaBirthday, DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(dianaBirt);

        df = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String d = dianaBirt.format(df);
        System.out.println(d);




    }

}
