package Array;
import java.util.Arrays;
public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, -3, 10, 2, -1, 9, 11};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}