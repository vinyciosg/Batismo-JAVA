package NivelIntermediario.HerancaMultipla;

public class Hatake extends Ninja implements AtivarSharingan, AnbuInterface{

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas(){
        System.out.println("Eu sou um Hatake: " + nome);
    }

    public void ninjaDeElite(){
        System.out.println(nome + " Eu sou um ninja de elita da ANBU");
    }

    // Esse metodo vem direto da interface
    public void sharinganAtivado(){
        System.out.println("meu nome e: " + nome +  " E eu ativei o meu Sharingan!!");

    }

}
