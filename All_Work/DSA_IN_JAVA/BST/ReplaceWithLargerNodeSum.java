package All_Work.DSA_IN_JAVA.BST;

import java.util.Scanner;

public class ReplaceWithLargerNodeSum {
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
    public static void print(BinaryTreeNode<Integer> node){
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
        print(node.left);
        print(node.right);
    }
    public static int findSum(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int left = findSum(root.left);
        int right = findSum(root.right);
        int sum = root.data + left+right;
        return sum;
    }
    public static int replace(BinaryTreeNode<Integer> root,int sum){
        if(root==null){
            return sum;
        }
        sum = replace(root.left, sum);
        sum = sum-root.data;
        root.data+=sum;
        sum = replace(root.right, sum);
        return sum;
    }
    public static void largeNodeSum(BinaryTreeNode<Integer> root){
        int sum = findSum(root);
        replace(root,sum);
        System.out.print("Sum is "+sum);

    }


    public static void main(String[] args){
        BinaryTreeNode<Integer> root = createNode(true, 0, false);
        largeNodeSum(root);
        print(root);

    }
    
}
