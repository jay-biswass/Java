package OOPs;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Pikachu {
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello World");
        }
    }

//    Method Overloading

    static int add(int a,int b){
        return (a+b);
    }

    static int add(int a,int b, int c){
        return (a+b+c);
    }

    public static void main(String[] args) {
        Human h = new Human();
        Pikachu p = new Pikachu();
        Dog d = new Dog();
        Cat c = new Cat();

        h.speak();
        c.speak();
        d.speak();
        p.speak();

        System.out.println("sum="+add(2,3));
        System.out.println("sum="+add(2,3,5));

    }
}
