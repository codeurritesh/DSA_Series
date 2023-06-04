package LinkedList;

public class Reverse_LinkedList {
        static class Node{
            int data;
            Node next;
            Node(int d){
                this.data=d;
            }
        }

        public void display(Node head){
//            System.out.println();
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        public Node reverseLL(Node head){
            Node curr=head;
            Node pre=null;
            while(curr!=null){
                Node ahead=curr.next;
                curr.next=pre;
                pre=curr;
                curr=ahead;
            }
            return pre;
        }
        public static void main(String args[]){
            Node head=new Node(50);
            head.next=new Node(20);
            head.next.next=new Node(60);
            head.next.next.next=new Node(10);
            head.next.next.next.next=new Node(25);
            Reverse_LinkedList obj=new Reverse_LinkedList();
            obj.display(head);
            Node ans=obj.reverseLL(head);
            System.out.println("\nReverse LinkedList: ");
            obj.display(ans);
        }
    }
