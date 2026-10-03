package Methods;

import java.util.Scanner;

public class Practice {

    Scanner sc = new Scanner (System.in);
    static void dokatable(int n) {
        for (int i = 1; i <= 10; i++) {
            int table = n * i;
            System.out.println("->" + table);

        }
    }

    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    static void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum: " + sum);
    }

    static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    static void IsEven(int n){

        if (n%2==0){
            System.out.println("Even number.");
        }
        else {
            System.out.println("Odd number.");
        }
    }

    static void max(int a, int b){
        if (a>b){
            System.out.println("The maximum number is: "+ a);
        }
        else{
            System.out.println("The maximum number is: "+b);
        }
    }

    static void percentage(float obt, float tot){
        float per = (obt/tot)*100;
        System.out.println("The percentage is: "+per+"%");
    }

    static void display(int a){
        System.out.println(a);
    }

    static void display(String name){
        System.out.println(name);
    }

    static void updatevalue(int x){
        System.out.println(x);
    }

    static void main() {
//        dokatable(6 );
//        add(3,7);
//        add(3,7,10);
//        welcome("Jay");
//        IsEven(21);
//        max(14,91);
//        percentage(367,500);
//        display("Biswas");
//        display(61);
        updatevalue(77);

        int x= 99;
        System.out.println(x);



    }
}
