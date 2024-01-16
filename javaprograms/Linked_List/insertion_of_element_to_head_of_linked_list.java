package Linked_List;
public class insertion_of_element_to_head_of_linked_list {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int val =0;
        Node head = convertingarr2ll(arr,n);
       // head = new Node(val,head); this is the first method to add ll directly form the main method
       head  = headinsertion(val,head);
        print(head);
    }
    public static Node convertingarr2ll(int[]arr,int n){
        Node head =  new Node(arr[0]);
        Node mover= head;
        for(int i =1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }
    //public static Node headinsertion(int val,Node head){  |
    //     Node temp = new Node(val);                       |
    //     temp.next=head;                                  |   second method to insertion of the head to ll
    //     return temp;                                     |
    // }                                                    |


    // public static Node headinsertion(int val,Node head){ |
    //     Node temp = new Node(val,head);                  |   third method to insertion of the head to ll
    //     return temp;                                     |
    // }        
    
    public static Node headinsertion(int val,Node head){
        return new Node(val,head);                           //fourth method to insertion of the head to ll
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
