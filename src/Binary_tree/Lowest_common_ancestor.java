package Binary_tree;

public class Lowest_common_ancestor {
    Scanner sc=new Scanner(System.in);
    class node{
        int data;
        node left;
        node right;
    }
    private node root;
    public IsBallanced_binaryTree(){
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
    class isbalancepair{
        int ht=-1;
        boolean isbal=true;
    }
    public boolean isbalanced(){
        return isbalanced(this.root).isbal;
    }
    private isbalancepair isbalanced(node root){
        if(root==null){
            return new isbalancepair();
        }
        isbalancepair lbp=isbalanced(root.left);
        isbalancepair rbp=isbalanced(root.right);
        isbalancepair sbp=new isbalancepair();
        sbp.ht=Math.max(lbp.ht,rbp.ht)+1;
        int bf=Math.abs(lbp.ht-rbp.ht);
        sbp.isbal= lbp.isbal && rbp.isbal && bf<=1;
        return sbp;
    }
    public static void main(String[] args) {
        IsBallanced_binaryTree obj=new IsBallanced_binaryTree();
        System.out.println(obj.isbalanced());
    }
}
