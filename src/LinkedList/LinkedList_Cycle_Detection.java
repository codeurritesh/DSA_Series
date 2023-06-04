package LinkedList;

public class LinkedList_Cycle_Detection {
    class node{
        int data;
        Node next;
    }
    Node head;
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
    public void create_Cycle(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next.next;//creating cycle

    }
    public boolean hascycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null || fast.next!=null){
            if(fast==slow){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList_Cycle_Detection ll=new LinkedList_Cycle_Detection();
        ll.add_last(10);
        ll.add_last(20);
        ll.add_last(30);
        ll.add_last(40);
        ll.add_last(50);
        ll.add_last(60);
//        ll.create_Cycle();
//        ll.display();
        System.out.println(ll.hascycle());
    }
}
