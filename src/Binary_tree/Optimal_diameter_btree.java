package Binary_tree;
import java.util.Scanner;
public class Optimal_diameter_btree {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Optimal_diameter_btree(){
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
    class diapair{
        int height=-1;
        
    }
    public int diameter(){
        return diameter(this.root);
    }
    private int diameter(node root){
        if(root==null){
            return 0;
        }
        int ld=diameter(root.left);
        int rd=diameter(root.right);
        int sd=height(root.left)+height(root.right)+2;
        return sd;
    }

    private int height(node nn){
        if(nn==null){
            return -1;
        }
        int lheight=height(nn.left);
        int rheight=height(nn.right);
        return Math.max(lheight,rheight)+1;
    }

    public static void main(String[] args) {
        Diameter_Btree obj=new Diameter_Btree();
        System.out.println(obj.diameter());
    }
}

