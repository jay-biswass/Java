package PatternPrinting;
import java.util.Scanner;
public class StarPlusjava {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter rows: ");
    int m = sc.nextInt();
    for (int i = 1; i <=m; i++) {
        for (int j = 1; j <=m; j++) {
            if(j==(m/2)+1 || i==(m/2)+1) System.out.print(" *");
            else System.out.print("  ");
        }
        System.out.println();
    }
}
}
