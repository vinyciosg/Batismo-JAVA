package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------- NARUTO ----------------");

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 15, 1.50, 20, NivelNinja.GENNIN, NivelIntermediario.polimorfismo.Biju.SHUKAKU);
        System.out.println(naruto.bijus);
        naruto.HabilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.inteligenciaDeCombate(120);

        System.out.println("---------------- SASUKE ----------------");

        Uchia sasuke = new Uchia("Sasuke", "Aldeia da folha", 20, 1.40, 150, NivelNinja.JONNIN);
        sasuke.HabilidadeEspecial();
        sasuke.ativarSharingan();

        System.out.println("---------------- MADARA ----------------");

        Uchia madara = new Uchia("Madara", "Aldeia da folha", 35, 1.60, 25, NivelNinja.ANBU);
        madara.HabilidadeEspecial();
        madara.estrategiaDeBatalha();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(200 );

        System.out.println("--------------------------------");

    }
}
