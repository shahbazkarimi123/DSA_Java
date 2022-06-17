package All_Work.DSA_IN_JAVA.linked_list_1;
import java.util.ArrayList;
public class RemoveDuplicateFromArray {
    public static ArrayList<Integer> removeConsicutiveDuplicates(int[] arr){
        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={10,10,20,20,30,30,30,10};
        ArrayList<Integer> result = removeConsicutiveDuplicates(arr);
        // for(int i=0;i<result.size();i++){
        //     System.out.print(result.get(i)+" ");
        // }
        for(int i:result){
            //enhanced for loop
            System.out.print(i+" ");
        }
    }

    
}
