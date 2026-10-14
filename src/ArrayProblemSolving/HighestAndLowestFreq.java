package ArrayProblemSolving;

import java.util.HashMap;

public class HighestAndLowestFreq {
    static int[] HighestAndLowestFreq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentFreq = freq.get(key);
            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum, lowestNum};
        return ans;
    }


    static void HiLo(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int val: arr){
            freq.put(val, freq.getOrDefault(val,0)+1);
        }
        int HighestFreq = Integer.MIN_VALUE;
        int HighestNum = -1;
        for(int key : freq.keySet()){

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,5,5};
        int[] ans = HighestAndLowestFreq(arr);
        System.out.println("Highest freq no: "+ans[0]);
        System.out.println("Lowest freq no: "+ans[1]);
    }
}
