package All_Work.practice_java;

public class MyQuickSort {
    public static int partition(int arr[], int startIndex,int endIndex){
        int pivotElement=arr[startIndex];
        int countSmallerNumber=0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(arr[i]<pivotElement){
                countSmallerNumber++;
            }
        }
        int temp=arr[startIndex+countSmallerNumber];
        arr[startIndex+countSmallerNumber]=pivotElement;
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
        return startIndex+countSmallerNumber;

    }
    public static void myQuickSort(int arr[],int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int pivotIndex=partition(arr,startIndex,endIndex);
        myQuickSort(arr, startIndex, pivotIndex-1);
        myQuickSort(arr, pivotIndex+1, endIndex);
    }
    public static void main(String[] args){
        int[] arr={2,15,3,1,6,4,8,6,9,0,10,5};
        myQuickSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
