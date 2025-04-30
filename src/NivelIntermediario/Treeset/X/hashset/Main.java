package NivelIntermediario.Treeset.X.hashset;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        ninjas.add("Sakura");
        ninjas.add("Naruto");
        ninjas.add("Danzo");
        ninjas.add("Boruto");

        Set<String> NinjasSet = new TreeSet<>();

        NinjasSet.addAll(ninjas);
        System.out.println(NinjasSet);



    }
}
