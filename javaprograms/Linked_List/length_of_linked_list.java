package Linked_List;

public class length_of_linked_list {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data =data;
        this.next = next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int n = arr.length;
        int count = 0;
        Node head = lengthOfLinkedList(arr,n);
        Node temp =head;
        while(temp!=null){
            count=count+1;
            temp=temp.next;
        }
        System.out.println(count);
    }
    public static Node lengthOfLinkedList(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head ;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
