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
        while(fast!=null || fast.next!=null){
            if(fast==slow){
                return fast;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return null;
    }
        public static void main(String[] args) {
           Floyd_Cycle_removal ll=new Floyd_Cycle_removal();
            ll.add_last(10);
            ll.add_last(20);
            ll.add_last(30);
            ll.add_last(40);
            ll.add_last(50);
            ll.add_last(60);
            ll.add_last(70);
            ll.add_last(80);
            ll.create_Cycle();
//            ll.findmeet();
            System.out.println(ll.findmeet().data);
            ll.remove_cycle();
            System.out.println(ll.findmeet().data);
//            ll.display();
//            ll.display();

        }
    }

