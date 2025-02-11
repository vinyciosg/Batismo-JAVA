package NivelIntermediario.polimorfismo;

public class Ninja implements EstrategiaDeBatalha{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do Construtor chamando os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Metodo geral
    public void HabilidadeEspecial() {

        System.out.println("Meu nome e: " + nome + " e esse é meu ataque especial");
    }

    // Sobrescrevendo o metodo da interface
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é: " + nome + " Essa é minha estrategia de batalha");
    }

    // Sobrecarga de metodo - Inteligencia de combate
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome e: " + nome + " Essa e minha inteligencia de combate");
    }

    // Inteligencia de combate
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
        return "Ninja: " + "nome = " + nome  + ", aldeia = " + aldeia + ", idade = " + idade ;
    }
}
