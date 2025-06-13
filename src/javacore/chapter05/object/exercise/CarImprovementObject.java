package javacore.chapter05.object.exercise;

public class CarImprovementObject {
    String serialNumber;
    String brand;
    String model;
    String color;

    double price;
    double odometer;

    boolean isEngineStarted;

    public CarImprovementObject(String serialNumber, String brand, String model, String color, double price) {

        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.odometer = 0;
        this.isEngineStarted = false;

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

        isEngineStarted(isEngineStarted);
        System.out.println("La voiture avance-t-elle ? " + isEngineStarted);
    }

    public boolean isEngineStarted(boolean isEngineStarted) {

        if (this.isEngineStarted) {
            this.isEngineStarted = true;
        }
        else {
            this.isEngineStarted = false;
        }
        return isEngineStarted;
    }
}