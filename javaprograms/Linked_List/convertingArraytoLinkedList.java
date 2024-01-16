package Linked_List;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }
}
public class convertingArraytoLinkedList {
    public static Node converArr2LL(int[]arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3};
        Node head = converArr2LL(arr);
        System.out.println(head.data);
    }
}
