package Loops;
import java.util.Scanner;
public class AsciiValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=65;
        while(n<=90){
            System.out.println(n+"="+(char)n);
            n++;
        }
    }
}
