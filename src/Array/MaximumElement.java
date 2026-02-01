package Array;
import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            System.out.print (arr[i]+" ");
        }
        System.out.print("\nMaximum element: ");
        int max = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]> max) max = arr[i];
        }
        System.out.print(max);

        System.out.print("\nMinimum element: ");
        int min = arr[0];
        for (int i=0; i<n; i++){
            if (arr[i]< min) min = arr[i];
        }
        System.out.print(min);
    }
}
