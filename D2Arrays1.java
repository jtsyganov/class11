package class11;

import java.util.Arrays;

public class D2Arrays1 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 67},
                {77, 75, 38, 83, 56}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}

