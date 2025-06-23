package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";

        char char1 = ' ';
        char char2 = ' ';

        String result1 = "";
        String result2 = "";

        /*String wordReference = "";
        String[] result  = text.split(" ");

        int currentWord;

        for (currentWord = 0; currentWord < result.length; currentWord++) {

            if (result[currentWord].length() > wordReference.length()) {

                wordReference = result[currentWord];
            }
        }
        System.out.println(wordReference);*/

        for (int currentChar = 0; currentChar < text.length(); currentChar++) {

            char1 = text.charAt(currentChar);

            if (char1 != ' ') {
                result1 = result1 + char1;
            }

            if (char1 == ' ' && result1.length() > result2.length()) {

                result2 = result1;
            }

            if (char1 == ' ') {
                result1 = "";
            }
        }

        if (result1.length() > result2.length()) {

            result2 = result1;
        }
        System.out.println();
        System.out.println("Le mot le plus long est : " + result2);
    }
}