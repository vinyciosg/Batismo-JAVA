package Arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        String[] nome = new String[3];
        nome [0] = "Naruto";
        nome [1] = "Sakura";
        nome [2] = "Sasuke";


        // Redeclarar o ARRAY
        nome = new String[3];
        nome[0] = "Naruto";
        nome[1] = "Sakura";
        nome[2] = "Dorama";

        // For para fazer um loop no ARRAY
        for (int i = 0; i < 3 ; i++) {
            System.out.println(nome[i]);
        }

    }
}
