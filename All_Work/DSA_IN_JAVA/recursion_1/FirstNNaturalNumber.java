package All_Work.DSA_IN_JAVA.recursion_1;

public class FirstNNaturalNumber {
    public static void firstNNaturalNumber(int n){
        if(n==0){
            return;
        }
        firstNNaturalNumber(n-1);
        System.out.print(n+" ");
        
        
    }
    public static void main(String[] args){
        int n=20;
        
        firstNNaturalNumber(n);
        // System.out.println(result);
    }
    
}
