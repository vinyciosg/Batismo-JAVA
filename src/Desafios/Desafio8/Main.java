package Desafios.Desafio8;

import Desafios.Desafio8teste.Ninjas1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Iniciando a Linkedlist
        LinkedList<Ninjass> Ninjas = new LinkedList<>();

        // Adcionando os 7 Ninjas
        Ninjas.add(new Ninjass("Naruto", 20, "Aldeia da folha"));
        Ninjas.add(new Ninjass("Boruto", 25, "Aldeia da folha"));
        Ninjas.add(new Ninjass("Kakashi", 18, "Aldeia da folha"));
        Ninjas.add(new Ninjass("Hinata", 21, "Aldeia da folha"));
        Ninjas.add(new Ninjass("Sasuke", 15, "Aldeia da folha"));
        Ninjas.add(new Ninjass("Madara", 28, "Aldeia da folha"));
        Ninjas.add(new Ninjass("itachi", 26, "Aldeia da folha"));

        Scanner caixa = new Scanner(System.in);
        int opcao = 0;
        int escolha = 0;

        do {

            System.out.println();
            System.out.println("----------Lista dos Ninjas -----------");
            System.out.println("1. Listar os Ninjas");
            System.out.println("2. Remover o primeiro Ninja");
            System.out.println("3. Adcionar um Ninja no inicio");
            System.out.println("4. Acessar um Ninja");

            System.out.print("Escolha um numero = ");
            escolha = caixa.nextInt();
            caixa.nextLine();

            switch (escolha){
                case 1:
                    for (Ninjass ninjas : Ninjas){
                    System.out.println(ninjas);
                }
                    break;
                case 2:
                    Ninjass remover = Ninjas.removeFirst();
                    System.out.println("Ninja removido: " + remover);
                    break;
                case 3:
                    Ninjas.addFirst(new Ninjass("Gustavo", 21, "Aldeia da folha"));
                    break;
                case 4:
                    Ninjass procurarNinja = Ninjas.get(6);
                    System.out.println("Ninja selecionado: " + procurarNinja);

            }


        }while (opcao != 4);


    }
}
