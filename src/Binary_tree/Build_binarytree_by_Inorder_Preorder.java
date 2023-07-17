package Binary_tree;

import java.util.Scanner;

public class Build_binarytree_by_Inorder_Preorder {

    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }

    public void buildtree(int preorder[],int inorder[]){
        node rootpoint=buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        
        display(rootpoint);
    }
    private node buildtree(int[] preorder,int plo,int phi,int[] inorder,int ilo,int ihi){
        if(ilo>ihi || plo> phi){
            return null;
        }
        node nn=new node();
        nn.data=preorder[plo];
        int i=search(inorder,ilo,ihi,preorder[plo]);
        int net=i-ilo;
        nn.left=buildtree(preorder,plo+1,plo+net,inorder,ilo,i-1);
        nn.right=buildtree(preorder,plo+net+1,phi,inorder,i+1,ihi);
        return nn;

    }
    private static int search(int inorder[],int ilo,int ihi,int item){
        for(int i=ilo;i<=ihi;i++){
            if(inorder[i]==item){
                return i;
            }
        }
        return -1;
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
    public static void main(String[] args) {
        Build_binarytree_by_Inorder_Preorder obj=new Build_binarytree_by_Inorder_Preorder();
        Scanner s=new Scanner(System.in);
        int preorder[]={10,50,80,60,70,90,17};
        int inorder[]={80,50,60,10,90,17,70};
        obj.buildtree(preorder,inorder);
    }

}
