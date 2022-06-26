package All_Work.DSA_IN_JAVA.linked_list_1.linked_list_use;
import java.util.Scanner;
class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }


}

public class LinkedListCreate {
    public static Node<Integer> createNode(){
        Scanner s =new Scanner(System.in);
        Node<Integer> head=null,tail=null;
        int data = s.nextInt();
        while(data!= -1){
            Node<Integer> currentNode=new Node<Integer>(data);
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
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static int count(Node<Integer> head){
        if(head==null){
            return 0;
        }
        int smallOutput=1+count(head.next);
        return smallOutput;
    }
    public static Node<Integer> appandLastNToFirst(Node<Integer> head, int n){
        Node<Integer> temp=head,tail=head,head2=head;
        int total=count(head);
        int value=total-n;
        System.out.println(value);
        int i=0;
        while(temp.next!=null){
            if(i<value-1){
                tail=tail.next;
            }
            i++;
            temp=temp.next;
            
        }
        head2=tail.next;
        tail.next=null;
        temp.next=head;
        return head2;       

        
    }
    public static void main(String[] args){
        Node<Integer> head=createNode();
        print(head);
        Node<Integer> value=appandLastNToFirst(head,5);
        print(value);

    }
    
}
