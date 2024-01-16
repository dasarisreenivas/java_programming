package Linked_List.problems;

public class deletemiddle_of_middle_of_ll_bruteforce {
    public static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data= data;
            this.next = next;
        }
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertarr2ll(arr);
        head = deletemiddle(head);
        print(head);
    }
    public static Node convertarr2ll(int[]arr){
        Node head  = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node deletemiddle(Node head){
        Node temp = head;
        int cnt = counting(head);
        int mid = cnt/2;
        int cnt2=0;
        if(head == null) return head;
        while(temp!=null){
            cnt2++;
            if(cnt2==mid){
                temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        return head;
    }
    public static int counting(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp!=null) {
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
