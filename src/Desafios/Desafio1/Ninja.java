package Desafios;

public class Ninja {

    String nome;
    int idade;
    String missao;
    String dificuldade;
    String statusMissao;

    public Ninja(String nome, int idade, String missao, String dificuldade, String statusMissao){
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.dificuldade = dificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade do ninja e: " + idade);
        System.out.println("Missao do ninja vai ser: " + missao);
        System.out.println("Nivel de dificuldade: " + dificuldade);
        System.out.println("Status da missao: " + statusMissao);


    }

}
