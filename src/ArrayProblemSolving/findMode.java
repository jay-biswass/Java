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


    // ________PRRACTICE____________
//    static void maxFreq(int[] arr){
//        HashMap<Integer,Integer> maxi = new HashMap<>();
//
//        for(int num:arr){
//            maxi.put(num, maxi.getOrDefault(num , 0) +1);
//        }
//        int ans = -1;
//        int maxFreq = -1;
//
//        for (int key: maxi.keySet()){
//            int currKey = key;
//            int currKeyFreq = maxi.get(key);
//            if (currKeyFreq>maxFreq){
//                maxFreq = currKeyFreq;
//                ans = currKey;
//            }
//        }
//        System.out.println(ans);
//    }




    static void main(String[] args) {
        int arr[] ={1,2,2,3,3,3,4,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,5,5,3,6,6,6};
        findMode(arr);
        int ans = findMode(arr);
        System.out.println(ans);



//        int[] bro = {1,2,3,7,1,3,5,9,7,8,9,5,1,1,1,2,2,3,6,9,9,4,9,9,9,9};
//        maxFreq(bro);
    }
}
