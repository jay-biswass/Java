package Loops;

import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i=1; i<=2*n-1; i+=2){
            System.out.print(i+" ");

//            if (i%2==1){
//                System.out.println(i);
//            }
        }

    }
}
