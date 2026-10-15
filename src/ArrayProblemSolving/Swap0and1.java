package ArrayProblemSolving;

public class Swap0and1 {
    static int[] Swap0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
//                int temp = arr[i];
                arr[i] = 0;
                arr[j] = 1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }

    static void main() {
        int[] arr = {1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1};
        Swap0and1(arr);
        for (int ans : arr) {
            System.out.print(" "+ans);
        }
    }
}
