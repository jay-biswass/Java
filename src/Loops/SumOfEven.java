package Loops;
import java.util.Scanner;
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            if (n%2==0) {
                sum += ld;
            }
            n /= 10;
        }
        System.out.println(sum);
    }
}
