package javacore.chapter05.object.exercise;

public class QuickStart {

    public static void main(String[] args) {

        int[] numbers = {30, 25, 85, 6, 43, 58, 97, 78, 94, 27, 9, 38, 41, 35, 52, 10, 16, 22, 96, 74, 44, 55, 82, 28, 83, 69, 90, 89, 26, 7, 47, 98, 50, 42, 68, 91, 70, 65, 79, 4, 75, 49, 61, 39, 48, 72, 36, 18, 1, 15, 77, 99, 33, 24, 13, 19, 73, 17, 14, 86, 54, 45, 76, 21, 100, 63, 60, 56, 93, 87, 81, 8, 29, 34, 53, 37, 71, 67, 57, 66, 11, 46, 95, 20, 88, 64, 59, 84, 12, 92, 80, 40, 23, 3, 2, 32, 31, 5, 62, 51};

        quickSort(numbers, 0, numbers.length - 1);

        // Affichage du tableau trié
        for (int displayTab = 0; displayTab < numbers.length; displayTab++) {
            System.out.print(numbers[displayTab] + " ");
        }
    }

    public static void quickSort(int[] numbers, int indexDown, int indexUp) {
        if (indexDown < indexUp) {
            int indexPivot = partition(numbers, indexDown, indexUp);
            quickSort(numbers, indexDown, indexPivot - 1); // Tri à gauche du pivot
            quickSort(numbers, indexPivot + 1, indexUp);   // Tri à droite du pivot
        }
    }

    public static int partition(int[] numbers, int indexDown, int indexUp) {
        int numberRandom = numbers[indexUp]; // Pivot
        int indexTemps = indexDown - 1;      // Indice pour les petits éléments

        for (int indexNumbers = indexDown; indexNumbers < indexUp; indexNumbers++) {
            if (numbers[indexNumbers] <= numberRandom) {
                indexTemps++;
                // Échange
                int tempNumbers = numbers[indexTemps];
                numbers[indexTemps] = numbers[indexNumbers];
                numbers[indexNumbers] = tempNumbers;
            }
        }

        // Échange du pivot
        int tempNumbers = numbers[indexTemps + 1];
        numbers[indexTemps + 1] = numbers[indexUp];
        numbers[indexUp] = tempNumbers;

        return indexTemps + 1;
    }
}
