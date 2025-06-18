package javacore.chapter05.object.practice;

import java.util.Scanner;

public class PracticeArray {

    public static void main(String[] args) {

        int[] integerArray = {1, 2, 3, 4, 5};

        System.out.println(" Référence du tableau : " + integerArray);
        System.out.println("Taille du tablau : " + integerArray.length);

        System.out.println("Premier (1) élément du tableau : " + integerArray[0]);
        System.out.println("Dernier élément du tableau : " + integerArray[4]);

        // ArrayIndexOutOfBoundsException
        // System.out.println("Index (lecture) invalide : " + integerArray[1337]);

        integerArray[0] = 10;
        System.out.println("Premier (2) élément du tableau : " + integerArray[0]);

        // ArrayIndexOutOfBoundsException
        // integerArray[1337] = 100;
        // System.out.println(("Index (modification) invalide : " + integerArray[1337]));

        for(int index = 0; index < integerArray.length; index++) {

            System.out.println(integerArray[index]);
        }

        int[] integerArray2 = new int[20];
        System.out.println("Premier élément d'integerArray2 : " + integerArray2[0]);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Combien d'éléments voulez-vous additionner ?");
        int desiredUserSize = scanner.nextInt();

        int[] userNumberArray = new int[desiredUserSize];

        for(int index = 0; index < userNumberArray.length; index++) {
            System.out.println("Entrez le nombre (" + index + "/" + desiredUserSize + ") : ");
            userNumberArray[index] = scanner.nextInt();
        }

        int sumResult = 0;

        for(int index = 0; index < userNumberArray.length; index++) {

            sumResult += userNumberArray[index];
        }

        System.out.println("Résultat : " + sumResult);
    }
}
