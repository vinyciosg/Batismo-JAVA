package NivelIntermediario.ClassesAbstratasXinterfaces;

public abstract class Ninja implements estrategiaNinja{

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodos geral ! Todos os ninjas vao ter!
    public void habilidadeEspecial(){
        System.out.println("Meu nome e: " + nome + " E essa é meu ataque");
    }

    // SobreEscrevendo o Metodo da Interface
    @Override
    public void estrategiaBatalhaNinja(){
        System.out.println("Essa é minha estrategia de batalha");
    }

    @Override
    public  void estrategiaDeCombate(){
        System.out.println("Essa é minha estrategia de COMBATE");
    }

 /*    Metodo abstrato - Obrigatorio em todas as classes!
    public abstract void estrategiaNinja();
*/


}
