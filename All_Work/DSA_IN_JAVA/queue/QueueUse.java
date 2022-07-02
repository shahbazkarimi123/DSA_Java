package All_Work.DSA_IN_JAVA.queue;

public class QueueUse {
    
    public static void main(String[] args) throws QueueEmptyException{
        QueueUsingArray queue=new QueueUsingArray();
        int arr[]={6,3,6,1,9};
        for(int elem : arr){
            try{
                queue.enqueue(elem);
            }catch(QueueFullException e){

            }
            
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
    
}
