package NivelIntermediario.Heranca;


public class Main {
    public static void main(String[] args) {

        Uzumake n1 = new Uzumake();
        n1.nome = "Naruto Uzumake";
        n1.idade = 17;
        n1.ModoSabioAtivado();

        Hyuga n2 = new Hyuga();
        n2.nome = " Hyuga";
        n2.idade = 20;
        n2.altura = 1.50;
        n2.ByugaSharingank();

        Raruma n3 = new Raruma();
        n3.nome = "Sacura Raruno";
        n3.idade = 22;
        n3.AtivarCura();

        Rinata n4 = new Rinata();
        n4.nome = "Rinata";
        n4.idade = 16;
        n4.HabilidadeQualquer();
        System.out.println();
        Boruto n5 = new Boruto();
        n5.nome = "Boruto Hyuga Uzumaki";
        n5.idade = 15;

        n5.ModoSabioAtivado();
        n5.AtivarCarma();
        n5.AtivarJougan();
    }
}
