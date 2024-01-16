package Linked_List.problems;

public class reverseDLL_optimal_solution {
    public static class Node{
        int data ;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data = data;
            this.next = next;
            this.back = back;
        }
        Node(int data){
            this.data = data;
            this.next = this.back = null;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = convertingArr2ll(arr);
        head = reverse(head);
        print(head);

    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static Node convertingArr2ll(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node reverse(Node head){
        if(head ==null || head.next ==null) return head;
        Node last =  null;
        Node current = head;
        while(current!=null){
            last  = current.back;
            current.back = current.next;
            current.next = last;
            current = current.back;
        }
        return last.back;
    }
}

