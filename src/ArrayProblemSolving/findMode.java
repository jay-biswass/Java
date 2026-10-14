package ArrayProblemSolving;

import java.util.HashMap;

public class findMode {
    static int findMode(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
//        for(int i : freq.keySet()) {
//            System.out.println(i + " -> " + freq.get(i));
//        }

        int maxFreq = -1;
        int maxFreqKey = -1;


        for(int key: freq.keySet()){
            int currentKey = key;
            int currentKeyFrequency = freq.get(key);
            if(currentKeyFrequency > maxFreq){
                maxFreq = currentKeyFrequency;
                maxFreqKey = currentKey;
            }
        }
        return maxFreqKey;
    }

    static void main(String[] args) {
        int arr[] ={1,2,2,3,3,3,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,3,6,6,6};
//        findMode(arr);
        int ans = findMode(arr);
        System.out.println(ans);
    }
}
