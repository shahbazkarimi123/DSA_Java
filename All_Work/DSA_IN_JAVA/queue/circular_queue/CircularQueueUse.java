package All_Work.DSA_IN_JAVA.queue.circular_queue;

import All_Work.DSA_IN_JAVA.queue.QueueEmptyException;
import All_Work.DSA_IN_JAVA.queue.QueueFullException;

public class CircularQueueUse {
    public static void main(String[] args){
        CircularQueue circularQueue=new CircularQueue();
        int arr[]={10,20,30,40,50,60,70};
        for(int elem:arr){
            try{
                circularQueue.enqueue(elem);

            }catch(QueueFullException e){

            }
        }
        while(! circularQueue.isEmpty()){
            try{
                System.out.println(circularQueue.dequeue());
            }catch(QueueEmptyException e){

            }
        }
    }
    
}
