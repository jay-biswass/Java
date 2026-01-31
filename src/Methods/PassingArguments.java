package Methods;

public class PassingArguments {
    public static void greet(String name) {
        System.out.println("Namaste..."+name);
    }

    public static void sum(int a, int b, int c){
        System.out.println("Sum is: "+(a+b+c));
    }

    public static void intro(String name, int age){
        System.out.println("Hello! My name is "+name+" and my age is "+age);
    }

    public static void main(String[] args) {
        greet("Modi");

        sum(70,-17, 44);

        intro("Jay", 21);
        intro("Tannu", 18);
        intro("Babloo", 29);
    }
}