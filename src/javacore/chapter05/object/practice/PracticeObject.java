package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main (String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar();
        car1.brand = "Ferrari";
        car1.model = "F458";
        car1.color = "Rouge";
        car1.odometer = 0;
        car1.price = 26000;
        car1.serialNumber = "FRKV51566GGBVGMB455";

        car1.run(2000);
        car1.displayInformations();

        PracticeObjectCar car2 = new PracticeObjectCar();
        car2.brand = "Ford";
        car2.model = "Mustang";
        car2.color = "Jaune";
        car2.odometer = 0;
        car2.price = 120000;
        car2.serialNumber = "FRKV515651515NKNK5541GMB455";

        car2.run(4000);
        car2.displayInformations();
    }
}
