package Binary_tree;

import java.util.Scanner;

public class Binary_tree_basics {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public Binary_tree_basics(){
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
        if(hasleftchild){
            nn.right=createtree();
        }
        return nn;
    }

    public void display(){
        display(this.root);
    }
    private void display(node nn){
        if(nn==null){
            return;
        }
        String str="<--"+nn.data+"-->";
        if(nn.left!=null){
            str=nn.left.data+str;
        }else{
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.right.data;
        }else{
            str=str+".";
        }
        System.out.println(str);
        display(nn.left);
        display(nn.right);
    }
    public void MAX(){
        System.out.println(MAX(this.root));
    }
    private int MAX(node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int lmax=MAX(nn.left);
        int rmax=MAX(nn.right);
        return Math.max(lmax,Math.max(rmax,nn.data));
    }

    public void MIN(){
        System.out.println(MIN(this.root));
    }
    private int MIN(node nn){
        if(nn==null){
            return Integer.MAX_VALUE;
        }
        int lmax=MIN(nn.left);
        int rmax=MIN(nn.right);
        return Math.min(lmax,Math.min(rmax,nn.data));
    }

    public void Find(int item){
        System.out.println(Find(this.root,item));
    }
    private boolean Find(node nn,int item){
        if(nn==null)
        {
            return false;
        }
        if(nn.data==item){
            return true;
        }
    boolean lfound=Find(nn.left,item);
    boolean rfound=Find(nn.right,item);
    return lfound||rfound;
    }
    public void height(){
        System.out.println(height(this.root));
    }
    private int height(node nn){
      if(nn==null){
          return -1;
      }
        int lheight=height(nn.left);
        int rheight=height(nn.right);
        return Math.max(lheight,rheight)+1;
    }
}
