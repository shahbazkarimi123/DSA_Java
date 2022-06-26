package All_Work.DSA_IN_JAVA.linked_list_2;

import java.util.Scanner;

public class DeleteNodeRecur {

    public static Node<Integer> deleteNodeRecur(Node<Integer> head, int pos){
        if(pos>0 && head==null){
            return head;
        }
        if(pos==0){
            
            return head.next;
        }else{
            Node<Integer> smallOutput=deleteNodeRecur(head.next, pos-1);
            head.next=smallOutput;
            return head;

        }

    }
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
    public static void main(String[] args){
        Node<Integer> head= takeInput();
        print(head);
        System.out.println();
        head = deleteNodeRecur(head, 4);
        //fun(head);
        print(head);
    }
    
}
