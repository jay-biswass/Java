package Conditionals;
import java.util.Scanner;
public class AreaPerimeterCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l= sc.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int b= sc.nextInt();

        int a=l*b;
        int p=2*(l+b);
        System.out.println("The area is: "+a);
        System.out.println("The perimeter is: "+p);

        if (a>p){
            System.out.println("Area is greater.");
        }

        else if (a==p) {
            System.out.println("Both are equal.");
            }

        else {
            System.out.println("Perimeter is greater.");
        }
    }
}
