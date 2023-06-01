package LinkedList;

class Node{
    int data;
    Node next=null;
}
public class LinkedList_Operations {
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
    public void add_first(int data){
        Node nn=new Node();
        nn.data=data;
        if(head==null){
            head=nn;
        }else{
           Node temp=head;
           head=nn;
           nn.next=temp;
        }
    }
    public  void add_at_position(int index,int data){
        Node nn=new Node();
        nn.data=data;
        int counter=1;
        Node temp=head;
        while (temp!=null){
            if(counter==index-1){
                Node temp2=temp.next;
                temp.next=nn;
                nn.next=temp2;

            }
          counter++;
          temp=temp.next;
        }

    }
    public boolean ispresent(int searchdata){
        Node temp=head;
        while (temp!=null){
            if(temp.data==searchdata){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void remove_last(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void remove_first(){
        head=head.next;
    }
    public void remove_position(int index){
    Node temp=head;
    int counter=1;
    if(index==1){
        remove_first();
        return;
    }
    while(counter!=index-1){
        temp=temp.next;
        counter++;
    }
    temp.next=temp.next.next;
    }
    

}
