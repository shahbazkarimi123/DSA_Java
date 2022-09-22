package All_Work.DSA_IN_JAVA.trees;
import java.util.Scanner;

import All_Work.DSA_IN_JAVA.queue.linked_list_queue.QueueEmptyException;
import All_Work.DSA_IN_JAVA.queue.linked_list_queue.QueueUsigLL;

import java.util.ArrayList;

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;
    TreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}
public class CreateTree {
    public static TreeNode<Integer> createNode()throws All_Work.DSA_IN_JAVA.queue.linked_list_queue.QueueEmptyException{
        System.out.println("Enter root data: ");
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        if(data==-1){
            return null;
        }
        QueueUsigLL<TreeNode<Integer>> pendingNodes = new QueueUsigLL<>();
        TreeNode<Integer> root = new TreeNode<>(data);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> node = pendingNodes.dequeue();
            System.out.println("Enter the no of children for: "+node.data);
            int countChildren = s.nextInt();
            for(int i = 0;i<countChildren;i++){
                System.out.println("Enter the "+i+"th child");
                int childData = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(childData);
                node.children.add(childNode);
                pendingNodes.enqueue(childNode);

            }
        }

        return root;

    }
    public static void printTree(TreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        for(int i=0;i<root.children.size();i++){
            System.out.print(root.children.get(i).data+" ");
        }
        System.out.println();
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> child = root.children.get(i);
            printTree(child);
        }
    }
    public static void main(String[] args) throws QueueEmptyException{
        TreeNode<Integer> root = createNode();
        printTree(root);
    }
    
}
