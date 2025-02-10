package NivelIntermediario.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da folha", 15, 150, NivelNinja.JOUNNIN);
        naruto.HabilidadeEspecial();

        System.out.println();

        Uchia sasuke = new Uchia("sasuke", "Aldeia da folha", 18);
        sasuke.HabilidadeEspecial();

        Uchia madara = new Uchia("Madara", "Aldeia da folja", 29, 778,NivelNinja.HOKAGE);
        madara.HabilidadeEspecial();


    }
}
