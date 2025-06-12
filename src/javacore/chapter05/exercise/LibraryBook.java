package javacore.chapter05.exercise;

public class LibraryBook {

    /*Chaque livre a un titre, un auteur et une année de publication.

Chaque livre doit être identifié par un numéro ISBN.

Un livre peut être emprunté ou disponible en rayon pour un emprunt.

On veut être capable d'afficher un résumé des informations sur le livre.*/

    String title;
    String author;
    String isbn;

    int yearOfPublication;

    boolean borrowingStatus;

    public static void main (String[] args) {

        LibraryBook book = new LibraryBook();

        book.title = "Ils étaient Dix";
        book.author = "Agatha Christie";
        book.yearOfPublication = 1940;
        book.isbn = "978-2253241782";
        book.borrowingStatus = true;

        book.displayInformation();

    }

    public void displayInformation() {

        System.out.println("Titre : " + title + " | Auteur : " + author + " | N° d'ISBN : " + isbn + " | Année de publication : " + yearOfPublication);

        if (borrowingStatus) {
            System.out.println("Disponible : oui");
        }
        else {
            System.out.println("Disponible : non");
        }

    }

}
