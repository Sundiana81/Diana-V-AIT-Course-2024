package homework_01.model;


import homework_01.currency.Currency;

import java.util.Scanner;

public class CurrencyConverter {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // Display available currencies
        Currency.displayCurrencies();

        // Choose currency
        System.out.print("Enter the currency code you want to exchange (EUR, USD, RUB): ");
        String currencyCode = scanner.next().toUpperCase();

        // Check if currency exists
        try {
            Currency chosenCurrency = Currency.valueOf(currencyCode);

            // Enter amount to convert
            System.out.print("Enter the amount in " + currencyCode + ": ");
            double amount = scanner.nextDouble();

            // Convert to Euro
            double amountInEuro = convertToEuro(chosenCurrency, amount);
            System.out.printf("You will receive %.2f EUR for %.2f %s.%n", amountInEuro, amount, currencyCode);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid currency code. Please try again.");
        }
    }

    private double convertToEuro(Currency currency, double amount) {
        return amount * currency.getRateToEuro();
    }
}
