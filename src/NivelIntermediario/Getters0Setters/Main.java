package NivelIntermediario.Getters0Setters;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------- Naruto Uzumaki -------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aleia da folha", 17, 30, 1.50);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto com nome alterado");
        System.out.println("Meu nome é: " + naruto.getNome());

        System.out.println("---------  Ssuke Uchia ----------");

    }
}
