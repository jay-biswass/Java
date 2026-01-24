package PatternPrinting;
import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        for(int i=1; i<=m; i++){
            for (int j=1; j<=m; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
