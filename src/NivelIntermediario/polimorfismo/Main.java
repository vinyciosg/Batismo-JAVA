package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {

       /* Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 15, 150, NivelNinja.JOUNNIN);
        naruto.HabilidadeEspecial();

        Uchia sasuke = new Uchia("sasuke", "Aldeia da folha", 18);
        sasuke.HabilidadeEspecial();

        Uchia madara = new Uchia("Madara", "Aldeia da folja", 29, 778,NivelNinja.HOKAGE);
        madara.HabilidadeEspecial();
        madara.estrategiaDeBatalha();
        // Metodo comum
        madara.inteligenciaDeCombate();
        // Metodo sobrecarregado
        madara.inteligenciaDeCombate(200 );*/

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 16);
        System.out.println(naruto);

        System.out.println();

        System.out.println("--------------- Sasuke Uchia ---------------");
        Uchia sasuke = new Uchia("Sasuke", "Aldeia da folha", 18);



    }
}
