package All_Work.DSA_IN_JAVA.binary_trees_1;

import java.util.Scanner;

import All_Work.DSA_IN_JAVA.binary_trees_1.binaryTree.BinaryTreeNode;

public class LargestNodeInTree {
    public static int largestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestLeft=largestNode(root.left);
        int largestRight=largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft,largestRight));
    }
    public static BinaryTreeNode<Integer> takeInput(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data:");
        }else{
            if(isLeft){
                System.out.println("Enter left child: "+parentData);
            }else{
                System.out.println("Enter right child: "+parentData);
            }
        }
        Scanner s=new Scanner(System.in);
        int data = s.nextInt();
        if(data== -1){
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> leftNode= takeInput(false, data, true);
        BinaryTreeNode<Integer> rightNode= takeInput(false, data, false);
        root.left=leftNode;
        root.right=rightNode;
        return root;
    }
    public static void printNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("L"+root.left.data);
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();
        printNode(root.left);
        printNode(root.right);
        return;
    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root=takeInput(true,0,false);
        printNode(root);
        System.out.print("Largest Number: "+largestNode(root));

    }
    
}
