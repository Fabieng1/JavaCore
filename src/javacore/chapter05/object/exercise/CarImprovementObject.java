package javacore.chapter05.object.exercise;


public class CarImprovementObject {

    public static void main (String[] args) {

        CarImprovemlent car1 = new CarImprovemlent("FRKV51566GGBVGMB455", "Ferrari", "F458", "Rouge", 260000);

        car1.run(2000);
        car1.displayInformations();
        car1.toGo(car1.isEngineStarted);

        CarImprovemlent car2 = new CarImprovemlent("FRKV515651515NKNK5541GMB455", "Ford", "Mustang", "Jaune", 120000);

        car2.run(4000);
        car2.displayInformations();
        car2.toGo(car2.isEngineStarted);

    }
}
