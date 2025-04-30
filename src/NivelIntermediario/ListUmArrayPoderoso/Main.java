package NivelIntermediario.ListUmArrayPoderoso;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        * ARRAY
        * Sao estaticos, nao alteram de tamanho
        * */
        String[] NinjaArray = new String[3];
        NinjaArray[0] = "Naruto"; // index: 0
        NinjaArray[1] = "Sasuke"; // index: 1
        NinjaArray[2] = "Sakura"; // index: 2

        /*
        * Listas
        * Listas nao sao estaticas, elas podem aumentar e diminuir
        * */
        List<String> NinjaList = new ArrayList<>();
        NinjaList.add("Naruto");
        NinjaList.add("Sasuke");
        NinjaList.add("Tobirama");
        NinjaList.add("Kakashi");

        // Adcionar na lista
        NinjaList.add("Sakura");

        System.out.println("NinjaList" + NinjaList);

        // Remover da Lista
        NinjaList.remove("Sasuke");
        System.out.println("NinjaList" + NinjaList);

        //T Trocar elementos
        NinjaList.set(0, "Kakashi");
        System.out.println("NinjaList" + NinjaList);

        // Ver o tamanho da lista
        System.out.println("Tamanho Lista = " + NinjaList.size() + " Elementos");



    }
}
