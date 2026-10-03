package String;

import java.util.Scanner;

public class Entering_New {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String str = sc.nextLine();
        System.out.println("My name is "+str);

    }
}
