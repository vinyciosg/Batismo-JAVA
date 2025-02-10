package Condicoes;

public class ifEelse {
    public static void main(String[] args) {

        /*
        * Objetivo: Passar de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        String rank;
        
        int idade = 18;
        boolean hokage = false;
        int numeroDeMissoes = 20;

        if (numeroDeMissoes > 10 && idade <= 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Junnin");

        } else {
            System.out.println("Rank: Gennin");
        }


    }
}
