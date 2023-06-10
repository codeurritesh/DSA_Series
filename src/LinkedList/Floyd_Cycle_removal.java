package LinkedList;

public class Floyd_Cycle_removal {
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
//            System.out.println(head.next.next.data);
            temp.next=head.next.next;//creating cycle

        }
      public void remove_cycle(){
            Node meet=findmeet();
            if(meet==null){
                return;
            }
            Node a=meet;
            Node b=head;
            while( a.next!=b.next){
                a=a.next;
                b=b.next;
            }
            b.next=null;
      }
    public Node findmeet(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){

//            System.out.println(slow.data);
//            System.out.println(fast.data);
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return fast;
            }
        }
        return null;
    }
        public static void main(String[] args) {
           Floyd_Cycle_removal ll=new Floyd_Cycle_removal();
            ll.add_last(1);
            ll.add_last(2);
            ll.add_last(3);
            ll.add_last(4);
            ll.add_last(5);
            ll.add_last(6);
            ll.add_last(7);
            ll.add_last(8);
            ll.create_Cycle();
//            ll.findmeet();
            System.out.println(ll.findmeet().data);//10
            ll.remove_cycle();
            System.out.println(ll.findmeet().data);//10
//            ll.display();
//            ll.display();

        }
    }

