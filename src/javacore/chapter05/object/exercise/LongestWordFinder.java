package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";

        String[] wordReference = {"a"};
        String[] result  = text.split(" ");

        int currentWord = 0;

        for (currentWord = 0; currentWord < result.length; currentWord++) {

            if (result.length > result.length - 1) {

                wordReference = result;
            }
        }
        System.out.println(wordReference[currentWord]);
    }
}
