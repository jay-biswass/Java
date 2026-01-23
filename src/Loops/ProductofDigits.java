package Loops;

import java.util.Scanner;

public class ProductofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int prod = 1;
        while(n!=0){
            int ld =n%10;
            if (ld != 0) {   // ignore 0
                prod *= ld;
            }
                n/=10;
        }
        System.out.println(prod);
    }
}
