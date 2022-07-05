package All_Work.DSA_IN_JAVA.binary_trees_1;

import java.util.Scanner;

import All_Work.DSA_IN_JAVA.binary_trees_1.binaryTree.BinaryTreeNode;

public class TakeBinaryTreeBetterInput {
    public static BinaryTreeNode<Integer> takeBinaryTreeBetterInput(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of "+ parentData);
            }else{
                System.out.println("Enter right child of "+ parentData);
            }
        }
        Scanner s=new Scanner(System.in);
        
        int rootData=s.nextInt();
        
        if(rootData==-1){
            
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild=takeBinaryTreeBetterInput(false, rootData, true);
        BinaryTreeNode<Integer> rightChild=takeBinaryTreeBetterInput(false, rootData, false);
        root.left=leftChild;
        root.right=rightChild;
        
        return root;
    }
    public static void printTree(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data+":");
        if(root.left!=null){
            System.out.print("L"+root.left.data+", ");
        }
        if(root.right!=null){
            System.out.print("R"+ root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);


    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeBinaryTreeBetterInput(true, 0, false);
        printTree(root);
    }
    
}
