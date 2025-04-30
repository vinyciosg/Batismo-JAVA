package Desafios.Desafio9;

public class Livros {

    private String tiulo;
    private String autor;
    private int id;

    public Livros(String tiulo, String autor, int id) {
        this.tiulo = tiulo;
        this.autor = autor;
        this.id = id;
    }

    public String getTiulo() {
        return tiulo;
    }

    public void setTiulo(String tiulo) {
        this.tiulo = tiulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "tiulo='" + tiulo + '\'' +
                ", auor='" + autor + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
