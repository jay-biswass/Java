package ArrayProblemSolving;

public class ShiftByOnePosition {
    static void shiftByOne(int[] arr) {
        int n = arr.length;
        int j = n - 1;
        int temp = arr[j];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        for (int val : arr) {
            System.out.println(val);
        }
    }

    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        shiftByOne(arr);
    }
}
