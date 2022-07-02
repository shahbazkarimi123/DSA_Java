package All_Work.DSA_IN_JAVA.stacks.stack_using_array;

public class StackUse {
    public static void main(String[] args)throws StackEmptyException{
        StackUsingArray stack=new StackUsingArray();
        int arr[]={4,2,1,8,0,9};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(! stack.isEmpty()){
            System.out.println(stack.pop());
        }
        // stack.push(10);
        // stack.top();
        // stack.pop();    
        // stack.size();
        // stack.isEmpty();

    }
    
}
