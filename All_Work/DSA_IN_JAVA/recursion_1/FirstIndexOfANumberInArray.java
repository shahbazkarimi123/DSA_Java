package All_Work.DSA_IN_JAVA.recursion_1;

public class FirstIndexOfANumberInArray {
    public static int firstIndexOfNumber(int arr[],int n){
        if(arr.length==1 && arr[0]!=n){
            return -1;
        }
        if(arr[0]==n){
            return 0;
        }
        int[] smallOutput=new int[arr.length-1];
        for(int i=0;i<smallOutput.length;i++){
            smallOutput[i]=arr[i+1];
        }
        int check = firstIndexOfNumber(smallOutput, n);
        if(check == -1){
            return -1;
        }else{
            return 1+check;
        }

    }
    public static void main(String[] args){
        int[] n={4,5,4,5,0,1};
        
        int result=firstIndexOfNumber(n,8);
        System.out.println(result);
    }
    
}
