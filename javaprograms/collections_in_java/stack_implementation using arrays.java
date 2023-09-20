package collections_in_java;
import java.util.*;
public class stack_program_with_out_stack_collection {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        Stack s = new Stack(a);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.printStack();
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
class Stack{
    private int maxSize;
    private int top;
    private int []stackArray;
    public Stack(int size){
        maxSize =size;
        stackArray=new int[maxSize];
        top=-1;
    }
    public void push(int val){
        if(top<maxSize-1){
            stackArray[++top]=val;
        }else{
            System.out.println("Stack is full");
            return ;
        }
    }
    public int pop(){
        if(top>=0){
            return stackArray[top--];
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int peek(){
        if(top>=0){
            return stackArray[top];
        }
        else{
            return -1;
        }
    }
    public boolean isEmpty(){
        if(top ==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        return top==maxSize-1;
        }
    public void printStack(){
        for(int i=top;i>=0;i--){
            System.out.print(stackArray[i]+" ");
        }
        System.out.println();
    }
    }

