package JavaInput;
import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int a;
        a = sc.nextInt();

        System.out.print("Enter the second number:");
        int b;
        b = sc.nextInt();

        int sum=a+b;
        System.out.println("The sum is: "+sum);
    }
}
