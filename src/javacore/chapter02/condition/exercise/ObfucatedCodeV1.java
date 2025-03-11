package javacore.chapter02.condition.exercise;

public class ObfucatedCodeV1 {


    public static void main(String[] args) {

        // Variable primaire de type int, nom "b" initialisé à "1"
        int b = 1; // Type de véhicule (1 = XXX, 2 = YYY, 3 = ZZZ)

        // Variable primaire de type int, nom "a" initialisé à "100"
        double a = 100;

        // Variable primaire de type boolean, nom "e" initialisé à "true"
        boolean e = true;

        // Variable primaire de type double, nom "d" initialisé à "0.03"
        double d = 0.03;

        // Variable primaire de type double, nom "c" initialisé à "0"
        double c = 0;

        // Si b est égale à 1
        if (b == 1) {
            // Alors le résulat de a * 0.10 est affecter à la variable C
            c = a * 0.10;
        }
        // Si b est égale à 2
        if (b == 2) {
            // Alors le résulat de a * 0.20 est affecter à la variable C
            c = a * 0.20;
        }
        // Si b est égale à 3
        if (b == 3) {
            // Alors le résulatat de a * 0.35 est affecté à la variable c
            c = a * 0.35;
        }
        // Si e est vrai, alors le résultat de c - (a * d) est affecté à la varible c
        if (e) {
            c = c - (a * d);
        }

        // Affiche la variable c avec 2 chaînes de caractères avant et après
        System.out.println("___________ : " + c + "€");

    }
}
