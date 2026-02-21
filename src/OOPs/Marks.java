package OOPs;

public class Marks {
    public static class StudentData{
        String name;
        int roll;
        int[] marks;
        StudentData(int s) {
            marks = new int[s];
        }
            void print(){
                System.out.println(name +" "+roll+" " + marks);
        }
    }

    public static void main(String[] args) {
        StudentData s1 = new StudentData(3);
        StudentData s2 = new StudentData(2);
        s1.marks[0]= 92;
        s1.marks[1]= 82;
        s1.marks[2]= 79;
        s2.marks[0]= 59;
        s2.marks[1]= 99;
        s1.print();

    }
}
