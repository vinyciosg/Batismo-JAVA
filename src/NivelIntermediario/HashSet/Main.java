package NivelIntermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        System.out.println(ninjas);

        Set<String> NinjasSet = new HashSet<>();

        NinjasSet.addAll(ninjas);
        System.out.println(NinjasSet);

        Set<String> aldeias = new HashSet<>();
    }
}
