package Conditionals;

import java.util.Scanner;

public class Nested3or5not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println(n+" is divisible by 3 or 5 but not 15.");
            }
            else{
                System.out.println(n+" is divisible by 15.");
            }
        }
        else {
            System.out.println(n+" is NOT divisible by 5 or 3.");
        }
    }

}
