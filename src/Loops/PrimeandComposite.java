//package Loops;
//import java.util.Scanner;
//public class PrimeandComposite {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        for(int i=2; i<n; i++){
//            if (n%i==0){
//                System.out.println("Composite number");
//            }
//            else{
//                System.out.println("Prime number");
//            }
//            break;
//        }
//    }
//}
//
//
package Loops;
import java.util.Scanner;
public class PrimeandComposite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean flag = false;           //false means prime
        for(int i=2; i<n; i++){
            if (n%i==0){
                flag = true;            //true means composite
                break;
            }
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
        else if (flag == false){
            System.out.println("Prime number");
        }
        else{
            System.out.println(("Composite number"));
        }
    }
}
