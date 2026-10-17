package ArrayProblemSolving;

public class ThreeSum {
    static int[] ThreeSum(int[] arr, int target) {
        int n = arr.length;
        int[] ans = {};
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = i + 2; k < n ; k++) {
                    if (target == arr[i] + arr[j] + arr[k]) {
                        ans = new int[]{arr[i], arr[j], arr[k]};
                    }
                }
            }
                    return ans;
        }
        return ans;
    }

    static void main(String[] args) {
        int arr[] = {6, 2, 3, 1, 5, 4, 8, 7};
        int target = 16;
        int[] ans = ThreeSum(arr, target);
        for (int val : ans) {
            System.out.println(val);
        }
    }
}
