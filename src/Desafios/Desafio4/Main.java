package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        NinjaAvancado n1 = new NinjaAvancado("Naruto", 20, "Jogar adaga", "Criar um clone");
        n1.mostrarInformacoes();
        n1.execultarHabilidade();

        NinjaBasico n2 = new NinjaBasico("Boruto", 15, "Soltar bola de fogo", "Se teleportar");
        n2.mostrarInformacoes();
        n2.execultarHabilidade();

    }
}
