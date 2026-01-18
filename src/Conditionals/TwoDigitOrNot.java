package Conditionals;
import java.util.Scanner;
public class TwoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.out.println(n+" is a two digit number.");
        }
        else{
            System.out.println(n+" is not a two digit number.");
        }
    }
}
