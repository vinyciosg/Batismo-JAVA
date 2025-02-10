package TiposDeDados;

import java.util.Scanner;

public class DadosPrimitivos {
    public static void main(String[] args) {

        /*
        * Dados primitivos - int, float, double, char, boolean, short.
        * Objetivos da aula: Criar um ninja - Naruto.
        *s
        * */
        Scanner Pergunta = new Scanner(System.in);



        int idade = Pergunta.nextInt(); // Valor maximo: 2147483647
        double altura = Pergunta.nextDouble();
        char inicial = 'N';
        boolean VivoOuMorto = true;
        Long SaldoBancario = Pergunta.nextLong() ; // Valor maximo: 9,223,372,036,854,775,807

        System.out.println("Idade: " + idade + "\nAltura: " + altura + "\nSaldo bancario: " + SaldoBancario);

    }
}



