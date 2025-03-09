package NivelIntermediario.ENUMS;

public class Main {
    public static void main(String[] args) {


        Missoes naruto = new Missoes(RankDeMissoes.JONIN);
        Missoes sasuke = new Missoes(RankDeMissoes.HOKAGE);

        naruto.exibirNivel();
        sasuke.exibirNivel();


       /* Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.A);
        missao1.exibiDetalhes();

        Missoes missaao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.D);
        missaao2.exibiDetalhes();*/

    }
}
