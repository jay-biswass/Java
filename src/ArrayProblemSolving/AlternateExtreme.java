package ArrayProblemSolving;

public class AlternateExtreme {
    static void AlternateExtreme(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            System.out.println(arr[left] + " " + arr[right]);

            left++;
            right--;
        }

        // Print the middle element if the array has odd length
        if (left == right) {
            System.out.println(arr[left]);
        }
    }

    static void main(String[] args) {
        int[] arr = {2, 3, 9, 15, 20, 19, 26, 98};
        AlternateExtreme(arr);
    }
}

