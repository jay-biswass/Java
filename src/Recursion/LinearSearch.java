package Recursion;

public class LinearSearch {
    static int linearSearch(int[] arr, int i, int target) {

        if (i >= arr.length) {
            return -1;
        }

        if (arr[i] == target) {
            return i;
        }
        return linearSearch(arr, i + 1, target);
    }

    static void main(String[] args) {
        int i = 0;
        int[] arr = {10,20,30,40,50,60,70};
        int target = 60;
        int ans = linearSearch(arr,i,target);
        System.out.println("Found at index: "+ans);
    }
}