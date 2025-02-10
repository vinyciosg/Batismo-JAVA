package Condicoes;

import java.util.Scanner;

public class Scanners {

    public static void main(String[] args) {
        /*
        *Scanner é um jeito de trazer o usuario para dentro da aplicação.
        * Objetivo: o usuario vai criar um ninja e vamos validar os dados.
        * */



        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.print("Escreva aqui o nome do Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja e: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.print("Escreva aqui a idade do " + nomeDoNinja + ": ");
        int idadeNinja = caixaDeTexto.nextInt() ;
        System.out.println("A idade do " + nomeDoNinja + " é: "  + idadeNinja);
        System.out.println("-------------------");

        // Tratamento de dados
        if (idadeNinja >=18){
            System.out.println("Esse ninja ja e maior de idade e pode ir para missoes fora da aldeia!");
        }else {
            System.out.println("Esse ninja é muito novo ainda!");
        }


        // Fechar sempre o Scaner
        caixaDeTexto.close();

    }
}
