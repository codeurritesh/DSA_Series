package LinkedList;
public class Merge_two_sorted_LinkedList {
        static class Node{
            int data;
            Node next;
            Node(int d){
                this.data=d;
            }
        }
//        Node head;
        public void display(Node head){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
        }
    public void merge(Node head1,Node head2){
        System.out.println("----------------");
            Node i= head1;
            Node j=head2;
            Node result=new Node(0);
            Node temp=result;
            while(i!=null && j!=null){
                if(i.data<j.data){
                    temp.next=i;
                    i=i.next;
                    temp=temp.next;
                }else if(i.data>j.data){
                    temp.next=j;
                    j=j.next;
                    temp=temp.next;
                }else{
                    temp.next=i;
                    i=i.next;
                    temp=temp.next;
                    temp.next=j;
                    j=j.next;
                    temp=temp.next;
                }
            }
            if(i!=null){
                temp.next=j;
            }
            if(j!=null){
                temp.next=i;
            }
//            return result;
            display(result.next);
    }


        public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

            Node head2=new Node(10);
            head2.next=new Node(22);
            head2.next.next=new Node(30);
            head2.next.next.next=new Node(45);
            head2.next.next.next.next=new Node(50);
            Merge_two_sorted_LinkedList obj=new Merge_two_sorted_LinkedList();
            obj.display(head);
            System.out.println();
            obj.display(head2);
            obj.merge(head,head2);
//            System.out.println();
//            obj.display(result);
        }
    }
