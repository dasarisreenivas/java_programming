package collections_in_java.QUEUE;
import java.util.*;
public class Queue_implementation_using_arrays {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue s = new Queue(n);
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.printStack();
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isempty());
        System.out.println(s.isfull());
        System.out.println();
        s.printStack();
        sc.close();
    }
}
class Queue{
    private int maxSize;
    private int front;
    private int rear;
    private int arr[];
    public Queue(int size){
        this.maxSize= size;
        this.front=0;
        this.rear=-1;
        this.arr=new int[maxSize];
    }
    public void push(int val){
        if(isfull()){
            System.out.println("queue is full");
        }else{
            arr[++rear]=val;
        }
    }
    public int peek(){
        if(isempty()){
            System.out.println("queue is empty we cannot peek the elements");
        }
        return arr[front];
    }
    public int pop(){
        if(isempty()){
            System.out.println("queue is full we cannot pop the elements");
        }
        return arr[front++];
    }
    public boolean isfull(){
        if(rear== maxSize-1) return true;
        return false;
    }
    public boolean isempty(){
        if(front>rear){
            return true;
        }
        return false;
    }
    public void printStack(){
        for(int i =0;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
}
