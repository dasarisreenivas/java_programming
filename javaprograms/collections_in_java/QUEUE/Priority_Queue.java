package collections_in_java.QUEUE;
import java.util.*;
import java.util.Queue;
public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        //Queue<Integer>  pq = new PriorityQueue
        //addition of elements into the queue using offer(),add();
        pq.offer(8);
        pq.offer(1);
        pq.offer(6);
        pq.offer(10);
        pq.add(7);
        pq.add(0);
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        //retrival of elements in the queue using peek()
        System.out.println(pq.peek());
        //removal of elments from the queue using remove(),poll();
        System.out.println(pq.remove(10));
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        //for each loop will not work effictively 
        for(Integer qInteger:pq){
            System.out.print(qInteger);
        }
        System.out.println();
        pq.offer(32);
        pq.offer(0);
        pq.offer(3);
        //to over come that we use the while loop and the poll() method 
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
         pq.clear();
}
        //we can remove the entire quee using the clear() method

 }
