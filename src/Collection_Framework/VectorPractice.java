package Collection_Framework;

import java.util.List;
import java.util.Vector;

public class VectorPractice {
    static void main(String[] args) {

        //ArrayList, LinkedList ki saari chije/methods Vector mein kaam karengi EXCEPT clone() kaam nahi karega

        List<Integer> list = new Vector<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
