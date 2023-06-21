package Binary_tree;
import java.util.*;
public class Inorder_traversal {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public Inorder_traversal(){
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
        public void inorder(){
            inorder(this.root);
        }
        private void inorder(node root){
            if(root==null){
                return;
            }

            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void main(String[] args) {
            Inorder_traversal obj=new Inorder_traversal();
            obj.inorder();
        }
    }


