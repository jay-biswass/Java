package Recursion;

public class PrintArray {
    static void printArray(int[] arr, int i){

        int n = arr.length;

        if(i>=n){
            return;
        }
        System.out.println(arr[i]);

        printArray(arr,i+1);
    }

    static void main(String[] args) {
        int i = 0;
        int[] arr = {1,2,3,4,5,6};
        printArray(arr, i);
    }
}
