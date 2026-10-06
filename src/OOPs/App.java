package OOPs;

import java.lang.reflect.Parameter;

public class App {
    public static void main(String[] args) {

//        Student A = new Student();
//        A.id = 1;
//        A.name = "Jay";
//        A.age = 22;
//        A.nos = 5;
//        System.out.println(A.id);
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.nos);
//        A.bunk();
//        A.sleep();


//        Parameterized Constructor

        Student A = new Student(1,22,"Jay",6, "Tannu", 979887297);
//        Student B = new Student(A);

        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.getAge());
        System.out.println(A.nos);
        System.out.println(A.getgfName());
        System.out.println(A.getPhoneNum());
//
//        System.out.println(B.id);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.nos);




//        Car M = new Car("Maruti", 800,5,"Red");
//
//        System.out.println(M.name);
//        System.out.println(M.cc);
//        System.out.println(M.costInLakh);
//        System.out.println(M.color);


    }
}