package Condicoes;

import java.util.Scanner;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
         * lacos de repeticao: vao repetir infinitamente ou ate voce atingit o parametro desejado
         * WHILE = FOR
         *
         * */

        /* While (Condicao) {Tudo aqui vai acontecer}
        int numeroDeClone = 0;
        int numeroMaximoDeClones = 40;
        while (numeroDeClone <= numeroMaximoDeClones){
            numeroDeClone++;
            System.out.println(numeroDeClone);
        }*/

        //FOR
       /* int numeroMaximoDeClones = 40;
        for (int numeroDeClones = 0; numeroDeClones < numeroMaximoDeClones ; numeroDeClones++) {
            System.out.println(numeroDeClones);

        }*/
        Scanner caixa = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int valor = caixa.nextInt();

        for (int i = 0; i <= valor; i++) {

           if ( i % 2 == 1){
                System.out.println( i + ": é impar!");

            } else if (i % 2 == 0) {

               System.out.println( i + ": é Par");
           }
        }
        caixa.close();
    }
}
