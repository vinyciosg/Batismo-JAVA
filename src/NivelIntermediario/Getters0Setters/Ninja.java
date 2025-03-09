package NivelIntermediario.Getters0Setters;

public abstract class Ninja {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidads;
    private double altura = 2.10;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidads, double altura) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.numeroDeMissoesConcluidads = numeroDeMissoesConcluidads;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNumeroDeMissoesConcluidads() {
        return numeroDeMissoesConcluidads;
    }

    public void setNumeroDeMissoesConcluidads(int numeroDeMissoesConcluidads) {
        this.numeroDeMissoesConcluidads = numeroDeMissoesConcluidads;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
