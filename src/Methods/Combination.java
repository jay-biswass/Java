package Methods;

import java.util.Scanner;
public class Combination {

public static int fact(int x){
    int xFact = 1;
    for (int i=1; i<=x; i++){
        xFact *= i;
    }
    return xFact;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int r = sc.nextInt();
        int nFact = fact(n);
        int rFact = fact(r);
        int n_rfact = fact(n-r);

        int ncr = nFact/(rFact* n_rfact);
        System.out.println("ncr= "+ncr);
        int npr = fact(n)/fact(n-r);
        System.out.println("npr = " +npr);
    }
}
