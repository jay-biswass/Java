package ArrayProblemSolving;

public class FindTheUnsorted {
    static int FindTheUnsorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];

            }
        }
        return 0;
    }

    static void main(String[] args) {
        int[] arr = {2, 3, 9, 15, 20, 19, 26, 98};
        int ans = FindTheUnsorted(arr);
        System.out.println("Unsorted Element: " + ans);
    }
}
