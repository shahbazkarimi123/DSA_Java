package All_Work.DSA_IN_JAVA.linked_list_1.linked_list_use;

import java.util.Scanner;

class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data){
        this.data=data;
    }
}

public class InsertNodeInLL {
    public static LinkedListNode<Integer> createNode(){
        Scanner s=new Scanner(System.in);
        int data = s.nextInt();
        LinkedListNode<Integer> head=null,tail=null;
        while(data!= -1){
            LinkedListNode<Integer> currentNode=new LinkedListNode<Integer>(data);
            if(head==null){
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
    public static void print(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head, int pos,int data){
        LinkedListNode<Integer> nodeToBeInserted=new LinkedListNode<Integer>(data);
        if(pos==0){
            nodeToBeInserted.next=head;
            return nodeToBeInserted;
        }else{
            int count=0;
            LinkedListNode<Integer> prev=head;
            while(count<pos-1 && prev!=null){
                count++;
                prev=prev.next;
            }
            if(prev!=null){
                nodeToBeInserted.next=prev.next;
                prev.next=nodeToBeInserted;
            }
        }
        

        return head;


    }
    public static void main(String[] args){
        LinkedListNode<Integer> head=createNode();
        print(head);
        head=insertNode(head,0,10);
        print(head);
        head=insertNode(head,4,100);
        print(head);
        head=insertNode(head,10,19);
        print(head);

    }

    
}
