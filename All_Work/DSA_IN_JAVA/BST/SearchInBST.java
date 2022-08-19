package All_Work.DSA_IN_JAVA.BST;

import java.util.Scanner;

public class SearchInBST {
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
    public static boolean searchInBST(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            return false;
        }
        if(root.data==x){
            return true;
        }
        if(root.data>x){
            return searchInBST(root.left, x);
        }else{
            return searchInBST(root.right, x);
        
        }



    }
    public static void main(String[] args){
        BinaryTreeNode<Integer> root =createNode(true, 0, false);
        System.out.print(searchInBST(root,6));

    }
}
