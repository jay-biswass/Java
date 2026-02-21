package OOPs;

public class Constructors {
    public static class Car {
        String name;
        int price;

        Car(){                               //Default Constructor

        }

        Car(int x, String s){     //Parameterized Constructor
            name = s;
            price = x;
        }

        Car(String s, int x){
            name = s;
            price = x;
        }

        void print(){
            System.out.println(name+" "+price);
        }
    }
        public static void main(String[] args) {
        Car c1 = new Car(1500000,"Kia Sonet");
        c1.print();

        Car c2 = new Car("Lord Alto", 400000);
        c2.print();
    }
}
