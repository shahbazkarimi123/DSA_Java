package All_Work.DSA_IN_JAVA.priority_queue_2;
import java.util.PriorityQueue;

public class KLargestElement {
    public static void printKLargest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(pq.peek()<arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }

    }
    public static void main(String[] args){
        int arr[]={4,1,6,3,7,2,9,8};
        int k=3;
        printKLargest(arr,k);
    }
    
}
