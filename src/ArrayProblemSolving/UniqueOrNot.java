package ArrayProblemSolving;

import java.util.HashMap;

public class UniqueOrNot {

    static boolean UniqueNumber(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int uniqueCount = 0;

        for (int count : freq.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        return uniqueCount == 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 1, 4, 5, 4, 6, 2};

        boolean ans = UniqueNumber(arr);
        System.out.println(ans);
    }
}

