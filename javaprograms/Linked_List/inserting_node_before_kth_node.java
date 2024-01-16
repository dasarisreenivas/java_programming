package Linked_List;

public class inserting_node_before_kth_node {
    public static class Node {
        int data;
        Node next;
        Node back;

        Node(int data, Node next, Node back) {
            this.data = data;
            this.next = next;
            this.back = back;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int val = 10;
        int k = 3;
        Node head = convertingarr2dll(arr);
        head = insertingval(head, val, k);
        print(head);
    }

    public static Node convertingarr2dll(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            temp.back = prev;
            prev = temp;
        }
        return head;
    }

    public static Node insertingval(Node head, int val, int k) {
        if (k == 1) {
            Node newhead = new Node(val, head, null);
            if (head != null) {
                head.back = newhead;
            }
            return newhead;
        }
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }
        Node behind = temp.back;
        Node newNode = new Node(val, temp, behind);
        temp.back = newNode;
        behind.next = newNode;
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
