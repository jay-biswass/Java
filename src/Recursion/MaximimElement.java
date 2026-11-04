package Recursion;

public class MaximimElement {
    static void findMaximum(int[] arr, int i, int maxi) {

        if (i >= arr.length) {
        System.out.println(maxi);
            return;
        }

        if (arr[i] > maxi) {
            maxi = arr[i];
        }
        findMaximum(arr, i+1, maxi);
    }

    static void main(String[] args) {
        int i = 0;
        int maxi = Integer.MIN_VALUE;
        int[] arr = {1, 2, 3, 4, 5, 6};
        findMaximum(arr, i, maxi);
    }
}