package LinkedList;

public class Middle_Element_LinkedList {
    class Node{
        int data;
        Node next;
    }
    Node head=null;
    public void add_last(int data){

        Node nn=new Node();
        nn.data=data;
        if(head==null){
            head=nn;
        }else{
           Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=nn;
        }
    }
    public void display(){
       Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
    }
    public int middle_element(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Middle_Element_LinkedList ll=new Middle_Element_LinkedList();
        ll.add_last(10);
        ll.add_last(20);
        ll.add_last(30);
        ll.add_last(40);
        ll.add_last(50);
        ll.add_last(60);
        ll.display();
        System.out.println(ll.middle_element());
    }
}
