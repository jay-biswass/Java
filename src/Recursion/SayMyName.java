package Recursion;

public class SayMyName {
    static void sayMyName(int n){
        if(n==0){
            return;
        }
        System.out.println("Jay");
        sayMyName(n-1);
    }

    static void main() {
        sayMyName(5);
    }
}
