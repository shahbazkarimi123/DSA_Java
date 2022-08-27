package All_Work.DSA_IN_JAVA.BST;

public class ConstructBST {
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
    
    public static BinaryTreeNode<Integer> constructBSTHelper(int[] arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid = (si+ei)/2;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
        root.left = constructBSTHelper(arr, si, mid-1);
        root.right = constructBSTHelper(arr, mid+1, ei);
        return root;

    }
    public static BinaryTreeNode<Integer> constructBST(int[] arr,int n){
        
        return constructBSTHelper(arr,0,n-1);
    }
    public static void main(String[] args){
        int[] arr={8,3,2,0,4,6,3};
        BinaryTreeNode<Integer> root = constructBST(arr, arr.length);
        print(root);


    }
    
}
