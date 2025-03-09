package NivelIntermediario.polimorfismo;

public class Uchia extends Ninja implements AtivarSharingan{

    public Uchia() {
    }

    public Uchia(String nome, String aldeia, int idade, double altura){
        super(nome, aldeia, idade, altura);
    }

    public Uchia(String nome, String aldeia, int idade, double altura, int numeroDeMissoesConcluidas, NivelNinja rank){
        super(nome, aldeia, idade, altura, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.println("Meu nome e: " + nome + " e esse é meu ataque Uchia. Eu ja completei: " + numeroDeMissoesConcluidas + " Missoes e meu nivel é: ");
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
    /*
    * Metodo:
    * Implementado da interface AtivarSharingan
    * */
    public void ativarSharingan(){
        System.out.println("Meu nome é " + nome + " E eu ativei meu Sharingan");
    }

    @Override
    public String toString() {
        return "Uchia{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                '}';
    }
}
