package ArrayProblemSolving;

public class MaximumSubArray_KADANEsALGO {
    static int MaximumSubArray(int[] arr){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            maxi = Math.max(maxi,sum);
            if(sum<0)
                sum = 0;
        }
        return maxi;
    }

    static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = MaximumSubArray(arr);
        System.out.println(ans);
    }
}
