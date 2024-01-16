package Linked_List.problems;

public class deletemiddle_of_middle_of_ll_optimalsolution {
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
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
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
        Node prev = null;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next = slow.next;
        }else{
            head = head.next;
        }
        return head;
    }
    public static void print(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
