package Binary_tree;

import java.util.Scanner;

public class BInary_Tree_Right_Side_View {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public BInary_Tree_Right_Side_View(){
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

        public boolean rightview(){
             rightview(this.root);
        }
        static int maxdepth=-1;
        private void rightview(node root){//O(n^2)
            if(root==null){
                return;
            }


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

}
