package Array;

public class ArraysBasics {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7};
        //Printing index
        System.out.println(x[2]);
        //updating element
        x[2] = 69;
        System.out.println(x[2]);
        //size of array
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println(arr[3]);
    }
}
