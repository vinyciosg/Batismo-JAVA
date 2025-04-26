package Desafios.Desafio8teste;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Iniciar uma Linked list com 7 ninjas
        LinkedList<Ninjas1> ListNinjas = new LinkedList<Ninjas1>();

        // Adcionar os ninjas na minha Linked list
        ListNinjas.add(new Ninjas1("Naruto", 20, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("Boruto", 25, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("Kakashi", 18, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("Hinata", 21, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("Sasuke", 15, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("Madara", 28, "Aldeia da folha"));
        ListNinjas.add(new Ninjas1("itachi", 26, "Aldeia da folha"));


        // Adcionar o ninja no inicio da lista
        ListNinjas.addFirst(new Ninjas1("Marin", 29, "Aldeia da folha"));

        // Listar os ninjas
        System.out.println("---------- Lista de Ninjas ----------");
        for (Ninjas1 ninjas1: ListNinjas){
            System.out.println(ninjas1);
        }

        // Remover o ninja no inicio da lista
        Ninjas1 removido =  ListNinjas.removeLast();
        System.out.println("Ninja removido = " + removido);

        // Listar os ninjas
        System.out.println("---------- Lista de Ninjas ----------");
        for (Ninjas1 listaNinjasAtualizada: ListNinjas){
            System.out.println(listaNinjasAtualizada);
        }

        // Procurar um ninja por indice
        Ninjas1 procurarNinja = ListNinjas.get(1);
        System.out.println("Terceiro ninja = " + procurarNinja);

        ListNinjas.sort(Comparator.comparingInt(Ninjas1::getIdade) .thenComparing(Ninjas1::getNome));
        ListNinjas.forEach(System.out::println);

    }
}
