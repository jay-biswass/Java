package ArrayProblemSolving;

public class FindMaximum {

    static int findMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
            max = Math.max(max, arr[i]);

        }
        return max;
    }

    static void main(String[] args) {
        int[] arr = {33, 12, 15, 44, 99, 9, 3};
        int ans = findMax(arr);
        System.out.println(ans);
    }
}
