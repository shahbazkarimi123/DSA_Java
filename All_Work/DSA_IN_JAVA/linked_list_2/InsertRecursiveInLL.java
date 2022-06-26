package All_Work.DSA_IN_JAVA.linked_list_2;

import java.util.Scanner;

public class InsertRecursiveInLL {


    public static void print(Node<Integer> head){
        if(head==null){
            return;
        }
        System.out.printf(head.data+" ");
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
//     public static void fun(Node<Integer> start)
//     {
//         if(start == null)
//             return;
//         System.out.print( start.data); 

//         if(start.next != null )
//             fun(start.next.next);
//         System.out.print(start.data);
// }
    public static Node<Integer> insertNodeRecursive(Node<Integer> head, int elem, int pos){
        if(pos>0 && head==null){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode=new Node<>(elem);
            newNode.next=head;
            return newNode;
        }else{
            Node<Integer> smallOutput=insertNodeRecursive(head.next, elem, pos-1);
            head.next=smallOutput;
            return head;
        }
    }
    public static Node<Integer> insertLLRecursive(Node<Integer> head, int elem,int pos){
        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newHead=new Node<>(elem);
            newHead.next=head;
            return newHead;
        }else{
            Node<Integer> smallerOutput=insertLLRecursive(head.next, elem, pos-1);
            head.next=smallerOutput;
            return head;

        }
        
    }

    public static void main(String[] args){
        Node<Integer> head= takeInput();
        print(head);
        System.out.println();
        head=insertLLRecursive(head,50,4);
        //fun(head);
        print(head);
    }
    
}
