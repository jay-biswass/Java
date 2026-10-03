package String;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        String s="";
        System.out.println(s+n+1);

        String t = Integer.toString(n);
        System.out.println(t+1);
    }
}
