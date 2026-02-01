package Array;

import java.util.Scanner;

public class IOarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ther size: ");
        int n = sc.nextInt();
        int[] jay = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++) {
            jay[i] = sc.nextInt();
        }

        System.out.print("Array ka double: ");
            for(int i=0; i<n; i++){
            System.out.print("Double: "+2* jay[i]+" ");
                System.out.println("Negative: "+-1*jay[i]+" ");
        }
       }
    }
