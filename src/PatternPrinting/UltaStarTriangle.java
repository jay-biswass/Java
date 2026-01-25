package PatternPrinting;
import java.util.Scanner;
public class UltaStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m+1-i; j++) {
//                System.out.print("* ");   //for star
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
