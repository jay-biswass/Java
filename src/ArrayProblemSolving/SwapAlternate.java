package ArrayProblemSolving;

import java.util.Arrays;

public class SwapAlternate {
    static int[] SwapAlternate(int[] arr) {

        for (int i = 0; i < arr.length; i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    static void main(String[] args) {
        int[] arr = {2, 3, 9, 15, 20, 19, 26, 98};
        int[] ans = SwapAlternate(arr);
        System.out.println(Arrays.toString(ans));
    }

}

