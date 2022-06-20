package All_Work.DSA_IN_JAVA.recursion_1;

public class CalculatePower {
    public static int calculatePower(int n, int x){
        if(n==0){
            return 1;
        }
        int smallOutput=x*calculatePower(n-1, x);
        return smallOutput;

    }
    public static void main(String[] args){
        int n=4;
        int x=3;
        int result=calculatePower(n,x);
        System.out.println(result);
    }
}
