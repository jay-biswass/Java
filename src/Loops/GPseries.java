package Loops;

import java.util.Scanner;

public class GPseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int a=1, r=2;
        for (int i=1; i<=n; i++){
            System.out.print(a+" ");
            a=a*r;
        }

    }
}
