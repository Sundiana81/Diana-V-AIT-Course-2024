package classwork_34.time.utils;


//  Этот метод принимает дату рождения в виде стринга,
//    и возвращающий возраст.


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

    public class DateOperation {

        // Method to calculate age from a date string
        public static int getAge(String birthDateStr) {
            // Define date formats
            String[] dateFormats = {"dd/MM/yyyy", "yyyy-MM-dd"};
            LocalDate birthDate = null;

            // Try to parse the date with different formats
            for (String format : dateFormats) {
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                    birthDate = LocalDate.parse(birthDateStr, formatter);
                    break; // Break if parsing is successful
                } catch (Exception e) {
                    // Continue to the next format if parsing fails
                }
            }

            // If birthDate is still null, throw an exception
            if (birthDate == null) {
                throw new IllegalArgumentException("Invalid date format: " + birthDateStr);
            }

            // Calculate the age
            return LocalDate.now().getYear() - birthDate.getYear() - (LocalDate.now().isBefore(birthDate.withYear(LocalDate.now().getYear())) ? 1 : 0);
        }

        // Мы используем Arrays.sort для сортировки массива строк.
        // Для этого передаем ему компаратор, который будет определять порядок сортировки.
        public static String[] sortStringDates(String[] dates) {
            Arrays.sort(dates, new Comparator<String>() {
                @Override
                public int compare(String date1, String date2) {
                    LocalDate ld1 = parseDate(date1);
                    LocalDate ld2 = parseDate(date2);
                    return ld1.compareTo(ld2);// Сравниваем два объекта LocalDate
                }

                private LocalDate parseDate(String dateStr) {

                    String[] dateFormats = {"yyyy-MM-dd", "dd/MM/yyyy"};
                    for (String format : dateFormats) {
                        try {
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                            return LocalDate.parse(dateStr, formatter);
                        } catch (Exception e) {
                            //Блок catch (Exception e) перехватывает это исключение и позволяет циклу продолжить
                            // к следующей итерации,
                            // пытаясь применить следующий формат из dateFormats.

                        }
                    }// Если ни один формат не подошел, выбрасываем исключение
                    throw new IllegalArgumentException("Invalid date format: " + dateStr);
                }
            });
            return dates;
        }
    }

