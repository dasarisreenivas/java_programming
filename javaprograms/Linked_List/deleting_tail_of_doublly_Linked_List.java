package Linked_List;

public class deleting_tail_of_doublly_Linked_List {
    public static class Node{
        int data;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data=data;
            this.next=next;
            this.back=back;
        }
        Node(int data){
            this.data=data;
            this.next=null;
            this.back=null;
        }
    };
        public static void main(String[] args) {
            int[]arr = {1,2,3,4};
            Node head = convertingArraytoDoubllyLL(arr);
            head = deletingthetail(head);
            print(head);
        }
        public static Node convertingArraytoDoubllyLL(int[]arr){
            Node head =new Node(arr[0]);
            Node prev = head;
            for(int i = 1;i<arr.length;i++){
                Node temp = new Node(arr[i],null,prev);
                prev.next=temp;
                prev=temp;
            }
            return head;
        }
        public static Node deletingthetail(Node head){
            if(head==null || head.next==null) return null;
            Node tail = head;
            while(tail.next!=null){
                tail=tail.next;
            }
            Node prev = tail.back;
            prev.next=null;
            tail.back=null;
            return head;
        }
        public static Void print(Node head){
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            return null;
        }
}
