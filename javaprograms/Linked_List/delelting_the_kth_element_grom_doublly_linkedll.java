package Linked_List;

public class delelting_the_kth_element_grom_doublly_linkedll {
    public static class Node{
        int data;
        Node next;
        Node back;
        Node(int data,Node next,Node back){
            this.data = data;
            this.next=next;
            this.back = back;
        }
        Node(int data){
            this.data=data;
            this.next = null;
            this.back = null;
        }
    };
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        int k =3;
        Node head =  convertArr2DLL(arr);
        head = deletingkthelement(head,k);
        print(head);
    }
    private static Node convertArr2DLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
    public static Node deletingkthelement(Node head,int k){
        int count  =  0;
        Node temp =head;
        while(temp!=null){
            count++;
            if(count==k) break;
            temp=temp.next;
        }
        Node previous = temp.back;
        Node front = temp.next;
        if(previous==null && front==null){
            return null;
        }else if(previous == null){
            return head = head.next;
        }else if(front == null){
            Node tail = head;
            while(tail.next!=null){
                tail=tail.next;
            }
            Node tail2 = tail.back;
            tail2.next = null;
            tail.back =null;
            return head;
        }else{
            previous.next = front;
            front.back = previous;
            temp.next =null;
            temp.back = null;
            return head;
        }
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
