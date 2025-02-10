package Arrays;

public class Array2 {

    public static void main(String[] args) {

        String [] [] ninjasEaldeias = new String[3][3];

        ninjasEaldeias [0] [0] = "Konaha";
        ninjasEaldeias [0] [1] = "Naruto";
        ninjasEaldeias [0] [2] = "Saske";

        ninjasEaldeias [1] [0] = "Nevoa";
        ninjasEaldeias [1] [1] = "Zabuza";
        ninjasEaldeias [1] [2] = "Sasuke Uchia";

        ninjasEaldeias [2] [0] = "Konaha";
        ninjasEaldeias [2] [1] = "Naruto";
        ninjasEaldeias [2] [2] = "temari";

        for (int i = 0; i < ninjasEaldeias.length; i++) {
            System.out.println("\nAldeia: " + ninjasEaldeias[i][0]);
            for (int j = 1; j < ninjasEaldeias[i].length; j++){
                System.out.println("Ninja: " + ninjasEaldeias[i][j]);
            }
        }


    }
}
