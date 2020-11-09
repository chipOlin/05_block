import java.lang.reflect.Array;
import java.util.Arrays;

public class task_3 {
    public static void main(String[] args) {
        String[][] arrayX = new String[5][5];
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX[i].length; j++) {
                if (i == j || (((arrayX[i].length - 1) - i) == j)) {
                    arrayX[i][j] = "X";
                } else {
                    arrayX[i][j] = " ";
                }
            }
        }
        for (String[] i : arrayX) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
