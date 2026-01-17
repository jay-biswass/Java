package JavaInput;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        int radius = sc.nextInt();
        double pi = 3.1415;
        double a = radius * radius * pi;
        System.out.println("The area of the circle is "+a);

    }
}
