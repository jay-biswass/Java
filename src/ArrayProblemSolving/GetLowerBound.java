package ArrayProblemSolving;

public class GetLowerBound {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {3, 7, 11, 15, 15, 15, 15, 15, 19, 23, 27};
        int target = 18;

        int result = getLowerBound(arr, target);

        System.out.println("Lower bound found: " + result);
    }
}