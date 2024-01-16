package Linked_List;

public class deletion_of_kth_element_from_the_ll {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next =  null;
    }
}
    public static void main(String[] args) {
        int[]arr={8,65,23,4};
        int n = arr.length;
        int k = 5;
        Node head= convertingarr2ll(arr,n);
        head = deleteelement(head,k);
        print(head);
    }
    public static Node convertingarr2ll(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deleteelement(Node head,int target){
    if(head==null) return head;
    if(target==0){
        head = head.next;
        return head;
    }
    int count = 0;
    Node temp =head;
    Node prev = null;
    while(temp!=null){
        if(target==count){
            prev.next = prev.next.next;
            temp=null;
            break;
        }
        count++;
        prev=temp;
        temp=temp.next;
    }
    return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head =head.next;
        }
    }

























}
