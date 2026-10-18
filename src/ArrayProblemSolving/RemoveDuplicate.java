package ArrayProblemSolving;

import java.util.HashMap;

public class RemoveDuplicate {
    static int RemoveDuplicate(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int val : arr) {
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        return freq.size();
    }

    static void main(String[] args) {
        int arr[] = {1,2,2,2,2,3,3,3,4,5,5,5,5,5,5,5,5,6,6,};
        int ans = RemoveDuplicate(arr);
        System.out.println(ans);
    }
}
