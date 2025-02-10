package Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: que servem para gerar casos especificos
        * Objetivo: pedir pro usuario escoolher entre os ninjas
        * */

        // pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar opcao para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println(" 1 Naruto Uzomaki");
        System.out.println(" 2 Naruto Uchia");
        System.out.println(" 3 Naruto Haruno");
        System.out.println("-----------------");
        int escolha = scanner.nextInt();
        System.out.println("Voce digitou o numero: " + escolha);

        switch (escolha){
            case 1:
                System.out.println("Voce escolheu Uzomaki");
                break;
            case 2:
                System.out.println("Voce escolheu Uchia");
                break;
            case 3:
                System.out.println("Voce escolheu Haruno");
                break;
            default:
                System.out.println("Voce tem que escolher uma das 3 opcoes!");
        }

        // Fechar a caixa
        scanner.close();
    }
}
