package Desafios.Desafio4;

public class NinjaBasico extends NinjaAvancado implements Ninja{

    public NinjaBasico(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade, especialidade);
    }

    @Override
    public void mostrarInformacoes(){
      System.out.println("------- NINJA -------");
      System.out.println("Nome: " + this.nome);
      System.out.println("Idade: " + this.idade);
      System.out.println("Habilidade: " + this.habilidade + " E meu tipo de Habilidade é: "+ TipoHabilidadeEnum.GENJUTSU + ", " + TipoHabilidadeEnum.KATON);
      System.out.println("Especialidade: " + this.especialidade);

  }

  @Override
    public void execultarHabilidade(){
        System.out.println("Execultando Habilidade: " + this.habilidade);
  }



}
