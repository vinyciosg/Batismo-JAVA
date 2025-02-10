package Arrays;

import java.util.Scanner;

public class caixa {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);

        String[] ninjas = new String[5];
        int contadorNinjas = 0;
        int opcao;

        do {
            System.out.println();
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar um ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = caixa.nextInt();
            caixa.nextLine();

            switch (opcao) {

                case 1:
                    if (contadorNinjas < ninjas.length) {
                        System.out.print("Digite o nome do ninja: ");
                        ninjas[contadorNinjas] = caixa.nextLine();
                        contadorNinjas++;

                        System.out.println("Ninja cadastrado!");
                        System.out.println("-----------");
                    }else {
                        System.out.println("Limite de ninjas cadastrados!");
                        System.out.println();
                    }
                    break;

                case 2:
                    if (contadorNinjas > 0){
                        System.out.println("Ninjas cadastrados");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }else {
                        System.out.println("Nenhum ninja cadastrado!");
                        System.out.println();
                    }
                    break;

                case 3:
                    if (contadorNinjas > 0){
                        System.out.print("Digite o numero do ninja que qeur ser deletado: ");
                        int deletar = caixa.nextInt() - 1;

                        if (deletar >= 0 && deletar < contadorNinjas) {
                            for(int i = deletar; i < contadorNinjas; i++) {
                                ninjas[1] = ninjas[i + 1];
                            }
                            ninjas[contadorNinjas - 1] = null;
                            contadorNinjas--;
                            System.out.println("Ninja deletado");
                        }


                    }

                    break;


                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    System.out.println();
                    break;
            }

        }while (opcao != 4);

        caixa.close();
    }

}
