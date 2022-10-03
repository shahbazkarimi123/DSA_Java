package All_Work.DSA_IN_JAVA.priority_Queue;
import java.util.ArrayList;
public class PriorityQueue<T> {
    private ArrayList<Element<T>> heap;
    public PriorityQueue(){
        heap = new ArrayList<>();
    }
    public void insert(T value,int priority){
        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;
        while(childIndex>0){
            if(heap.get(childIndex).priority<heap.get(parentIndex).priority){
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex,heap.get(parentIndex));
                heap.set(parentIndex,temp);
                childIndex=parentIndex;
                parentIndex=(childIndex-1)/2;
            }else{
                return;
            }
        }
    }
   
    public T getMin()throws PriiorityQueueException {
        if(isEmpty()){
            throw new PriiorityQueueException();
        }
        return heap.get(0).value;
    }
    public T removeMin()throws PriiorityQueueException{
        if(isEmpty()){
            throw new PriiorityQueueException();
        }
        Element<T> removed = heap.get(0);
        T ans = removed.value;
        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        int parentIndex=0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;
        while(leftChildIndex<heap.size()){
            int minIndex = parentIndex;
            if(heap.get(leftChildIndex).priority<heap.get(rightChildIndex).priority){
                minIndex=leftChildIndex;
            }
            if(rightChildIndex<heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)){
                minIndex=rightChildIndex;
            }
            if(minIndex==parentIndex){
                break;
            }
            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex,heap.get(parentIndex));
            heap.set(parentIndex,temp);
            parentIndex=minIndex;
            leftChildIndex=2*parentIndex+1;
            rightChildIndex=2*parentIndex+2;
        }
        return ans;
    }
    public int size(){
        return heap.size();

    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) throws PriiorityQueueException{
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        System.out.println(priorityQueue.isEmpty());
        priorityQueue.insert(20, 5);
        priorityQueue.insert(10, 8);
        priorityQueue.insert(1, 1);
        priorityQueue.insert(30, 3);
        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.isEmpty());
        priorityQueue.removeMin();
        System.out.println(priorityQueue.size());
    }
    
}
