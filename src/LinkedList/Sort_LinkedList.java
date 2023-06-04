package LinkedList;

public class Sort_LinkedList {
    static class Node{
        int data;
        Node next;
    Node(int d){
        this.data=d;
    }
    }
    public Node merge(Node head1, Node head2){
//        System.out.println("----------------");
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
            }
        }
        if(i!=null){
            temp.next=i;
        }
        if(j!=null){
            temp.next=j;
        }
            return result.next;
    }
    public Node sortLL(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=middle_element(head);
        Node rightll=mid.next;
        mid.next=null;
        Node A=sortLL(head);
        Node B=sortLL(rightll);
        Node answer=merge(A,B);

        return answer;
    }
    public Node middle_element(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public void display(Node head){
        System.out.println();
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Node head=new Node(50);
        head.next=new Node(20);
        head.next.next=new Node(60);
        head.next.next.next=new Node(10);
        head.next.next.next.next=new Node(25);
        Sort_LinkedList obj=new Sort_LinkedList();
        Node result1=obj.sortLL(head);
        obj.display(result1);
    }
}
