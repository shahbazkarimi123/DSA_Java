package All_Work.BST2;

import java.util.Scanner;

class BSTChaker{
    int min;
    int max;
    boolean isBST;
    int height;
    BSTChaker(int min,int max,boolean isBST,int height){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
        this.height = height;
    }

}
class BinaryTreeNode<T>{
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(T data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class LargestBST {
    public static BinaryTreeNode<Integer> createNode(boolean isRoot,int present,boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data: ");
        }else if(isLeft){
            System.out.println("Left data of: "+present);
        }else{
            System.out.println("Rigt data of: "+present);
        }
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        if(data == -1){
            
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> left = createNode(false,data,true);
        BinaryTreeNode<Integer> right = createNode(false,data,false);
        root.left = left;
        root.right = right;
        
        return root;

    }
    public static BSTChaker largestBST(BinaryTreeNode<Integer> root){
        if(root==null){
            return new BSTChaker(Integer.MAX_VALUE, Integer.MIN_VALUE, true, 0);
        }
        BSTChaker left = largestBST(root.left);
        BSTChaker right = largestBST(root.right);
        if(left.max<root.data && right.min>root.data){
            return new BSTChaker(Math.min(root.data,left.min), Math.max(root.data,right.max), true, left.height+right.height+1);

        }
        return new BSTChaker(Integer.MAX_VALUE, Integer.MIN_VALUE, false, Math.max(left.height,right.height));

    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root = createNode(true,0,false);
        BSTChaker check = largestBST(root);
        System.out.print(check.height);

    }

    
}
