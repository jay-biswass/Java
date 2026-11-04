package Recursion;

public class CountElement {
    static void countElement(int[] arr, int i, int target, int count) {
        if (i >= arr.length) {
            System.out.println(count);
            return;
        }
        if (arr[i] == target) {
            count++;
        }
        countElement(arr, i + 1, target, count);
    }

    static void main(String[] args) {
        int i = 0;
        int count = 0;
        int[] arr = {10, 20, 30, 40, 10, 60, 10};
        int target = 10;
        countElement(arr, i, target, count);
    }
}
