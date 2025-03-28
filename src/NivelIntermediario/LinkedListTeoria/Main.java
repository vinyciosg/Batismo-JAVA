package NivelIntermediario.LinkedListTeoria;

public class Main {
    public static void main(String[] args) {

        // Criando a LinkedList de ninjas
        Ninja naruto = new Ninja("Naruto Uzumaki", 17, "Konoha");
        Ninja sasuke = new Ninja("Sasuke Uchiha", 15, "Konoha");
        Ninja sakura = new Ninja("Sakura Haruno", 20, "Konoha");
        Ninja kakashi = new Ninja("Kakashi Hatake", 30, "Konoha");


        // Ligando os nós
        naruto.proximo = sasuke;
        sasuke.proximo = sakura;
        sakura.proximo = kakashi;
        kakashi.proximo = null;

        Ninja atual = naruto;

        while (atual != null) {
            System.out.println("Nome: " + atual.nome + ", Idade: " + atual.idade + ", Vila: " + atual.vila);
            atual = atual.proximo;
        }


    }
}
