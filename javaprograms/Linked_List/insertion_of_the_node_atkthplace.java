package Linked_List;

public class insertion_of_the_node_atkthplace {
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
        int[]arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 3;
        int ele=6;
        Node head = convertarr2ll(arr, n);
        head =  insertion(head, ele, k);
        print(head);
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data);
            head = head.next;
        }
    }
    public static Node convertarr2ll(int[]arr,int n){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    public static Node insertion(Node head,int ele,int k){
        if(head==null){
            if(k==0) return new Node(ele);
            else return null;
        }
        if(k==1){
            Node temp = new Node(ele,head);
            return temp;
        }
        int cnt = 0;
        Node temp =head;
        while (temp!=null) {
            if(cnt==k-1){
                Node m = new Node(ele);
                m.next= temp.next;
                temp.next =m;
                break;
            }
            cnt++;
            temp =temp.next;
        }
        return head;
    }
}
