package Conditionals;
import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price of the item: ");
        int c = sc.nextInt();

        System.out.print("Enter the selling price of the item: ");
        int s = sc.nextInt();

        if (c<s){
            System.out.println("The Seller made a profit.");
            System.out.println("The profit is "+(s-c));
        }
        else {
            System.out.println("The Seller made a loss.");
            System.out.println("The loss is "+(c-s));
        }
    }
}
