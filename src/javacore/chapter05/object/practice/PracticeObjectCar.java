package javacore.chapter05.object.practice;

public class PracticeObjectCar {

    String serialNumber;
    String brand;
    String model;
    String color;


    double price;
    double odometer;

    public PracticeObjectCar(String serialNumber, String brand, String model, String color, double price) {

        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;

        System.out.println("Created");

        this.displayInformations();

    }

    public double run (double distance) {
        System.out.println("La voiture roule pendant " + distance + "Kms.");
        odometer += distance;

        return distance;
    }

    public void displayInformations() {

        System.out.println("N° de série " + this.serialNumber + " | Marque : " + this.brand + " | Modèle : " + this.model + " | Couleur : " + this.color + " | Prix : " + this.price + " | Kilométrages : " + this.odometer);
    }
}
