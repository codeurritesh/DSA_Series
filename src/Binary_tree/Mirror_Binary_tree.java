package Binary_tree;
import java.util.*;
public class Mirror_Binary_tree {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Mirror_Binary_tree(){
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

    public boolean mirror(){
            return mirror(this.root.left,this.root.right);
    }
    private boolean mirror(node root1,node root2){
       if(root1==null&&root2==null){
           return true;
       }
       if(root1==null||root2==null){
           return false;
       }
       if(root1.data!= root2.data){
           return false;
       }
       boolean left=mirror(root1.left,root2.right);
       boolean right=mirror(root1.right,root2.left);
       return left&& right;
    }
     public static void main(String[] args) {
        Mirror_Binary_tree obj=new Mirror_Binary_tree();
        System.out.println(obj.mirror());
    }
}
