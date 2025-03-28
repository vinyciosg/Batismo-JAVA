package NivelIntermediario.ArrrayListStackResumo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ARRAY é estatico, tamanho pré definido
        System.out.println("---------- ARRAY ----------");
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sakura";
        ninjasArray[2] = "Danilo";
        System.out.println("Nome do ninja = " + ninjasArray[1]);

        // Lista é um pouco mais lenta em comparacao com ARRAY
        System.out.println("---------- LIST -----------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Boruto");
        System.out.println(ninjasList);

        // STACK o ultimo a entrar é o primeiro a sair!
        System.out.println("---------- STACK -----------");
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        ninjasStack.push("Boruto");
        System.out.println("Mostrar STACK = " + ninjasStack);
        System.out.println("Tirar da pilha/Stack = " + ninjasStack.pop());

        // QUEUE // FILAS
        System.out.println("---------- QUEUE -----------");
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Boruto");
        ninjasQueue.add("Kakashi");

        // Mostrar fila
        System.out.println("Ninjas na fila = " + ninjasQueue);

        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do POLL = " + ninjasQueue);

        // Como ver quem é o primeiro
        System.out.println("Ninjas no HEAD = " + ninjasQueue.peek());

        // Adcionar na fila
        ninjasQueue.add("Minata");
        ninjasQueue.add("Tobirama");
        System.out.println("Ninjas na fila = " + ninjasQueue);

        // Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        System.out.println("Ninjas na fila = " + ninjasQueue);
        ninjasQueue.poll();
        System.out.println("Ninjas na fila = " + ninjasQueue);

        // Verificar se esta vazia a fila
        if (ninjasQueue.isEmpty()){
            System.out.println("A fila esta fazia!");
        }


        /*
        *  1) Arrays sao estaticos
        *     exigem um tamanho pre definido
        *
        *  2) Listas sao dinamicas Aumentam e diminuem de tamanho
        *     comforme precisamos
        *
        *  3) Stack sao unicos
        *     Exigem uma ordem! O ultimo a entrar é o primeiro  a sair!
        *
        *  4) Queue FIFO ( Primeiro a entrar - Primeiro a sair )
        *
        *
        * */



    }
}
