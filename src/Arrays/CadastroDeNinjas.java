package Arrays;

import java.util.Scanner;

public class CadastroDeNinjas {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);
        String[] ninjas = new String[3];
        int opcao;
        int contadorNinjas = 0;

        do {

            System.out.println("--- Menu de ninjas ---");
            System.out.println("1. cadastro de Ninja ");
            System.out.println("2. Listar Ninjas ");
            System.out.println("3. sair");
            System.out.print("Escolha uma opção: ");
            opcao = caixa.nextInt();
            System.out.println();
            caixa.nextLine();


            switch (opcao){
                case 1:
                    if (contadorNinjas < ninjas.length) {
                        System.out.print("Digite o nome do ninja: ");
                        ninjas[contadorNinjas] = caixa.nextLine();
                        contadorNinjas++;

                        System.out.println("Ninja cadastrado com sucesso!");
                        System.out.println("------------------------");
                    }else {
                        System.out.println("Limite de ninjas atingido!");
                    }
                    break;

                case 2:
                    if (contadorNinjas > 0){
                        System.out.println("Ninjas cadastrados!");
                        for (int i = 0; i < contadorNinjas; i++) {
                            System.out.println((i + 1) +". " + ninjas[i]);
                        }
                    }else {
                        System.out.println("Nenhum ninja cadastrado!");
                        System.out.println("-----------------");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente!!");
            }

        }while (opcao != 3);

        caixa.close();
    }
}
