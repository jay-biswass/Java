package ArrayProblemSolving;

import java.util.*;

public class ColumnSum {
    static List<Integer> columnSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
                int value = matrix[row][col];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }

    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ColumnSum solution = new ColumnSum();
        List<Integer> list = solution.columnSum(arr);
        System.out.println(list);

    }

}
