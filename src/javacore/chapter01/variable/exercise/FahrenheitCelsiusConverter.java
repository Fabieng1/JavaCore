package javacore.chapter01.variable.exercise;

public class FahrenheitCelsiusConverter {

    public static void main (String[] args) {

        float fahrenheit = 40.0f;
        float celsius = (fahrenheit - 32.0f) / 1.8f;

        System.out.println(fahrenheit + "°F concertis en celsius fait : " + celsius + "°C");

    }

}
