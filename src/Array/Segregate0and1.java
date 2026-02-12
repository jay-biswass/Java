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

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && arr[left] == 0) {
                left++;
            }

            while (left < right && arr[right] == 1) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
