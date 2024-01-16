package Linked_List.problems;

public class reverse_singly_lnkedlist_using_recursion {
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
            Node head = convertarrtoll(arr, n);//odd numbers
            head = reverse(head);
            print(head);
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
        public static Node reverse(Node head){
            if(head==null || head.next==null) return head;
            Node newhead = reverse(head.next);
            Node front = head.next;
            front.next=head;
            head.next = null;
            return newhead;
        }
        public static void print(Node head){
            while (head!=null) {
                System.out.print(head.data+" ");
                head=head.next;
            }
        }
}
