package All_Work.DSA_IN_JAVA.recursion_2;

public class QuickSort {
    public static int partition(int arr[], int si,int ei){
        int pivoteElement=arr[si];
        int countIndex=0;
        for(int i=si+1;i<=ei;i++){
            if(arr[i]<pivoteElement){
                countIndex++;
            }
        }
        int temp=arr[si+countIndex];
        arr[si+countIndex]=pivoteElement;
        arr[si]=temp;
        int i=si;
        int j=ei;
        while(i<j){
            if(arr[i]<pivoteElement){
                i++;
            }else if(arr[j]>pivoteElement){
                j--;
            }else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return si+countIndex;
        
    }
    public static void quickSort(int arr[], int si,int ei){
        if(si>=ei){
            return;            
        }
        int pivitIndex = partition(arr,si,ei);
        quickSort(arr, si, pivitIndex-1);
        quickSort(arr, pivitIndex+1, ei);
    }
    public static void main(String[] args){
        int[] n={2,5,7,4,0,1,3,6,9,8};
        
        quickSort(n,0,n.length-1);
        for(int i:n){
            System.out.print(i+" ");
        }
    }
    
}
