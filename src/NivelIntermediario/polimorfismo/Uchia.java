package NivelIntermediario.polimorfismo;

public class Uchia extends Ninja{

    public Uchia(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    public Uchia(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank){
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void HabilidadeEspecial() {

        System.out.println("Meu nome e: " + nome + " e esse é meu ataque Uchia. Eu ja completei: " + numeroDeMissoesConcluidas + " Missoes e meu nivel é: " + NivelNinja.CHUNNIN);
    }

}
