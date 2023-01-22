package class11;

public class D2Arrays2 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 67},
                {77, 75, 38, 83, 56}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}

