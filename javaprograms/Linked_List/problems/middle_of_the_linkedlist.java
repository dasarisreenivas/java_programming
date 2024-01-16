package Linked_List.problems;

public class middle_of_the_linkedlist {
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
            int arr2[]={1,2,3,4,5,6};
            int n=arr.length;
            int m=arr.length;
            Node head = convertarrtoll(arr, n);//odd numbers
            Node head1 = convertarrtoll(arr2, m);//even numbers
            head = middle(head);
            head1 = middle(head);
            print(head);
            System.out.println();
            print(head1);
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
        public static Node middle(Node head){
            if(head == null || head.next==null) return head;
            Node temp = head;
            int cnt = 0;
            while(temp!=null){
                cnt++;
                temp = temp.next;
            }
            int middle = (cnt/2)+1;
            temp= head;
            while(temp!=null){
                middle = middle-1;
                if(middle==0) break;
                temp = temp.next;
            }
            return temp;
        }
        public static void print(Node head){
            System.out.print(head.data);
        }
}
