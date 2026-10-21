package ArrayProblemSolving;

public class TotalNumberOfOccurence {
    static int getLowerBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] >= target){
                ans = mid;
                end = mid -1 ;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static int getUpperBound(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] <= target){
                start = mid + 1 ;
            }
            else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int countOccurencee(int[] arr, int target){
        int lbIndex = getLowerBound(arr,target);
        int ubIndex = getUpperBound(arr,target);
        int ans = ubIndex-lbIndex;
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {3, 7, 11, 15, 15, 15, 15, 15, 19, 23, 27};
        int target = 15;

        int result = countOccurencee(arr, target);

        System.out.println("Occurence: " + result);
    }
}
