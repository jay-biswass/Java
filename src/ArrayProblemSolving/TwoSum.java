package ArrayProblemSolving;

public class TwoSum {
    static int[] TwoSum (int[] arr, int target){
        int n = arr.length;
        int[] ans = {};
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target)
                     ans = new int[]{arr[i], arr[j]};
            }
                    return ans;
        }
        return arr;
    }

    static void main(String[] args) {
        int arr[] = {6,2,3,1,5,4,8,7};
        int target = 5;
        int[] ans = TwoSum(arr,target);
        for (int val:ans){
            System.out.println(val);
        }
    }
}
