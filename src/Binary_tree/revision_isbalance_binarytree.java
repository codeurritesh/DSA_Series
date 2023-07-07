package Binary_tree;

import java.util.Scanner;

public class revision_isbalance_binarytree {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public revision_isbalance_binarytree(){
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

    public boolean isbal(){
        return isbal(this.root);
    }
    private boolean isbal(node root){
        if(root==null){
            return true;
        }
        boolean left=isbal(root.left);
        boolean right=isbal(root.right);
        int lheight=height(root.left);
        int rheight=height(root.right);
        return left && right && Math.abs(lheight-rheight)<=1;


    }
    private int height(node root){
        if(root==null){
            return -1;
        }
        int right=height(root.right);
        int left=height(root.left);
        return Math.max(right,left)+1;
    }
    public static void main(String[] args) {
        revision_isbalance_binarytree obj=new revision_isbalance_binarytree();
        System.out.println(obj.isbal());
    }
}
