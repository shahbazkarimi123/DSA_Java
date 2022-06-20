package All_Work.DSA_IN_JAVA.recursion_1;

public class NumberOfDigits {
    public static int numberOfDigits(int n){
        if(n==0){
            return 0;
        }
        
        int smallOutput= 1+numberOfDigits(n/10);
        return smallOutput;
    }
    public static void main(String[] args){
        int n=45401;
        
        int result=numberOfDigits(n);
        System.out.println(result);
    }

}
