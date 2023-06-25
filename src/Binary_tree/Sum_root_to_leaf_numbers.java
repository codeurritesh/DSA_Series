package Binary_tree;

import java.util.Scanner;

public class Sum_root_to_leaf_numbers {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Sum_root_to_leaf_numbers(){
        this.root=createtree();
    }
    private node createtree(){
        int data=sc.nextInt();
        node nn=new node();
        nn.data=data;
        boolean hasleftchild=sc.nextBoolean();
        if(hasleftchild){
            nn.left=createtree();
        }
        boolean hasrightchild=sc.nextBoolean();
        if(hasrightchild){
            nn.right=createtree();
        }
        return nn;
    }
    public void sum(){
        System.out.print(sum(this.root,0));
    }
    private int sum(node root,int sum){
       if(root==null){return 0;}
       if(root.left==null && root.right==null){
           return sum*10+root.data;
//           return
       }
       int lsum=sum(root.left,sum*10+root.data);
       int rsum=sum(root.right,sum*10+root.data);
       return lsum+rsum;
    }
    public static void main(String[] args) {
        Sum_root_to_leaf_numbers obj=new Sum_root_to_leaf_numbers();
        obj.sum();

    }
}
