package All_Work.DSA_IN_JAVA.hash_map;
import java.util.HashMap;
public class HashMapInbult {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        //insurt
        //map.put(key,valu);
        map.put("abc",5);
        map.put("def",8);
        //to check if presence of not map.containsKey();
        if(map.containsKey("abc")){
            System.out.print("Map has abc");
        }
        if(map.containsKey("abc1")){
            System.out.println("Map does not hava abc");
        }
        //get value
        int v = map.get("abc");
        System.out.print(v);

    }
    
}
