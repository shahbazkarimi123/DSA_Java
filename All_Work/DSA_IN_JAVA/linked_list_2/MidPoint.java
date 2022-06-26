package All_Work.DSA_IN_JAVA.linked_list_2;

import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
    }
}
public class MidPoint {
    public static int midPoint(Node<Integer> head){
        Node<Integer> slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static Node<Integer> createNode(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer> head=null,tail=null;
        while(data != -1){
            Node<Integer> currentNode=new Node<>(data);
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
    public static void main(String[] args){
        Node<Integer> head=createNode();
        print(head);
        int mid=midPoint(head);
        System.out.println(mid);
    }
    
}
