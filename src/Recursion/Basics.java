package Recursion;

public class Basics {
    public static void printHello(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Hello");
        printHello(n - 1);
    }

    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int powerOfTwo(int n){
        if(n==0){
            return 1;
        }
        return 2 * powerOfTwo(n-1);
    }

    static void main(String[] args) {
//        printHello(5);
//        int ans = factorial(5);
//        System.out.println(ans);
        int anss = powerOfTwo(5);
        System.out.println(anss);
    }
}
