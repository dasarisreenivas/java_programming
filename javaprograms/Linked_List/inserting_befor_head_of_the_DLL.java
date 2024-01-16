package Linked_List;
public class inserting_befor_head_of_the_DLL {
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
        int []arr = {1,2,3,44,5};
        int insertelement = 0;
        Node head = convertarr2ll(arr);
        head = insertatheadofdll(head, insertelement);
        print(head);

    }
    public static Node convertarr2ll(int[]arr){
        Node head  = new Node(arr[0]);
        Node prev  = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node insertatheadofdll(Node head,int insertelement){
        Node newnode = new Node(insertelement,head,null);
            head.back= newnode;
            return newnode;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
