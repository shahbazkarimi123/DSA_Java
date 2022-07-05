package All_Work.DSA_IN_JAVA.queue.linked_list_queue;

public class QueueUsigLL <T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;
    public QueueUsigLL(){
        front=null;
        rear=null;
        size=0;
    }
    public int size(){
        return size;

    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(T elem){
        Node<T> currentNode=new Node<>(elem);
        if(rear==null){
            rear=currentNode;
            front=currentNode;
        }else{
            rear.next=currentNode;
            rear=currentNode;
        }

        size++;

    }
    public T front()throws QueueEmptyException{
        if(front==null){
            throw new QueueEmptyException();
        }
        return front.data;

    }
    public T dequeue()throws QueueEmptyException{
        if(front==null){
            throw new QueueEmptyException();
        }
        T temp=front.data;
        front=front.next;
        if(front==null){
            rear=null;
        }
        size--;
        return temp;
             
    }
    
}
