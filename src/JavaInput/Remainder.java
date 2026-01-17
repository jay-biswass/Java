package JavaInput;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the dividend : ");
        int a = sc.nextInt();

        System.out.println("Enter the divisor : ");
        int b = sc.nextInt();

        int r = a%b;
        System.out.println("The remainder is: "+r);
    }
}
