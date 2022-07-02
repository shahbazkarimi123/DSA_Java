package All_Work.practice_java.src;

import java.util.Stack;

public class Test {
    public static void main (String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<10;i++)
        {
            stack.push(i*2);
        }
        System.out.print(stack.peek());
    
    }
    
}
