package Collection_Framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
//Default Behavior: Integer -> less Value -> more Priority -> minHeap
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.offer(40);
//        pq.offer(20);
//        pq.offer(30);
//        pq.offer(10);
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);


        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.offer(40);
        pq.offer(20);
        pq.offer(30);
        pq.offer(10);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
