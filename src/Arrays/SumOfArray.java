package Arrays;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.print("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i]= sc.nextInt();
            sum += arr[i];
        }
        System.out.print("The sum of array is: "+sum);
    }
}
