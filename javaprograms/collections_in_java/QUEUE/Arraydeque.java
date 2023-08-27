package collections_in_java.QUEUE;
import java.util.*;
import java.util.ArrayDeque;
public class Arraydeque {
    public static void main(String[] args) {
        Deque<Integer> pq = new ArrayDeque<>();
        //ArrayDeque<Integer> pq = new ArrayDeque<>();
        //adding elements to the ArrayDeque
        pq.add(2);
        pq.addFirst(3);
        pq.addLast(6);
        pq.offer(3);
        pq.offerFirst(4);
        pq.offerLast(10);
        System.out.println(pq);
        //comparator
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
        //deletion of the elements in ArrayDeque
        pq.pop();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.pollFirst();
        System.out.println(pq);
        pq.pollLast();
        System.out.println(pq);
        //retrival of the Elements
        pq.peek();
        System.out.println(pq);
        pq.peekFirst();
        System.out.println(pq);
        pq.peekLast();
        System.out.println(pq);
        //verification
        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(6));
    }
}
