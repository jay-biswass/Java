package String;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s="";
        System.out.println(s+n);

        String t = Integer.toString(n);
        System.out.println(t);
    }
}
