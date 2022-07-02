package All_Work.DSA_IN_JAVA.linked_list_2;

import java.util.Scanner;

class LinkedListNode<T>{
    T data;
    LinkedListNode<T> next;
    LinkedListNode(T data){
        this.data=data;
    }
}
public class MergeSortLL {
    public static LinkedListNode<Integer> sort(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        LinkedListNode<Integer> t1=head1,t2=head2;
        LinkedListNode<Integer> head=null,tail=null;
        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1 != null && t2 !=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }else{
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        if(t1!=null){
            tail.next=t1;
        }else{
            tail.next=t2;
        }
        return head;
    }
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        LinkedListNode<Integer> slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head==null){
            return head;
        }
        LinkedListNode<Integer> head2=null,head1=null;
        LinkedListNode<Integer> mid=head;
        mid=midPoint(head);
        
        
        head2=mid.next;
        mid.next=null;
        head1= mergeSort(head);
        head2=mergeSort(head2);
        head = sort(head1,head2);

		return head;
	}
    public static LinkedListNode<Integer> createNode(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        LinkedListNode<Integer> head=null,tail=null;
        while(data != -1){
            LinkedListNode<Integer> currentNode=new LinkedListNode<>(data);
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
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        print(head.next);
    }
    public static void main(String[] args){

        LinkedListNode<Integer> head=createNode();
        print(head);
        head=mergeSort(head);
        print(head);
    }
}
