package Array;

public class Segregate0and1 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,1,1,0,1,0,0,1,0,0,1};
        segregate0and1(arr);
        System.out.print("Sorted array: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    static void segregate0and1(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && arr[i] == 0) {
                i++;
            }
            while (i < j && arr[j] == 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}