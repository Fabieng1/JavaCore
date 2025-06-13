package javacore.chapter05.object.exercise;


public class CarImprovement {

    public static void main (String[] args) {

        CarImprovementObject car1 = new CarImprovementObject("FRKV51566GGBVGMB455", "Ferrari", "F458", "Rouge", 260000);

        car1.run(2000);
        car1.displayInformations();
        car1.isEngineStarted(car1.isEngineStarted);

        CarImprovementObject car2 = new CarImprovementObject("FRKV515651515NKNK5541GMB455", "Ford", "Mustang", "Jaune", 120000);

        car2.run(4000);
        car2.displayInformations();
        car2.isEngineStarted(car2.isEngineStarted);

    }
}
