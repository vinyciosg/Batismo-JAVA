package NivelIntermediario.ClassesAbstratasXinterfaces;

public class Uchia  extends Ninja{

    public Uchia(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void estrategiaNinja(){
        System.out.println("Essa e minha estrategia de batalha");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Esse é meu nome: " + nome + " E esse e meu ataque Uchia");
    }

}
