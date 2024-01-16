package Linked_List.problems;

public class add_of_two_linkedlists {
    public static class Node{
        int data;
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
        int arr1[] = {1,2,3};
        int arr2 [] ={1,2,3};
        Node l1 = convertingarrtoll(arr1);
        Node l2 = convertingarrtoll(arr2);
        Node result = resultantlist(l1,l2);
        print(result);

    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static Node convertingarrtoll(int[]arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =  1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node resultantlist(Node l1,Node l2){
        Node t1 = l1;
        Node t2 = l2;
    
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        int carry = 0;
        while(t1!=null || t2!=null){
            int sum = carry;
            if(t1!=null) sum = sum+t1.data;
            if(t2!=null) sum = sum+t2.data;
            Node newNode = new Node(sum%10);
            current.next = newNode;
            current = current.next;
            carry = sum/10;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
        }
        if (carry > 0) {
            Node carryNode = new Node(carry);
            current.next = carryNode;
        }           
        return dummyNode.next;
    }
}
