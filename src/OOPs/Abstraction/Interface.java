package OOPs.Abstraction;

interface Birds {
    void fly();

    void eat();
}


 class Sparrows implements Birds{

    @Override
    public void fly() {
        System.out.println("Sparrow Flying...");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow Eating...");
    }
}

class Crows implements Birds{

    @Override
    public void fly() {
        System.out.println("Crows Flying...");
    }

    @Override
    public void eat() {
        System.out.println("Crows Eating...");
    }
}


public class Interface {

    public static void doBirdStuff(Birds b){
        b.fly();
        b.eat();
    }

    public static void main(String[] args) {
        doBirdStuff(new Sparrows());
        doBirdStuff(new Crows());
    }
}
