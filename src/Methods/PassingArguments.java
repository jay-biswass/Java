package Methods;

public class PassingArguments {
    public static void greet(String name) {
        System.out.println("Good Morning..."+name);
    }

    public static void sum(int a, int b, int c){
        System.out.println("Sum is: "+(a+b+c));
    }

    public static void main(String[] args) {
        greet("Modi");

        sum(70,-17, 44);
    }
}