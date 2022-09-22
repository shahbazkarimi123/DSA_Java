package All_Work.DSA_IN_JAVA.trees;
import All_Work.DSA_IN_JAVA.queue.linked_list_queue.QueueEmptyException;
import All_Work.DSA_IN_JAVA.queue.linked_list_queue.QueueUsigLL;
import java.util.Scanner;


//import java.util.ArrayList;
// class TreeNode<T>{
//     T data;
//     ArrayList<T> children;
//     TreeNode(T data){
//         this.data = data;
//         this.children = new ArrayList<T>();
//     }
// }
public class PrintTreeLevel {
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
    public static void printLevelVise(TreeNode<Integer> root) throws QueueEmptyException{
        if(root == null){
            return;
        }
        // QueueUsigLL<TreeNode<Integer>> queue = new QueueUsigLL<TreeNode<Integer>>();
        // queue.enqueue(root);
        
            //TreeNode<Integer> front = queue.dequeue();
            for(int i=0;i<root.children.size();i++){
                TreeNode<Integer> tree = root.children.get(i);
                System.out.print(tree.data+" ");
                
            }
            if(root.children.size()>0){
                System.out.println();
            }
            for(int i=0;i<root.children.size();i++){
                TreeNode<Integer> child = root.children.get(i);
                printLevelVise(child);
            }
            
       
    }
    public static void main(String[] args) throws QueueEmptyException{
        TreeNode<Integer> root = createNode();
        printLevelVise(root);

    }
}
