package LinkedList;

public class Sort_LinkedList {
    static class Node{
        int data;
        Node next;
    Node(int d){
        this.data=d;
    }
    }
    public static void main(String args[]){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
    }
}
