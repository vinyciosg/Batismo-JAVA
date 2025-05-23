package Desafios.Desafio7;

public class Gerente extends Funcionario{

    String departamento;

    @Override
    public void calcularBonus(){
        int valor;
        valor = (int) (salario * 0.05);
        salario+= valor;
        System.out.println("Bonus de: " + valor);
    }

    @Override
    public void exiirInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Trabalho: " + this.escala);
    }

    public Gerente(String nome, double salario, DiasDaSemana escala, String departamento) {
        super(nome, salario, escala);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
