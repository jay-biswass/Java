package OOPs;

public class Inheritance3 {
    public static void main() {
        Carr c = new Carr("Maruti", "800", 4,5,"Automatic");
        c.startEngine();
        c.startAC();
        c.stopEngine();

        MotorCyclee m = new MotorCyclee("Splendor", "XL100",2,"Straight","Soft");
        m.startEngine();
        m.wheelie();
        m.stopEngine();

    }
}
