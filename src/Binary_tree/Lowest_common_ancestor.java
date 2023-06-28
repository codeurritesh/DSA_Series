package Binary_tree;

import java.util.Scanner;

public class Lowest_common_ancestor {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Lowest_common_ancestor(){
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

    public int LCA(int p,int q){
        return LCA(this.root,p,q).data;
    }
    private node LCA(node root,int p,int q){
        if(root==null){
            return null;
        }
        if(root.data==p || root.data==q){
            return root;
        }
        node left=LCA(root.left,p,q);
        node right=LCA(root.right,p,q);
        if(left!=null && right!=null){
            return root;
        }
        if(left==null){
            return right;
        }else{
            return left;
        }
    }
    public static void main(String[] args) {
        Lowest_common_ancestor obj=new Lowest_common_ancestor();
        System.out.println(obj.LCA(2,9));
    }
}
