package ArrayProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class FindMissingWithDuplicates {
    static List<Integer> FindMissingWithDuplicates(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            int value = Math.abs(arr[i]);
            int position = value-1;

            if(arr[position] > 0){
                arr[position] = -arr[position];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                int valueAtThisIndex = i+1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {1,4,3,5,2,2,6,8,8,7,9};
        List<Integer> miss_ele = FindMissingWithDuplicates(arr);
        for(int val:miss_ele){
            System.out.print(val+" ");
        }
    }
}
