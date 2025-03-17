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

    }

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
