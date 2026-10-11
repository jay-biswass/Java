package Collection_Framework;

import java.util.LinkedList;
import java.util.List;


public class LinkedListPractice {
    static void main(String[] args) {

//ArrayList ki saari chije/methods LinkedList mein kaam karengi EXCEPT clone() kaam nahi karega

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        list.add(50);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add(90);
        list.add(30);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

//        list.clear();
//        System.out.println("Clear: "+list);

        System.out.println("Size {size()}: "+list.size());

        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        list.remove(3);
        System.out.println(list);

//Adding element at start and end [Ye LinkedList Specific methods hain]
        System.out.println("Last Index of 30 {lastIndexOf(30)}: "+list.lastIndexOf(30));
        list.addFirst(100);
        System.out.println("after add first {addFirst(100)}: "+list);
        list.addLast(999);
        System.out.println("after add last {addLast(999)}: "+list);

        System.out.println("____________________________________");
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.addFirst(1);
        ll.addLast(500);
        System.out.println(ll);

        System.out.println("getFirst(): "+ll.getFirst());
        System.out.println("getLast(): "+ll.getLast());

// Polling: Remove the first element from the LL and return it as well
        System.out.println("Before polling: "+ll);
        System.out.println("Polling {poll()}: "+ll.poll());
        System.out.println("After polling: "+ll);

// Offer() : Add specific element at the last of the LL
        System.out.println("Before offer: "+ll);
        System.out.println("offer {offer()}: "+ll.offer(700));
        System.out.println("After offer: "+ll);






    }
}