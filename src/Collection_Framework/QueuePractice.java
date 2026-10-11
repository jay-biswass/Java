package Collection_Framework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
//      q.offerFirst(77);   //Deque specific
        System.out.println(q);
        System.out.println("element: "+q.element());
        System.out.println("peek: "+q.peek());
        System.out.println("poll: "+q.poll());
        System.out.println("poll: "+q.poll());
        System.out.println(q);




    }
}
