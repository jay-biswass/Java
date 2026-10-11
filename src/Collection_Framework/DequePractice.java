package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequePractice {
    static void main(String[] args) {

        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offerFirst(5);
        q.offerLast(55);
        System.out.println(q);

        System.out.println("pollLast: "+q.pollLast());
        System.out.println("pollLast: "+q.pollFirst());
        System.out.println(q);
        System.out.println("size: "+q.size());

    }
}
