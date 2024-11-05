package homework_01.currency;
//Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь,
// что в списке нет дублирующихся кодов валют. Выведите список валют и их курсов на экран.
// Реализуйте возможность для пользователя выбрать желаемую валюту,
// ввести ее количество и узнать, сколько он получит при обмене на евро.

public enum Currency {
    EUR(1.0),
    USD(0.85),
    RUB(0.012);

    private final double rateToEuro;

    Currency(double rateToEuro) {
        this.rateToEuro = rateToEuro;
    }

    public double getRateToEuro() {
        return rateToEuro;
    }

    public static void displayCurrencies() {
        System.out.println("Available currencies and their exchange rates to Euro:");
        for (Currency currency : Currency.values()) {
            //%s: Заполнитель для строки. В данном случае это будет имя валюты.
            //%.4f: Заполнитель для числа с плавающей точкой. Это значение будет заменено на курс валюты к евро, отформатированный до четырех знаков после запятой.
            //%n: Портативный символ новой строки, который обеспечивает переход на следующую строку после вывода.
            System.out.printf("%s: %.4f%n", currency.name(), currency.getRateToEuro());
        }
    }
}


