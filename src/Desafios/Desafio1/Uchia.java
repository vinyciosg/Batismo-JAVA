package Desafios;

public class Uchia extends Ninja{

    String habilidadeEspecial;

    public Uchia(String nome, int idade, String missao, String dificuldade, String statusMissao, String habilidadeEspecial){
        super(nome, idade, missao, dificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidade(){

        System.out.println("Minha habilidade especial e: " + habilidadeEspecial);

    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidade();
    }


}
