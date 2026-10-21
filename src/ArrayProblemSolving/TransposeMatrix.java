package ArrayProblemSolving;

import java.util.Arrays;

public class TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        int totalRrows = matrix.length;
        int totalCols = matrix[0].length;
        int newRows = totalCols;
        int newCols = totalRrows;
        int[][] ans = new int[newRows][newCols];
        for (int i = 0; i < totalRrows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

//    static int[][] transpose(int[][] matrix) {
//
//        int n = matrix.length;
//        int m = matrix[0].length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//        return matrix;
//    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] ans = transpose(matrix);
        System.out.println("Original Matrix:");
        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Transposed Matrix:");
        System.out.println(Arrays.deepToString(ans));
    }
}
