package Linked_List.problems;
public class palindrome_or_not_optimalsolution {
    public static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data= data;
            this.next = next;
        }
        Node(int data){
            this.data= data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,2,1};
        Node head = convertarr2ll(arr);
        System.out.println(palindrome(head));;
    }
    public static Node convertarr2ll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Boolean palindrome(Node head){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newHead = reverse(slow.next);
        Node first = head;
        Node second = head;
        while (second!=null) {
            if(first.data!=second.data){
                reverse(newHead);
                return false;
            }
            first= first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;

    }
    public static Node reverse(Node head){
        Node prev=null;
        Node temp = head;
        while (temp!=null) {
            Node front=temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return head;
    }
}
   