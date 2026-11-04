package Recursion;

public class PrintDigits {
    static void printDigits(int n){

        if (n==0){
            return;
        }
        int lastDigit = n%10;
        n = n/10;

        printDigits(n);
        System.out.println(lastDigit);
    }

    static void main(String[] args) {
        int n = 137;
        printDigits(n);
    }

}

