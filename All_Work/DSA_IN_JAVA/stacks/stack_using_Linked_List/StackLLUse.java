package All_Work.DSA_IN_JAVA.stacks.stack_using_Linked_List;

import All_Work.DSA_IN_JAVA.stacks.stack_using_array.StackEmptyException;

public class StackLLUse {
    public static void main(String[] args) throws StackEmptyException{
        StackUsingLL<Integer> stack=new StackUsingLL<>();
        // stack.push(5);
        // System.out.println(stack.top());
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());
        // stack.push(9);
        // stack.push(6);
        // System.out.println(stack.top());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.top());
        int arr[] ={3,8,0,1,2,5};
        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());

        }
    }
    
}
