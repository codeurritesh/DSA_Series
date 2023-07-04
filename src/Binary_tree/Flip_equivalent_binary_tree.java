package Binary_tree;

import java.util.Scanner;

public class Flip_equivalent_binary_tree {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root1;
        private node root2;
        public Flip_equivalent_binary_tree(){
            this.root1=createtree();
            this.root2=createtree();
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

        public boolean isflip(){
            return isflip(this.root1,this.root2);
        }
        private boolean isflip(node root1,node root2){
            if(root1==null&&root2==null){
                return true;
            }
            if(root1==null||root2==null){
                return false;
            }
            if(root1.data!= root2.data){
                return false;
            }
            boolean flip=isflip(root1.left,root2.right)&&isflip(root1.right,root2.left);
            boolean noflip=isflip(root1.left,root2.left)&&isflip(root1.right,root2.right);
            return flip||noflip;
        }
        public static void main(String[] args) {
            Mirror_Binary_tree obj=new Mirror_Binary_tree();
            System.out.println(obj.mirror());
        }
    }


