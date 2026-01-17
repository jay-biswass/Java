package JavaInput;
import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int sqr = a*a;
        System.out.print("The Square of "+a+" is: " +sqr);
//        System.out.print( " is:" +sqr);

    }
}
