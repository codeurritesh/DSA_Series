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
        int ht=-1;
        int d=0;
    }
    public int diameter(){
        return diameter(this.root).d;
    }
    private diapair diameter(node root){
      if(root==null){
          return new diapair();
      }
      diapair ld=diameter(root.left);
      diapair rd=diameter(root.right);
      diapair sd=new diapair();
       sd.ht=Math.max(ld.ht,rd.ht)+1;
       int dia=ld.ht+rd.ht+2;
       sd.d=Math.max(dia,Math.max(ld.d,rd.d));
       return sd;
    }

    public static void main(String[] args) {
        Diameter_Btree obj=new Diameter_Btree();
        System.out.println(obj.diameter());
    }
}

