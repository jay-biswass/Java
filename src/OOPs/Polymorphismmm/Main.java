package OOPs.Polymorphismmm;

public class Main {
    static void main() {

        Shape s = new Shape();
        doDrawingStuff(s);
//        s.draw();

        Circle c = new Circle();
        doDrawingStuff(c);
//        c.draw();

        Rectangle r = new Rectangle();
        doDrawingStuff(r);
//        r.draw();

    }

    public static void doDrawingStuff(Shape s) {
        s.draw();
    }
}
