package Array;

public class MissingInArray {


    static int missingNum(int[] arr) {
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;

        long arrSum = 0;
        for (int ele : arr) {
            arrSum += ele;
        }

        return (int) (sum - arrSum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        System.out.println("Missing Number: " + missingNum(arr));
    }
}
