package Linked_List;
public class search_an_element_in_linkedlist {
    public static class Node{
    int data;
    Node next;
    Node(int data,Node next){
        this.data =data;
        this.next = next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        int n = arr.length;
        int index=0;
        int target=2;
        Node head = search(arr,n);
        Node temp =head;
        while(temp!=null){
            index+=1;
           if(temp.data==target) System.out.println(index);
            temp=temp.next;
        }
    }
    public static Node search(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head ;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
}
