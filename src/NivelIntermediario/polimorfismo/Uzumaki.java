package NivelIntermediario.polimorfismo;

public class Uzumaki extends Ninja{

    Biju bijus;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade, double altura) {
        super(nome, aldeia, idade, altura);
    }

    public Uzumaki(String nome, String aldeia, int idade, double altura, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, altura, numeroDeMissoesConcluidas, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, double altura, int numeroDeMissoesConcluidas, NivelNinja rank, Biju bijus) {
        super(nome, aldeia, idade, altura, numeroDeMissoesConcluidas, rank);
        this.bijus = bijus;
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Meu nome e: " + nome + " e esse é meu ataque Uzumaki. Eu ja completei: " + numeroDeMissoesConcluidas );
    }

}
