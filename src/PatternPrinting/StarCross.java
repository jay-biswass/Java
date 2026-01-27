package PatternPrinting;
import java.util.Scanner;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j || (i+j)==m+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
