package ArrayProblemSolving;

public class rowAndMaximumOnes {
    static int[] rowAndMaximumOnes(int[][] mat) {
        int totalRow = mat.length;
        int totalCol = mat[0].length;

        int maxRow=0;
        int maxOnes=-1;

        for (int i = 0; i < totalRow; i++) {
        int count = 0;
            for (int j = 0; j < totalCol; j++) {
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count>maxOnes){
                maxOnes = count;
                maxRow = i;
            }
        }
        return new int[]{maxRow, maxOnes};
    }

    static void main() {
        int [][] mat = {
                {0,0,1},
                {1,1,0}
        };

        int[] ans = rowAndMaximumOnes(mat);

        System.out.println("Row = " + ans[0]);
        System.out.println("MaxOnes = " + ans[1]);

    }
}
