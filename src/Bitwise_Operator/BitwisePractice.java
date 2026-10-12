package Bitwise_Operator;

public class BitwisePractice {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 6;
//        System.out.println(a&b);
//        System.out.println(a|b);
//        System.out.println(a^b);
//        System.out.println(~a);

////        Bitwise Left Shift
//        int n = 1;
//        for (int i=1; i<=32; i++){
//            n = n<< 1;
//            System.out.println(n);
//        }

////        Bitwise Right Shift
//        int n = 100;
//        for (int i=1; i<=10; i++){
//            n = n >> 1;
//            System.out.println(n);
//        }


//        int n =11;
//        if((n&1)==0){
//            System.out.println("Even");
//        }
//        else System.out.println("Odd");

        int n = 31  ;
        int count = 0;
        while (n != 0) {
            if ((n & 1) !=0) {
                count++;
            }
            n = n>>1;
        }
        System.out.println(count);


    }
}
