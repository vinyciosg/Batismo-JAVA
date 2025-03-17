package Desafios.Desafio7;

public class Funcionario {

    String nome;
    double salario;

    public void calcularBonus(){
        int valor;
        valor = (int) (salario * 0.10);
        salario += valor;
        System.out.println("Bonus de: " + valor);
    }

    public void exiirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
