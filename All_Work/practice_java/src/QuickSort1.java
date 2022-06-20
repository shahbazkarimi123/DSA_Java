package All_Work.practice_java.src;

public class QuickSort1 {
    public static int partition(int[] arr,int startIndex, int endIndex){
        int pivotElement=arr[startIndex];
        int countSmaller=0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(arr[i]<pivotElement){
                countSmaller++;
            }
        }
        int temp=arr[startIndex+countSmaller];
        arr[startIndex+countSmaller]=pivotElement;
        arr[startIndex]=temp;
        int i=startIndex;
        int j=endIndex;
        while(i<j){
            if(arr[i]<pivotElement){
                i++;
            }else if(arr[j]>pivotElement){
                j--;
            }else{
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return startIndex+countSmaller;

    }
    public static void quickSort1(int arr[], int startIndex,int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex=partition(arr,startIndex,endIndex);
        quickSort1(arr, startIndex, pivotIndex-1);
        quickSort1(arr,pivotIndex+1,endIndex);
    }
    public static void main(String[] args){
        int[] arr={6,2,8,1,0,4,3,9,11,5};
        quickSort1(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
