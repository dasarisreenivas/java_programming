package Linked_List;

public class deleltion_of_tail_of_the_linkedlist {
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
        int[]arr = {1,2,3,4};
        int n = arr.length;
        Node head =  converarr2ll(arr, n);
        head = deletingtail(head);
        print(head);
    }
    public static Node converarr2ll(int []arr,int n){
        Node head = new Node(arr[0]);
        Node Mover= head;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            Mover.next = temp;
            Mover=temp;
        }
        return head;
    }
    public static Node deletingtail(Node head){
        if(head == null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
