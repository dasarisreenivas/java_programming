package Linked_List.problems;
import java.util.*;
public class palindrome_or_not_bruteforce {
    public static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        Node head = convertarr2ll(arr);
        System.out.println(palindrome(head));
    }
    public static Node convertarr2ll(int []arr){
        Node head  = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static boolean palindrome(Node head){
        Node temp = head;
        Stack<Integer> st  = new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp!=null) {
            if(temp.data==st.pop()){
                temp = temp.next;
            }else return false;
        }
        return true;
    }
}