package All_Work.DSA_IN_JAVA.linked_list_1.linked_list_use;

import java.util.Scanner;

public class EliminateDuplicateFromLL {
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
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node<Integer> eliminateDuplicateFromLL(Node<Integer> head){
        Node<Integer> temp=head,tail=head.next;
        boolean check=false;
        while(tail!=null){
            if(tail.data!=temp.data && check==false){
                tail=tail.next;
                temp=temp.next;
            }else if(tail.data!=temp.data && check==true){
                temp.next=tail.next;
                System.out.println(temp.data);
                if(tail.next!=null){
                    tail=tail.next;

                }
                check=false;

            }else{
                tail=tail.next;
                check=true;
            }
        }
        return head;
    }
    public static void main(String[] args){
        Node<Integer> head=takeInput();
        print(head);
        head = eliminateDuplicateFromLL(head);
        print(head);


        
    }
    
}
