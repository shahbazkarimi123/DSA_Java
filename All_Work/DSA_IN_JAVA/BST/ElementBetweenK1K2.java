package All_Work.DSA_IN_JAVA.BST;

import java.util.Scanner;

public class ElementBetweenK1K2 {
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
    public static void elementBetweenK1K2(BinaryTreeNode<Integer> root, int k1,int k2){
        if(root==null){
            return;
        }
        elementBetweenK1K2(root.left, k1, k2);
        elementBetweenK1K2(root.right, k1, k2);
        if(root.data>k1 && root.data<k2){
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args){
        BinaryTreeNode<Integer> root = createNode(true, 0, false);
        elementBetweenK1K2(root,3,10);
    }
    
}
