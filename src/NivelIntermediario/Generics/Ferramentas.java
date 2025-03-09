package NivelIntermediario.Generics;

public class Ferramentas {

    private String nome;

    public Ferramentas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return nome;
    }

}
