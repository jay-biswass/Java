package OOPs.Abstraction;

abstract class Bird {
    abstract void fly();

    abstract void eat();

}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow Flying...");
    }

    @Override
    void eat() {
        System.out.println("Sparrow Eating...");
    }
}

class Crow extends Bird {
    @Override
    void fly() {
        System.out.println("Crow Flying...");
    }

    @Override
    void eat() {
        System.out.println("Crow Eating...");
    }
}

public class Main {
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.fly();
        b.eat();

        b = new Crow();
        b.fly();
        b.eat();
    }
}
