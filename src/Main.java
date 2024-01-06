import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][][] array = {
                {
                        {1, 2, 3},
                        {7, 8, 1}
                },
                {
                        {5, 6, 7}
                },
                {
                        {7, 5, 3},
                        {2, 3, 1}
                }
        };
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println(array[i][j][k]+=num);
                }
            }
        }
    }
}

