package All_Work.DSA_IN_JAVA.recursion_2;

public class MergeSort {
    public static void merge(int a[],int b[],int arr[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                k++;
                i++;
            }else{
                arr[k]=b[j];
                j++;
                k++;
            }
        }
        if(i<a.length){
            while(i<a.length){
                arr[k]=a[i];
                i++;
                k++;
            }
        }
        if(j<b.length){
            while(j<b.length){
                arr[k]=b[j];
                k++;
                j++;
            }

        }
        
    }
    public static void mergeSort(int[] arr){
        if(arr.length<=1){
            return;
        }
        int mid=arr.length/2;
        int[] a=new int[mid];
        int[] b=new int[arr.length-a.length];
        for(int i=0;i<mid;i++){
            a[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            b[i-mid]=arr[i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);

    }
    public static void main(String[] args){
        int[] n={2,5,7,4,0,1,3,6,9,8};
        
        mergeSort(n);
        for(int i:n){
            System.out.print(i+" ");
        }
    }
    
}
