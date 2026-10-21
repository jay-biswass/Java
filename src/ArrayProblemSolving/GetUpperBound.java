package ArrayProblemSolving;

public class GetUpperBound {
    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= target){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid-1;
            }
        }
            return ans;
    }
    static void main(String[] args) {
        int[] arr = {3, 7, 11, 15, 15, 15, 15, 15, 19, 23, 27};
        int target = 21;

        int result = getUpperBound(arr, target);

        System.out.println("Upper bound found: " + result);
    }
}
