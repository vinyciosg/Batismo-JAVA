package Desafios.Desafio9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Adicionar livros
        LinkedList<Livros> livros = new LinkedList<>();
        livros.add(new Livros("O Pequeno principe", "Pablo", 147852369));
        livros.add(new Livros("sSereia", "Ramos",123456));
        livros.add(new Livros("Shark boy", "Vinycios",33335));
        livros.add(new Livros("A pequena sereia", "Gustavo",678666));

        // Remover livros
        Livros removido =  livros.remove(2);


        // Buscar livros por título

        // Listar todos os livros ordenados por título
        Collections.sort(livros, new Comparator<Livros>() {
            @Override
            public int compare(Livros o1, Livros o2) {
                return o1.getTiulo().compareToIgnoreCase(o2.getTiulo());
            }
        });

        // Contar quantos livros de um determinado autor existem na biblioteca



    }
}
