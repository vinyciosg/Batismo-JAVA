package NivelIntermediario.construtores;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;


    // All args Constructor


    public Hokages(String nome, int idade, boolean vivoOuMorto) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }

    public abstract void sabedoria();

    // Noargs Constructor
    public Hokages() {
    }
}

