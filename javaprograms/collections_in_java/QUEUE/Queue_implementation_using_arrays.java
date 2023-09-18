package collections_in_java.QUEUE;
import java.util.*;
public class Queue_implementation_using_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue(sc.nextInt());
        for(int i=0;i<3;i++){
            q.offer(sc.nextInt());
        }
        q.pop();
        q.printqueue();

    }
}
class queue{
    private int maxSize;
    private int top;
    private int[]ArrayQueue;
    public queue(int size){
        maxSize=size;
        ArrayQueue=new int [maxSize];
        top=-1;
    }
    public void offer(int val){
        if(top<maxSize-1) {
            ArrayQueue[++top]=val;
        }
        else {
            System.out.println("Queue ran out of memory");
            return ;
        }
    }
    public void pop(){
       if(top<0){
        while(top!=0){
        System.out.println("quqe elements are"+ArrayQueue[top--]);
        top++;
        }
       }else{
        System.out.println("Queue is empty");
       }
    }
    public void printqueue(){
        for(int i=0;i<ArrayQueue.length;i++){
            System.out.println(ArrayQueue[i]);
        }
    }
}
