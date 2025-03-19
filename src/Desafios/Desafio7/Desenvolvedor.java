package Desafios.Desafio7;

public class Desenvolvedor extends Funcionario{

    String linguagem;

    @Override
    public void calcularBonus() {
        int valor;
        valor = (int) (salario * 0.15);
        salario+= valor;
        System.out.println("Bonus de: " + valor);
    }

    @Override
    public void exiirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Linguagem: " + this.linguagem);
        System.out.println("Trabalho: " + this.escala);
    }

    public Desenvolvedor(String nome, double salario, DiasDaSemana escala, String linguagem) {
        super(nome, salario, escala);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
