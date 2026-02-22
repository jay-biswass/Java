package OOPs;
class Cricketer{
    final String country = "NZ";
    String name;
    int runs;
    double avg;
}
public class FInalAndStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
//       c1.country = "England";
        System.out.println(c1.country);
//        c1.country = "India";
        Cricketer c2 = new Cricketer();
        System.out.println(c2.country);
    }
}
