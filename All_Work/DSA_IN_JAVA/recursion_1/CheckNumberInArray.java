package All_Work.DSA_IN_JAVA.recursion_1;

public class CheckNumberInArray {
    public static boolean checkNumberInArray(int arr[], int n){
        if(arr.length==1 && arr[0]!=n){
            return false;
        }
        if(arr[0]==n){
            return true;
        }
        
        int[] smallarray=new int[arr.length-1];
        for(int i=0;i<smallarray.length;i++){
            smallarray[i]=arr[i+1];

        }
        boolean check=checkNumberInArray(smallarray, n);
        return check;
    }

    public static void main(String[] args){
        int[] n={4,5,4,0,-1};
        
        boolean result=checkNumberInArray(n,-1);
        System.out.println(result);
    }
    
}
