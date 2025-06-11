package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String brand;
    String model;
    String color;
    String serialNumber;

    double price;
    double odometer;

    public double run (double distance) {
        System.out.println("La voiture roule pendant " + distance + "Kms.");
        odometer += distance;

        return distance;
    }

    public void displayInformations() {

        System.out.println("N° de série " + serialNumber + " | Marque : " + brand + " | Modèle : " + model + " | Couleur : " + color + " | Prix : " + price + " | Kilométrages : " + odometer);
    }
}
