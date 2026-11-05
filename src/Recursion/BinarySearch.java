package Recursion;

public class BinarySearch {
    static int solution(int[] arr, int s, int e, int target ){
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            e = mid - 1;
        }
        else if (arr[mid] < target) {
            s = mid + 1;
        }
        return solution(arr,s,e,target);
    }

    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        return solution(arr,s,e,target);
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}
