package Array;
public class DuplicateRemove {
        public static int removeDuplicates(int[] arr) {
            if (arr.length == 0) return 0;
            int slow = 0;
            for (int fast = 1; fast < arr.length; fast++) {
                if (arr[fast] != arr[slow]) {
                    slow++;
                    arr[slow] = arr[fast];
                }
            }
            return slow + 1;
        }

        public static void main(String[] args) {
            int[] arr = {1,1,2,2,2,3,4,4,5};
            int k = removeDuplicates(arr);
            System.out.println("Unique count: " + k);
            System.out.print("Array after removing duplicates: ");
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }