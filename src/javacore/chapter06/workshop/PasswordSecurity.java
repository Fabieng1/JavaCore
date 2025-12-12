package javacore.chapter06.workshop;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class PasswordSecurity {

    public static void main(String[] args) {

        /*Les méthodes doivent être static afin de ne pas être créer à chaque fois via une instance*/

        Scanner sc = new Scanner(System.in);

        String encoding;
        String decoding;

        System.out.println("Entrez votre mot de passe : ");
        String password = sc.nextLine();

        encoding = base64Encoding(password);
        decoding = base64Decoding(encoding);


        System.out.println(encoding);
        System.out.println(decoding);



    }

    public static String base64Encoding (String passwordEncode) {

        return Base64.getEncoder().encodeToString(passwordEncode.getBytes(StandardCharsets.UTF_8));
    }

    public static String base64Decoding (String passwordEncode) {

        return new String(Base64.getDecoder().decode(passwordEncode));
    }




}
