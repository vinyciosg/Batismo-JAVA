package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        /*
        *  Ternarios sao usados para reduzir o codigor
        *  Variavel = (Condicao) ? valorSeVerdasdeiro : valorSeFalso:
        *
        * */

        int numeroDeMissoes = 5;
        String nivel = (numeroDeMissoes >= 10 ) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja esta com menos de 10 missoes";
        System.out.println(nivel);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade : ");
        int idade = scanner.nextInt();

        // Usando operador Ternario para verificar a maior idade
        String resultado = (idade >=18) ? "Voce ja é maior de idade" : "Voce ainda e menor de idade";
        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
