package Linked_List;
public class deleltion_of_head_of_the_linkedlist {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n=arr.length;
        Node head = convertarrtoll(arr, n);
        Node deletionhead = deletion_of_head(head);
        print(deletionhead);
    }
    public static Node convertarrtoll(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1 ; i < n;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    public static Node deletion_of_head(Node head){
        if(head==null) return head;
        head = head.next;
        return head;
    }
    public static void print(Node head){
        while (head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
