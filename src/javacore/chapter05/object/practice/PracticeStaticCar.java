package javacore.chapter05.object.practice;

public class PracticeStaticCar {

    String brand;
    String model;

    int price;
    static int carCounter = 0;

    public PracticeStaticCar (String brand, String model, int price) {

        this.brand = brand;
        this.model = model;

        this.price = price;

        PracticeStaticCar.carCounter++;
    }
}
