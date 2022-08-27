package All_Work.BST2;
import java.util.ArrayList;
import java.util.Scanner;

import All_Work.DSA_IN_JAVA.binary_trees_1.binaryTree.BinaryTreeNode;

public class FindPathInBST {
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
    public static ArrayList<Integer> findPathInBST(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer> data = new ArrayList<>();
            data.add(root.data);
            return data;
        }
        ArrayList<Integer> output = findPathInBST(root.left, x);

        if(output!=null){
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> outputRight = findPathInBST(root.right, x);
        if(outputRight!=null){
            outputRight.add(root.data);
            return outputRight;
        }
        return null;
    }

    public static void main(String[] args){
        BinaryTreeNode<Integer> root = createNode(true, 0, false);
        ArrayList<Integer> arrList=findPathInBST(root, 7);
        for(int i:arrList){
            System.out.print(i+" ");
        }

    }
}
