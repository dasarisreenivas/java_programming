package Linked_List;

public class deleting_node_of_doublly_linked_list {
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
        int[]arr={1,2,3,44,5};
        int node = 44;
        Node head = convertingarr2ll(arr);
        head = deletinghead(head,node);
        print(head);
    }
    public static Node convertingarr2ll(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static Node deletinghead(Node head,int node){
        Node temp =head;
        while(temp.next!=null){
            if(temp.data==node){
                break ;
            }
            temp=temp.next;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if(front==null){
            prev.next=null;
            temp.back=null;
            return head;
        }
        prev.next=front;
        front.back=prev;
        temp.back=temp.next=null;
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
