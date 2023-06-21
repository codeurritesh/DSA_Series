package Binary_tree;
import java.util.*;
public class Postorder_traversal {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public Postorder_traversal(){
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
        public void Postorder(){
            postorder(this.root);
        }
        private void postorder(node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }

        public static void main(String[] args) {
            Postorder_traversal obj=new Postorder_traversal();
            obj.Postorder();
        }
    }


