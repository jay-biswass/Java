package Loops;

import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        for (int i=1; i<=2*n-1; i+=2){                      //n th term = a + (n-1) * d
            System.out.print(i+" ");


//    Que. 4, 7, 10, 13, 16... (Better Code)
//            int a = 4, d=3;
//            for (int j = 1; j <=n; j++){
//                System.out.println(a);
//                a += d;
            }
        }
    }

