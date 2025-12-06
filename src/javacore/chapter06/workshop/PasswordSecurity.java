package javacore.chapter06.workshop;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class PasswordSecurity {

    public static void main(String[] args) {

        /*Les méthodes doivent être static afin de ne pas être créer à chaque fois via une instance*/

        Scanner sc = new Scanner(System.in);

        String encode;
        String decode;

        System.out.println("Entrez votre mot de passe : ");
        String password = sc.nextLine();

        encode = base64Encodage(password);
        decode = base64Dencodage(encode);


        System.out.println(encode);
        System.out.println(decode);



    }

    public static String base64Encodage (String passwordEncode) {

        return Base64.getEncoder().encodeToString(passwordEncode.getBytes(StandardCharsets.UTF_8));
    }

    public static String base64Dencodage (String passwordEncode) {

        return new String(Base64.getDecoder().decode(passwordEncode));
    }


}
