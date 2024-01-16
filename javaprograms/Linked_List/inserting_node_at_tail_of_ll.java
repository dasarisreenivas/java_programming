package Linked_List;
public class inserting_node_at_tail_of_ll {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n = arr.length;
        int val = 0;
        Node head = convertingarr2ll(arr,n);
        head = insertionattail(head,val);
        print(head);
    }
    public static Node convertingarr2ll(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node insertionattail(Node head,int val){
        if(head==null) return new Node(val,null);
        Node temp =head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
