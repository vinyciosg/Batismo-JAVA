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

    // Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome e: " + nome + " Essa e minha inteligencia de combate");
    }

    // Inteligencia de combate
    @Override
    public void inteligenciaDeCombate(int qi ) {

        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e voce e um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce e um ninja promissor");

        }else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar suas estrategias");

        }

    }

    @Override
    public String toString() {
        return "Uchia{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                ", rank=" + rank +
                '}';
    }
}
