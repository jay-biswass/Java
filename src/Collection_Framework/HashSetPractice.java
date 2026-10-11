package Collection_Framework;



import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {
    static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student("Biswas",1);
        Student s2 = new Student("Biswas",1);
        Student s3 = new Student("Biswas",1);

        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println(set);


//        Hashset -> O(1)
//        LinkedHashset -> O(n)
//        TreeSet -> O(log n)

//        Set<Integer> st = new TreeSet<>();    //Ordered
//        Set<Integer> st = new HashSet<>();   //Unordered
//        st.add(10);
//        st.add(10);
//        st.add(30);
//        st.add(10);
//        st.add(20);
//        st.add(10);
//        System.out.println(st);
//
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//        System.out.println("set1: "+set1);
//        set1.retainAll(set2);
//        System.out.println("set1 after retain: "+set1);
//        System.out.println("set2 after retain: "+set2);

    }
}
