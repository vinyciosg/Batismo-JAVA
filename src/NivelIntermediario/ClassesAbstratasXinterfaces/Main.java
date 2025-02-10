package NivelIntermediario.ClassesAbstratasXinterfaces;

public class Main {
    public static void main(String[] args) {

        //  Obj Ninja nao da pra ser criada por ser abstrata

        // Obj Uzimaki
        Uzumaki n1 = new Uzumaki();
        n1.nome = "Naruto";
        n1.habilidadeEspecial();
        n1.estrategiaBatalhaNinja();

        System.out.println();
        // Obj Uchia
        Uchia n2 = new Uchia("sasuke", "aldeia da folha", 18);
        n2.habilidadeEspecial();
        n2.estrategiaNinja();
    }

}
