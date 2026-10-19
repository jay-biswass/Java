package ArrayProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class RowSum {
    public List<Integer> rowSum(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int value = arr[i][j];
                sum = sum + value;
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

        RowSum solution = new RowSum();
        List<Integer> list = solution.rowSum(arr);
        System.out.println(list);

    }
}
