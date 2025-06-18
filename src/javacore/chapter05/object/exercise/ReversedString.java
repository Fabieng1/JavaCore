package javacore.chapter05.object.exercise;

public class ReversedString {

    public static void main(String[] args) {

        String text = "! ecicrexe'l issuér zeva suov ,ovarB";
        char newText;

        for(int index = text.length() - 1; index > 0; index--) {

            newText = text.charAt(index);
            System.out.print(newText);
        }
    }
}
