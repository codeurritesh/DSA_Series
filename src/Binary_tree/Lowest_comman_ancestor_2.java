package Binary_tree;

import java.util.Scanner;

public class Lowest_comman_ancestor_2 {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Lowest_comman_ancestor_2(){
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
        if(find(root,p)==false || find(root,q)==false){
            return -1;
        }else
        return LCA(this.root,p,q).data;
    }
    private boolean find(node root,int p){
        if(root==null){
            return false;
        }
        if(root.data==p){
            return true;
        }
        boolean left=find(root.left,p);
        boolean right=find(root.right,p);
        return left||right;
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
        Lowest_comman_ancestor_2 obj=new Lowest_comman_ancestor_2();
        System.out.println(obj.LCA(2,9));
    }
}

