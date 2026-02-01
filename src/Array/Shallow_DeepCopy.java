package Array;

import java.util.Arrays;

public class Shallow_DeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //Shallow Copy
//        int[] x = arr;
//        x[0] = 100;
//        System.out.println(arr[0]);


        //Deep copy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0]=100;
        System.out.println(y[0]);
        System.out.println(arr[0]);

    }
}
