package javacore.chapter05.object.exercise;

import java.util.Scanner;

public class TemperatureConverter {

    public static String celsius = "°C";
    public static String fahrenheit = "°F";
    public static String kelvin = "°K";

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dans quel sens souhaitez-vous convertir ?");
        System.out.println("Choix 1 : Celsius vers Fahrenheit ?");
        System.out.println("Choix 2 : Fahrenheit vers Celsius ?");
        System.out.println("Choix 3 : Celsius vers Kelvin ?");
        System.out.println("Choix 4 : Kelvin vers Celsius ?");
        System.out.println("Choix 5 : Fahrenheir vers Kelvin ?");
        System.out.println("Choix 6 : Kelvin vers Fahrenheit ?");
        int choiceUser = scanner.nextInt();

        System.out.println("Quelle température souhaitez-vous convertir ?");
        double temperatureUser = scanner.nextDouble();

        double convertedTemperature = 0.0;

        switch (choiceUser) {

            case 1:
                convertedTemperature = TemperatureConverter.celsiusToFahrenheitConverter(temperatureUser);
                System.out.println(temperatureUser + celsius + " fait " + convertedTemperature + fahrenheit);
                break;

            case 2:
                convertedTemperature = TemperatureConverter.fahrenheitToCelsiusConverter(temperatureUser);
                System.out.println(temperatureUser + fahrenheit + " fait " + convertedTemperature + celsius);
                break;

            case 3:
                convertedTemperature = TemperatureConverter.celsiusToKelvin(temperatureUser);
                System.out.println(temperatureUser + celsius + " fait " +  convertedTemperature + kelvin);
                break;

            case 4:
                convertedTemperature = TemperatureConverter.kelvinToCelsius(temperatureUser);
                System.out.println(temperatureUser + kelvin + " fait " + convertedTemperature + celsius);
                break;

            case 5:
                convertedTemperature = TemperatureConverter.fahrenheitToKelvin(temperatureUser);
                System.out.println(temperatureUser + fahrenheit + " fait " + convertedTemperature + kelvin);
                break;

            case 6:
                convertedTemperature = TemperatureConverter.kelvinToFahrenheit(temperatureUser);
                System.out.println(temperatureUser + kelvin + " fait " + convertedTemperature + fahrenheit);
                break;
        }

    }

    public static double celsiusToFahrenheitConverter (double celsiusTemperature) {

        return (celsiusTemperature * 1.8) + 32.0;
    }

    public static double fahrenheitToCelsiusConverter (double fahrenheitTemperature) {

        return (fahrenheitTemperature - 32.0) / 1.8;
    }

    public static double kelvinToCelsius (double kelvinTemperature) {

        return kelvinTemperature - 273.15;
    }

    public static double celsiusToKelvin (double celsiusTemperarture) {

        return celsiusTemperarture + 273.15;
    }

    public static double kelvinToFahrenheit (double kelvinTemperature) {

        return (kelvinTemperature - 273.15) * 9/5 + 32;
    }

    public static double fahrenheitToKelvin (double fahrenheitTemperature) {

        return (fahrenheitTemperature - 32) * 5/9 + 273.15;
    }
}