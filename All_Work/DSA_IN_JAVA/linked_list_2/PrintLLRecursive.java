package All_Work.DSA_IN_JAVA.linked_list_2;

import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;

    }


}
public class PrintLLRecursive {
    
    public static void printReverse(Node<Integer> head){
        if(head==null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void print(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head=null,tail=null;
        while(data!= -1){
            Node<Integer> currentNode=new Node<Integer>(data);
            if(head ==null){
                head=currentNode;
                tail=currentNode;
            }else{
                tail.next=currentNode;
                tail=currentNode;
            }
            data=s.nextInt();

        }
        s.close();
        return head;

        
    }
    public static void main(String[] args){
        Node<Integer> head=takeInput();
        print(head);
        System.out.println();
        printReverse(head);

    }
    
}
