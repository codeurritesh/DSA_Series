package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Validate_binary_search_tree {

        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public Validate_binary_search_tree(){
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
        public boolean isbst(){
            return isbst(this.root).isbst;
        }
        public class bstpair{
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            boolean isbst=true;
        }
        private bstpair isbst(node root){
            if(root==null){
                return new bstpair();
            }
            bstpair left=isbst(root.left);
            bstpair right=isbst(root.right);
            bstpair self=new bstpair();
            if(left.isbst && right.isbst && left.max < root.data && right.min > root.data){
                self.isbst=true;
                self.max=Math.max(right.max, root.data);
                self.min=Math.min(left.min, root.data);
                return self;
            }
            self.isbst=false;
            self.max=Math.max(left.max, Math.max(right.max, root.data));
            self.max=Math.min(left.min, Math.min(right.min, root.data));
            return self;
        }


        public static void main(String[] args) {
            Validate_binary_search_tree obj=new Validate_binary_search_tree();
            System.out.println(obj.isbst());
        }




}
