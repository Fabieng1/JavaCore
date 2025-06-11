package javacore.chapter05.object.exercises;

public class Pen {



    public static void main(String[] args) {

        String name = "Stylo";
        String color = "Bleu";
        String manufacturing = "Bic";
        String weight = "15g";

        float price = 2.50f;
        int quantity = 10;

        System.out.println("Nom : " + name + " | Couleur : " + color + " | Prix : " + price + " | Quantité : " + quantity + " | Fabricant : " + manufacturing + " | Poids : " + weight);

        ExerciceObjectPen pen1 = new ExerciceObjectPen();

        pen1.name = "Stylo";
        pen1.color = "Bleu";
        pen1.price = 2.50f;
        pen1.quantity = 10;
        pen1.manufacturing = "Bic";
        pen1.weight = "15g";

        pen1.displayInformation();
    }
}