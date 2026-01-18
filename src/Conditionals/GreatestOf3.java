package Conditionals;
import java.util.Scanner;
public class GreatestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();
        System.out.print("Enter the third number: ");
        int z = sc.nextInt();

        if(x>y && x>z){
            System.out.println(x+" is greatest.");
        } else if (y>x && y>z) {
            System.out.println(y+" is greatest.");
        }
        else {
            System.out.println(z+" is greatest.");

        }
    }
}
