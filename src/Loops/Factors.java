package Loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int hf=1;
        System.out.print("Factors of "+n+": ");
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
                hf=i;
            }

        }
        System.out.println("\nThe highest factor is: "+hf);
    }
}
