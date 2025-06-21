package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";

        String wordReference = "";
        String[] result  = text.split(" ");

        int currentWord;

        for (currentWord = 0; currentWord < result.length; currentWord++) {

            if (result[currentWord].length() > wordReference.length()) {

                wordReference = result[currentWord];
            }
        }
        System.out.println(wordReference);
    }
}
