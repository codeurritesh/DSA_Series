package LinkedList;

public class Intrsection_LinkedList {
        static class node{
            int data;
            node next;
            node(int d){
                data=d;
                next=null;
            }
        }
        Node head;
        Node head2;
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

        public static void display(node head){
            node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
        }
        public static int find_intersection(node head,node head2){
            node a=head;
            node b=head2;
            while(a!=b){
                if(a==null){
                    a=head2;
                }else{
                    a=a.next;
                }
                if(b==null){
                    b=head;
                }else{
                    b=b.next;
                }
            }
            return a.data;
        }
        public static void main(String[] args) {
//            node head,head2;
            node head=new node(10);
            node head2=new node(1);

            node nn=new node(2);
            head2.next=nn;

            nn=new node(20);
            head.next=nn;

            nn=new node(30);
            head.next.next=nn;

            nn=new node(40);
            head.next.next.next=nn;
            head2.next.next=nn;

            nn=new node(50);
            head.next.next.next.next=nn;


            display(head);
            System.out.println();
            display(head2);
            System.out.println("\n Intersection at: "+find_intersection(head,head2));
        }
    }
