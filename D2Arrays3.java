package class11;

public class D2Arrays3 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 67},
                {77, 75, 38, 83, 56}};

        for (int[] arr : matrix) {
            for (int number : arr) {
                System.out.print(number + " ");
            }
            System.out.println();

        }
    }
}

