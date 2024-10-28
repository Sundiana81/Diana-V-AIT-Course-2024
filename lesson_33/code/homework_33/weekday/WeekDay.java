package homework_33.weekday;

//Задать ENUM weekDay - дни недели.
//Опробовать на нем методы: .values() .toString .ordinal() .valueOf()
//Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.
// Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг)
// Проверьте работу метода с помощью теста.

public enum WeekDay {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Метод для прибавления дней
    public WeekDay plusDays(int daysToAdd) {
        int currentIndex = this.ordinal();
        int newIndex = (currentIndex + daysToAdd) % WeekDay.values().length;
        return WeekDay.values()[newIndex];
    }


}



