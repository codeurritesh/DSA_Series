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

        public void rightview(){
             rightview(this.root,0);
        }
        static int maxdepth=-1;
        private void rightview(node root,int cdepth) {//O(n^2)
            if (root == null) {
                return;
            }
            if (cdepth > maxdepth) {
                System.out.println(root.data);
                maxdepth=cdepth;
            }
            rightview(root.right,cdepth+1);
            rightview(root.left,cdepth+1);


        }

        public static void main(String[] args) {
            BInary_Tree_Right_Side_View obj=new BInary_Tree_Right_Side_View();
            obj.rightview();
        }
    }


