package ArrayProblemSolving;

public class BinarySearch {
    static int BinarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end) / 2;    //OR mid = start + (end - start)/2
        while (start <= end) {
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;     //OR mid = start + (end - start)/2

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 11, 15, 19, 23, 27};
        int target = 11;

        int result = BinarySearch(arr, target);

        System.out.println("Target found: " + result);
    }
}
