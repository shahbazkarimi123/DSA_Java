package All_Work.DSA_IN_JAVA.recursion_1;

public class SumOfArray {
    public static int sumOfArray(int[] arr){
        if(arr.length==1){
            return arr[0];
        }
        int n=arr[0];
        int[] arrNew=new int[arr.length-1];
        for(int i=0;i<arrNew.length;i++){
            arrNew[i]=arr[i+1];
        }
        int smallOUtput=n+sumOfArray(arrNew);
        return smallOUtput;
    }
    public static void main(String[] args){
        int[] n={4,5,4,0,1};
        
        int result=sumOfArray(n);
        System.out.println(result);
    }
    
}
