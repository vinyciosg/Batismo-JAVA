package Desafios.Desafio4;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("------- NINJA -------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habilidade: " + this.habilidade + " E meu tipo de Habilidade é: " + TipoHabilidadeEnum.NINJUTSU + ", " + TipoHabilidadeEnum.TAIJUSTSU);
        System.out.println("Especialidade: " + this.especialidade);
    }

    @Override
    public void execultarHabilidade() {
        System.out.println("Execultando Habilidade: " + this.habilidade);
    }



}

