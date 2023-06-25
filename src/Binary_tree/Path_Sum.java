package Binary_tree;

import java.util.Scanner;

public class Path_Sum {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
       node left;
       node right;
    }
    private node root;
    public Path_Sum(){
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
    public void pathsum(int sum){
        System.out.print(pathsum(this.root,sum));
    }
    private boolean pathsum(node root,int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(sum-root.data==0){
                return true;
            }else
                return false;
        }
        boolean lfound=pathsum(root.left,sum-root.data);
        boolean rfound=pathsum(root.right,sum-root.data);
        return lfound||rfound;
    }
    public static void main(String[] args) {
        Path_Sum obj=new Path_Sum();

        obj.pathsum(15);
        obj.pathsum(14);
    }
}
