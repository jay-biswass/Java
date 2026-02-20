package OOPs;

public class PassingClassesToMethod {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){
            System.out.println(seats+" seater "+name+" "+length+"m "+torque+"nm ");
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Kia Seltos";
        c.seats = 5;
        c.length = 4.99;
        c.type = "XUV";
        c.torque = 199;

        change(c);

        System.out.println(c.seats);
        c.print();
    }

    private static void change(Car c) {
        c.seats = 7;
    }

}
