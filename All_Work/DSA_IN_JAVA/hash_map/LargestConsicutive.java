package All_Work.DSA_IN_JAVA.hash_map;
import java.util.ArrayList;
import java.util.HashMap;
public class LargestConsicutive {
    public static ArrayList<Integer> largestConsicutive(int[] arr){
        HashMap<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> arrList=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],true);

        }
        int start=0;
        int end=0;
        int largeValue=0;
        int previous =0;
        int startHolder=0;
        int endHolder=0;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                int j=0;
                int n=arr[i];
                start=arr[i];
                while(j<arr.length){
                    if(map.get(n+1)){
                        largeValue++;
                        map.put(n+1,false);
                        start=n+1;
                    }else if(map.get(n-1)){
                        map.put(n-1,false);
                        largeValue++;
                        start=n-1;
                    }else{
                        if(largeValue>previous){
                            endHolder=end;
                            startHolder=start;
                            previous=largeValue;
                            largeValue=0;
                        }
                    }
                    j++;
                }
            }
        }
        arrList.add(startHolder);
        arrList.add(endHolder);

        return arrList;
    }
    public static void main(String[] args){
        int[] arr={2,3,7,1,9,8,5,6};
        ArrayList<Integer> arrList = new ArrayList<>();

        arrList=largestConsicutive(arr);
        for(int i:arrList){
            System.out.print(i+" ");
        }

    }
    
}
