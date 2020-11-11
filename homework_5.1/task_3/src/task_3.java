public class task_3 {
    public static void main(String[] args) {
        byte depthArray = 7;
        String[][] arrayX = new String[depthArray][depthArray];

        /*
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        */

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
