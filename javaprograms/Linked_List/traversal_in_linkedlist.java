package Linked_List;

public class traversal_in_linkedlist {
   public static  class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data = data;
    }
}
   /* public static Node traversal(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node Mover = head;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            Mover.next =temp;
            Mover=temp;
        }
        return head;
    }*/
   public static void main(String[] args) {
    int []arr = {1,2,3,4};
    Node head = new Node(arr[0]);
    Node Mover = head;
    for(int i =1;i<arr.length;i++){
        Node temp = new Node(arr[i]);
        Mover.next=temp;
        Mover = temp;
    }
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
   }
}
