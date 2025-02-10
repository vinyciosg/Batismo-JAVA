package NivelIntermediario.polimorfismo;

public class Uzumaki extends Ninja{


    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void HabilidadeEspecial() {

        System.out.println("Meu nome e: " + nome + " e esse é meu ataque Uzumaki. Eu ja completei: " + numeroDeMissoesConcluidas + " Missoes e meu nivel e:" + NivelNinja.JOUNNIN );
    }
}
