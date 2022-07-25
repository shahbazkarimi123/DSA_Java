package All_Work.DSA_IN_JAVA.linked_list_1.linked_list_use;

import All_Work.DSA_IN_JAVA.queue.linked_list_queue.Node;

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;

    }
    public static void print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        Node<Integer> head=createLinkedList();
        print(head);
        

    }
    
}
