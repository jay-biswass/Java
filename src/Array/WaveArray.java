package Array;
import java.util.*;
public class WaveArray {
        public static void sortInWave(int arr[]) {
            for (int i = 0; i < arr.length; i += 2) {
                if (i == arr.length - 1) break;
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sortInWave(arr);
            System.out.print("Wave sorted array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

