
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        String[][] chees = new String[8][8];
        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chees[i][j] = "W";
                } else chees[i][j] = "B";
                System.out.print(chees [i][j]);
            }
            System.out.println();
        }
    }
}



