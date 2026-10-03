package String;

public class Comparison {
    public static void main(String[] args) {
        String a = "Jay";
//        String b = "Jay";
        String b = new String("JaY");


//        System.out.println(a.charAt(1));
//        System.out.println(a.length());
//
//        System.out.println(b.length());
//        System.out.println(b.charAt(3));


//________Refers to the reference address_________________
//        if (a==b){
//            System.out.println("Both strings are equal.");
//        }
//        else {
//            System.out.println("Both strings are not equal");
//        }


//________Refers to the actual string_________________
//        if (a.equals(b)) {
//            System.out.println("yeah");
//        }
//        else {
//            System.out.println("Naahhh");
//        }

//________Refers to the actual string ignore case sensitive_________________

        if (a.equalsIgnoreCase(b)) {
            System.out.println("yeah");
        } else {
            System.out.println("Naahhh");
        }

    }
}
