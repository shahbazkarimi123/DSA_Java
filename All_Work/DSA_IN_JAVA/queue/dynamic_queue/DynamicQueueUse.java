package All_Work.DSA_IN_JAVA.queue.dynamic_queue;

import All_Work.DSA_IN_JAVA.queue.QueueEmptyException;

public class DynamicQueueUse {
    public static void main(String[] args){
        DynamicQueue dynamicQueue=new DynamicQueue(3);
        int arr[]={10,20,30,40,50,60,70};
        for(int elem:arr){
            dynamicQueue.enqueue(elem);
        }
        while(!dynamicQueue.isEmpty()){
            try{

                System.out.println(dynamicQueue.dequeue());
            }catch(QueueEmptyException e){
                
            }
        }

    }
}
