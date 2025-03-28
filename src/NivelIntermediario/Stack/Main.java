package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // Sao estaticos
        String[] ninjasArray = new String[3];

        // List
        // Listas sao dinamicas e tamanho almenta e diminui quando precisa

        List<String> ninjasList = new ArrayList<>();

        // Stack
        // O ultimo elemento que entrou é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        ninjasStack.push("Hinata");
        ninjasStack.push("Kakashi");

        System.out.println("Minha Stack atual: " + ninjasStack);
        ninjasStack.pop();
        System.out.println("Minha Stack atualizada com pop: " + ninjasStack);
        System.out.println("Minha Stack atualizada com o proximo elemento do topo =  " + ninjasStack.peek());
        System.out.println("Tamanho da stack: " + ninjasStack.size() + " elementos");

        System.out.println("Minha Stack atual: " + ninjasStack);


    }
}
