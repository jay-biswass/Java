package OOPs;

public class Student {

    //    Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    public int setAge;
    private String gf;
    private int phoneNum;


    //    Default Constructor
//    public Student() {
//        System.out.println("Student default constructor called.");
//    }

    //    Parameterized Constructor
    public Student(int id, int age, String name, int nos, String gf, int phoneNum) {
        System.out.println("Student Parameterized constructor called.");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
        this.phoneNum = phoneNum;
    }

    public String getgfName() {
        return this.gf;
    }

    public int getAge() {
        return this.age;
    }

    public int getPhoneNum() {
        return this.phoneNum;
    }

    public void setAge(int a) {
        if (age < 100) {
            this.age = a;
            return;
        }
    }

    //    Copy Constructor
//        public Student(Student srcobj) {
//            System.out.println("Student Copy constructor called.");
//            this.id = srcobj.id;
//            this.age = srcobj.age;
//            this.name = srcobj.name;
//            this.nos = srcobj.nos;
//        }

    //    Methods / Behaviour

    public void study() {
        System.out.println(name + " is Studying");
    }

    public void sleep() {
        System.out.println(name + " is Sleeping");
    }

    public void bunk() {
        System.out.println(name + " is Bunking");
    }

    private void gfChatting() {
        System.out.println(name + " is gfChatting");
    }
}
