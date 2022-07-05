package All_Work.DSA_IN_JAVA.queue.linked_list_queue;

public class QueueLLUse {
    public static void main(String[] args){
        QueueUsigLL<Integer> queue=new QueueUsigLL<>();
        int arr[]={10,20,30,40,50,60,70,80,90};
        for(int elem:arr){
            queue.enqueue(elem);
        }
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        while(!queue.isEmpty()){
            try{

                System.out.print(queue.dequeue()+" ");
            }catch(QueueEmptyException e){

            }
        }
        System.out.println(queue.isEmpty());
        
    }
    
}
