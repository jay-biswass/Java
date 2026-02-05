package Array;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
//        System.out.print("\nMaximum element: ");
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
                if (arr[i] > max) max = arr[i];
            }
        for (int i= 0; i<n; i++){
            if (arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("Maximum element: "+max);
        System.out.print("Second Maximum element: "+smax);
    }
}