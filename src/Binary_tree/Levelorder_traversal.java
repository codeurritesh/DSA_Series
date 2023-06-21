package Binary_tree;
import java.util.*;
public class Levelorder_traversal {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public Levelorder_traversal(){
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
        public void levelorder(){
            levelorder(this.root);
        }
        private void levelorder(node root){
            Queue<node> queue=new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                node item=queue.remove();
                System.out.print(item.data+" ");
                if(item.left!=null){
                    queue.add(item.left);
                }
                if(item.right!=null) {
                    queue.add(item.right);
                }
            }

        }

        public static void main(String[] args) {
            Levelorder_traversal obj=new Levelorder_traversal();
            obj.levelorder();
        }
}
