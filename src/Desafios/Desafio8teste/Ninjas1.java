package Desafios.Desafio8teste;

public class Ninjas1 {
    private String nome;
    private int idade;
    private String vila;

    public Ninjas1(String nome, int idade, String vila) {
        this.nome = nome;
        this.idade = idade;
        this.vila = vila;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", Idade = " + idade + ", Vila = " + vila;
    }
}
