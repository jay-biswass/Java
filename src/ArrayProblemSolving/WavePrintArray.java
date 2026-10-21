package ArrayProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class WavePrintArray {
    public List<Integer> wavePrintMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int value = 0;
        List<Integer> result = new ArrayList<>();

        for (int col = 0; col < n; col++) {
            if ((col & 1)==1){
                for (int row = m-1; row >= 0; row--) {
                    value = matrix[row][col];
                    result.add(value);
                }
            }
            else {
                for (int row = 0; row < m; row++) {
                    value = matrix[row][col];
                    result.add(value);
                }
            }

        }
        return result;
    }

    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        WavePrintArray solution = new WavePrintArray();
        List<Integer> list = solution.wavePrintMatrix(matrix);
        System.out.println(list);
    }
}