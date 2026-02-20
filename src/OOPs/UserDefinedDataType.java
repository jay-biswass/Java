package OOPs;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Student{
        String name;
        int roll;
        double cgpa;

        void print(){
            System.out.println(name+" "+roll+" "+cgpa);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "Joy";
        s1.roll = 24061;
        s1.cgpa = 9.96;
        s1.print();

        Student s2 = new Student();
        s2.name = "Tanushree";
        s2.roll = 24069;
        s2.cgpa = 8.85;
        s2.print();

        Student s3 = new Student();
        s3.name = "Aman";
        s3.roll = 24085;
        s3.cgpa = 7.92;
        s3.print();

//        Student s4 = new Student();
//        s4.name = sc.nextLine();
//        s4.roll = sc.nextInt();
//        s4.cgpa = sc.nextDouble();

//        System.out.println(s1.name+" "+s1.roll+" "+s1.cgpa);
//        System.out.println(s4.name+" "+s4.roll+" "+s4.cgpa);

    }
}
