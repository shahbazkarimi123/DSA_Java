package All_Work.DSA_IN_JAVA.stacks.stack_using_Linked_List;

import All_Work.DSA_IN_JAVA.stacks.stack_using_array.StackEmptyException;

public class StackUsingLL <T>{
    private Node<T> head ;
    private int size;
    public StackUsingLL(){
        head=null;
        size=0;
    }

    public int size(){
        return size;

    }
    public boolean isEmpty(){
        return size==0;

    }
    public void push(T elem){
        
        if(head==null){
            head=new Node<T>(elem);
        }else{
            Node<T> temp=new Node<T>(elem);
            temp.next=head;
            head=temp;

        }
        size++;
        

    }
    
    public T top() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;

    }
    public T pop() throws StackEmptyException{
        if(head==null){
            throw new StackEmptyException();
        }
        Node<T> temp=head;
        if(head!=null){
            head=head.next;
        }
        size--;
        return temp.data;

    }


    
}
