package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class TemperatureConverter {

    public static String celsius = "°C";
    public static String fahrenheit = "°F";

    public static double fahrenheitTemperature = 0.0;
    public static double celsiusTemperarture = 0.0;

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dans quel sens souhaitez-vous convertir ?");
        System.out.println("Choix 1 : Celsius vers Fahrenheit ?");
        System.out.println("Choix 2 : Fahrenheit vers Celsius ?");
        int choiceUser = scanner.nextInt();

        System.out.println("Quelle température souhaitez-vous convertir ?");
        double temperatureUser = scanner.nextDouble();

        switch (choiceUser) {

            case 1:
                TemperatureConverter.celsiusTemperarture = celsiusToFahrenheitConverter(temperatureUser);
                System.out.println(temperatureUser + fahrenheit + " fait " + celsiusTemperarture + celsius);
                break;

            case 2:
                TemperatureConverter.fahrenheitTemperature = fahrenheitToCelsiusConverter(temperatureUser);
                System.out.println(temperatureUser + celsius + " fait " + fahrenheitTemperature + fahrenheit);
                break;

        }

    }

    public static double celsiusToFahrenheitConverter (double celsiusTemperature) {

        return (celsiusTemperature * 1.8) + 32.0;
    }

    public static double fahrenheitToCelsiusConverter (double fahrenheitTemperature) {

        return (fahrenheitTemperature - 32.0) / 1.8;
    }
}
