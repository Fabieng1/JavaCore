package javacore.chapter05.object.practice;

public class PracticeObject {

    public static void main (String[] args) {

        PracticeObjectCar car1 = new PracticeObjectCar("FRKV51566GGBVGMB455", "Ferrari", "F458", "Rouge", 260000);

        car1.run(2000);
        car1.displayInformations();

        PracticeObjectCar car2 = new PracticeObjectCar("FRKV515651515NKNK5541GMB455", "Ford", "Mustang", "Jaune", 120000);

        car2.run(4000);
        car2.displayInformations();
    }
}
