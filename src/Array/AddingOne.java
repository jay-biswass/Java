package Array;

public class AddingOne {
        public static void main(String[] args) {

            int[] arr = {2, 4, 6, 8, 10};

            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + 1;
            }

            // Print updated array
            for(int num : arr) {
                System.out.print(num + " ");
            }
        }
    }