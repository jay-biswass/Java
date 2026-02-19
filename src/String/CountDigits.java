package String;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println("The number of digits are: "+s.length());
    }
}
