package Condicoes;

public class Desafio1 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeninja1 = "Naruto";
        int idadeninja1 = 10;
        String dificuldadeninja1 = "A";
        boolean statusConclusao = true;

        System.out.println("Nome do ninja: " + nomeninja1);
        System.out.println("Idade do ninja: " + idadeninja1);

        if (dificuldadeninja1 == "A" && idadeninja1 >= 10){
            System.out.println("----------");
            System.out.println("Status: " + statusConclusao);
            System.out.println("Missao concluida");
            System.out.println("--------------");
        }else {
            System.out.println("O ninja nao pode concluir a missao por nao preencher os requisitos minimos!");
            System.out.println("------------");
        }

        //Ninja 2
        String nomeninja2 = "Saske";
        int idadeninja2 = 14;
        String dificuldadeninja2 = "B";
        String statusConclusao2 = "";

        System.out.println("Nome: " + nomeninja2);
        System.out.println("Idade: " + idadeninja2);
        System.out.println("Dificuldade: " + dificuldadeninja2);

        if (idadeninja2 <15) {
            System.out.println("Esse ninja só podera concluir missoes de nivel C e D");
        }else if (idadeninja2 >=15){
            System.out.println("Esse ninja podera concluir missoes de qualquer nivel!");
        }

        //Ninja 3
        String nomeninja3 = "Teemo";
        int idadeninja3 = 22;
        String dificuldadeninja3 = "A";
        String statusConclusao3 = "";


    }
}
