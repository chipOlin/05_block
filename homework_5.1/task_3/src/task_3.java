public class task_3 {
    public static void main(String[] args) {
        /*
         *  Двумерный массив
         *  выводится в виде креста и "Х"
         */
        /*byte depthArray = 7;
        String[][] arrayX = new String[depthArray][depthArray];

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
        }*/

        /*
         *  Транспонированная матрица
         */

        //array example 1
        byte depthArrayX = 3;
        byte depthArrayY = 3;
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        /*//array example 2
        byte depthArrayX = 3;
        byte depthArrayY = 2;
        int[][] a = {{1, 2}, {3, 4}, {5, 6}};*/

        /*// array example 3
        byte depthArrayX = 2;
        byte depthArrayY = 3;
        int[][] a = {{1, 2, 3}, {4, 5, 6}};*/

        System.out.println("Before");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }

        if (depthArrayX == depthArrayY){
            for (int i = 0; i < depthArrayX; i++) {
                for (int j = i + 1; j < depthArrayX; j++) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        } else {
            int[][] b = new int[depthArrayY][depthArrayX];
            for (int i = 0; i < depthArrayX; i++) {
                for (int j = 0; j < depthArrayY; j++) {
                    b[j][i] = a[i][j];
                }
            }
            a = b;
        }

        System.out.println("After");
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
