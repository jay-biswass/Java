package Conditionals;

import java.util.Scanner;

public class Nested3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%5==0){
            if(n%3==0){
                System.out.println(n+" is divisible by both 3 and 5.");
            }
            else{
                System.out.println(n+" is NOT divisible by 3 but divisible by 5.");
            }
        } else if (n%3==0){
            System.out.println(n+" is divisible by 3 NOT 5.");
        }

        else {
            System.out.println(n+" is NOT divisible by 5.");
        }
    }
}
