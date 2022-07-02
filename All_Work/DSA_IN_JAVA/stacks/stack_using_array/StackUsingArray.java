package All_Work.DSA_IN_JAVA.stacks.stack_using_array;

public class StackUsingArray {
    private int data[];
    private int topIndex;
    StackUsingArray(){
        data=new int[2];
        topIndex=-1;

    }
    //O(1)
    public void push(int elem){
        if(topIndex== data.length-1){
            // StackFullException e=new StackFullException();
            // throw e;
            doubleCapacity();
        }
        data[++topIndex]=elem;
        
    }
    private void doubleCapacity() {
        System.out.println("Double the capacity");
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];
        }

    }
    //O(1)
    public boolean isEmpty(){
        return topIndex==-1;
    }
    //O(1)
    public int size(){
        return topIndex+1;
    }
    //O(1)
    public int top() throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        return data[topIndex+1];

    }
    //O(1)
    public int pop()throws StackEmptyException{
        if(topIndex==-1){
            throw new StackEmptyException();
        }
        int temp=data[topIndex];
        topIndex--;
        return temp;


    }
    
}
