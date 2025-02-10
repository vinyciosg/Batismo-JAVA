package Desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);
        ArrayList<Ninja> ninjas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("--------- MENU ---------");
            System.out.println("1. Exibir informacoes dos ninjas");
            System.out.println("2. Adcionar novos ninjas");
            System.out.println("3. Atualizar habilidades especiais");
            System.out.println("4. sair ");
            System.out.println("------------------");
            opcao = caixa.nextInt();
            caixa.nextLine();

            switch(opcao){

                case 1:
                    if (ninjas.isEmpty()){
                        System.out.println("Nenhum ninja cadastrado");
                    }else {
                        for (Ninja ninja : ninjas) {
                            ninja.mostrarInformacoes();
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nome do ninja: ");
                    String nome = caixa.nextLine();
                    System.out.print("Idade: ");
                    int idade = caixa.nextInt();
                    caixa.nextLine();
                    System.out.print("Missao: ");
                    String missao = caixa.nextLine();
                    System.out.print("Nivel de dificuldade: ");
                    String dificuldade = caixa.nextLine();
                    System.out.print("Status da missao: ");
                    String statusDaMissao = caixa.nextLine();

                    ninjas.add(new Ninja(nome, idade, missao, dificuldade, statusDaMissao));
                    System.out.println("Ninja adcionado com sucesso!");
                    break;

                case 3:
                    System.out.print("Digite o nome do ninja para atualizar a habilidade especial: ");
                    String nomeAtualizar = caixa.nextLine();
                    boolean encontrado = false;

                    for (Ninja ninja : ninjas) {
                        if (ninja instanceof  Uchia && ninja.nome.equals(nomeAtualizar)) {

                            System.out.println("Nova habilidade especial: ");
                            String novaHabilidade = caixa.nextLine();
                             ((Uchia) ninja).mostrarHabilidade();
                             encontrado = true;
                        }

                    }
                    break;

            }

        }


    }
}
