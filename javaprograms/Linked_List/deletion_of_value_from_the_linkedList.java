package Linked_List;
public class deletion_of_value_from_the_linkedList {
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
        int[]arr={1,2,5,3,6};
        int n = arr.length;
        Node head  = convertArr2ll(arr,n);
        head = removevalnode(head,5);
        print(head);
    }
    public static void print(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    public static Node convertArr2ll(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<n;i++){
            Node temp= new Node(arr[i]);
            mover.next =temp;
            mover = temp;
        }
        return head;
    }
    public static Node removevalnode(Node head,int val){
        if(head == null) return head;
        if(head.data==val){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==val){
                prev.next=prev.next.next;
                temp=null;
                break;
            }
            prev = temp;
            temp=temp.next;
        }
        return head;
    }
}
