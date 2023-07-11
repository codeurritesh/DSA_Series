package Binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder_BinaryTree_Build {
        Scanner sc=new Scanner(System.in);
        class node{
            int data;
            node left;
            node right;
        }
        private node root;
        public LevelOrder_BinaryTree_Build(){
            this.root=createtree();
        }
        private node createtree(){
            Queue<node>qq=new LinkedList<>();
            int num=sc.nextInt();
            node nn=new node();
            nn.data=num;
            qq.add(nn);
            while(!qq.isEmpty()){
                node rv=qq.poll();
                int left=sc.nextInt();
                int right=sc.nextInt();
                if(left!=-1){
                    node n=new node();
                    n.data=left;
                    rv.left=n;
                    qq.add(n);
                }
                if(right!=-1){
                    node n=new node();
                    n.data=right;
                    rv.right=n;
                    qq.add(n);
                }
            }
            return nn;
        }
    public void preorder(){
        preorder(this.root);
    }
    private void preorder(node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }


        public static void main(String[] args) {
            LevelOrder_BinaryTree_Build obj=new LevelOrder_BinaryTree_Build();
            obj.preorder();
        }


}
