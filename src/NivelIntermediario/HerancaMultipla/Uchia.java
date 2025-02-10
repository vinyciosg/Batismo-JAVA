package NivelIntermediario.HerancaMultipla;

public class Uchia extends Ninja implements AtivarSharingan, AnbuInterface{

    public Uchia(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // Esse metodo vem direto da interface
    public void ninjaDeElite(){
        System.out.println(nome + " Eu sou um ninja de elita da ANBU");

    }

    // Esse metodo vem direto da interface
    public void sharinganAtivado(){
        System.out.println("meu nome e: " + nome +  " E eu ativei o meu Sharingan!!");
    }

}
