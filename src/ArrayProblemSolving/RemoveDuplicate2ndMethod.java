package ArrayProblemSolving;

public class RemoveDuplicate2ndMethod {
    static int RemoveDuplicate2ndMethod(int[] arr) {
        int i = 0;
        int j = 1;
        int n = arr.length;
        while (j < i) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i + 1;
    }

    static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 3, 3, 4, 5, 5, 6, 6};
        int ans = RemoveDuplicate2ndMethod(arr);
        System.out.println(ans);
    }
}
