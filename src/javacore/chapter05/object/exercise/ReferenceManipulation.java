package javacore.chapter05.object.exercise;

public class ReferenceManipulation {

    String name;

    int counter;

    public ReferenceManipulation (String name) {

        this.name = name;
    }

    public static void main (String[] args) {

        ReferenceManipulation reference1 = new ReferenceManipulation("reference1");

        reference1.displayReferenceName(reference1, reference1.counter);

        ReferenceManipulation copy1 = reference1;

        reference1.displayReferenceName(copy1, copy1.counter);

        updateCounter(reference1 ,reference1.counter);

        reference1.displayReferenceName(reference1, copy1.counter);

    }

    public void displayReferenceName(ReferenceManipulation reference1, int counter) {

        System.out.println("Reference name : " + reference1 + " (" + reference1.counter + ")");
    }

    public static void updateCounter(ReferenceManipulation object, int counter) {

        counter++;
    }
}
