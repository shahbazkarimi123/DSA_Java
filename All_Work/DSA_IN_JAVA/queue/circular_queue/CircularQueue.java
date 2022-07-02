package All_Work.DSA_IN_JAVA.queue.circular_queue;

import All_Work.DSA_IN_JAVA.queue.QueueEmptyException;
import All_Work.DSA_IN_JAVA.queue.QueueFullException;

public class CircularQueue {
    private int data[];
    private int front;
    private int rear;
    private int size;
    public CircularQueue(){
        data=new int[5];
        front=-1;
        rear=-1;
        size=0;
    }
    public CircularQueue(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public int size(){
        return size;

    }
    public boolean isEmpty(){
        return size==0;
    }
    public void enqueue(int elem)throws QueueFullException{
        if(size==data.length){
            throw new QueueFullException();
        }
        if(size==0){
            front=0;
        }
        rear=(rear+1)% data.length;
        data[rear]=elem;
        size++;


    }
    public int dequeue()throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        
        front=(front+1)% data.length;
        
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }

        return temp;


    }
    public int front()throws QueueEmptyException{
        if(size==0){
            throw new QueueEmptyException();
        }
        return data[front];
    }
}
