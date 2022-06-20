package All_Work.DSA_IN_JAVA.recursion_1;

public class LastIndexOfNumberInArray {
    public static int lastIndexOfNumber(int arr[],int num, int startIndex){
        if(startIndex==arr.length){
            return -1;
        }
        int smallOutput= lastIndexOfNumber(arr, num, startIndex+1);
        if(smallOutput!= -1){
            return smallOutput;
        }else{
            if(arr[startIndex]==num){
                return startIndex;
            }else{
                return -1;
            }

        }
    }
    public static void main(String[] args){
        int[] n={4,5,4,5,0};
        
        int result=lastIndexOfNumber(n,2,0);
        System.out.println(result);
    }
    
}
