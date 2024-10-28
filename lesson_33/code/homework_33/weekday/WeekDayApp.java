package homework_33.weekday;

import static homework_33.weekday.WeekDay.FRIDAY;

public class WeekDayApp {
    public static void main(String[] args) {


            // Testing .values() method
            System.out.println("All days of the week:");
            for (WeekDay day : WeekDay.values()) {
                System.out.print(day + " ");
            }

            // Testing .toString() method
            System.out.println(".toString() for MONDAY: " + WeekDay.MONDAY);

            // Testing .ordinal() method
            System.out.println("Ordinal for WEDNESDAY: " + WeekDay.WEDNESDAY.ordinal());

            // Testing .valueOf() method
            System.out.println("Using valueOf(\"FRIDAY\"): " + WeekDay.valueOf("FRIDAY"));

            // Testing plusDays method
            WeekDay startDay = WeekDay.MONDAY;
            int daysToAdd = 10;
            WeekDay resultDay = startDay.plusDays(daysToAdd);

            System.out.println(" " + startDay + " + " + daysToAdd + " days = " + resultDay);
        }
    }

