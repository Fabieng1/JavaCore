package javacore.chapter05.object.practice;

public class PracticeVarialbleDefault {

    int integer;
    double comea;
    boolean trueOrFalse;
    char caracter;

    String textValue;

    public static void main (String[] args) {

        PracticeVarialbleDefault textValue = new PracticeVarialbleDefault();

        System.out.println("Entier : " + textValue.integer) ;
        System.out.println("Virgule : " + textValue.comea);
        System.out.println("Booléan : " + textValue.trueOrFalse);
        System.out.println("Char : " + textValue.caracter);
        System.out.println("Objet : " + textValue.textValue);

        textValue.textValue.toLowerCase();

        textValue.textValue = "TEST";
        System.out.println(textValue.textValue);

    }
}
