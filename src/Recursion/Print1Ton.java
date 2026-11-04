package Recursion;

public class Print1Ton {
    static void NToOne(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        NToOne(n-1);
    }

    static void oneToN(int n, int count){

        if(count>n){
            return;
        }
        System.out.println(count);
        count ++;

        oneToN(n,count);
    }

    static void main(String[] args) {
//        NToOne(10);
        oneToN(10,1);
    }
}
