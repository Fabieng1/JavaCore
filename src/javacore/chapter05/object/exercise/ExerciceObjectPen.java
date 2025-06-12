package javacore.chapter05.object.exercise;

public class ExerciceObjectPen {

    String name;
    String color;
    String manufacturing;
    String weight;

    float price;
    int quantity;

    public void displayInformation() {

        System.out.println("Nom : " + name + " | Couleur : " + color + " | Prix : " + price + "€ | Quantité : " + quantity + " | Fabriquant : " + manufacturing + " | Poids : " + weight);
    }
}
