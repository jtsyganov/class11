package class11;

import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 67},
                {77, 75, 38, 83, 56}};
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println(matrix[0][i]);
        }
        int[] arr = matrix[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < matrix[2].length; i++) {
            System.out.println(matrix[2][i]);
        }

    }

}

