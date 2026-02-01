package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int prod=1;
        System.out.print("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            prod *= arr[i];
        }
        System.out.print("The product of array is: "+prod);
    }
}
