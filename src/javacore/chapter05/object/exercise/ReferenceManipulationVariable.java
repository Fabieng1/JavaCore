package javacore.chapter05.object.exercise;

public class ReferenceManipulationVariable {

    String name;

    int counter;

    public ReferenceManipulationVariable (String name) {

        this.name = name;
    }

    public void displayReferenceName() {

        System.out.println("Reference name " + name + " (" + counter + ")");
    }

    public static void updateCounter(ReferenceManipulationVariable object, int counter) {
        counter++;
    }
}
