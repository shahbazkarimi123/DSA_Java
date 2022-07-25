package All_Work.DSA_IN_JAVA.BST;

public class BST {
    private BinaryTreeNode<Integer> root;
    private int size;

    private static boolean isPresentHelper(BinaryTreeNode<Integer> node,int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        if(x<node.data){
            return isPresentHelper(node.left, x);
        }else{
            return isPresentHelper(node.right, x);
        }
    }

    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node==null){
            return;
        }
        System.out.print(node.data+":");
        if(node.left!=null){
            System.out.print("L:" + node.left.data+",");
        }
        if(node.right!=null){
            System.out.print("R:"+ node.right.data);
        }
        
        System.out.println();
        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
    public void print(){
        
        printTreeHelper(root);
    }
    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node,int data){
        if(node==null){
            BinaryTreeNode<Integer> newRoot= new BinaryTreeNode<Integer>(data);
            return newRoot;
        }
        
        if(data<node.data){
            node.left=insertHelper(node.left, data);
        }else{
            node.right=insertHelper(node.right, data);
        }
        return node;
    }
    public void insert(int data){
        root = insertHelper(root,data);
    }
    
    
}
