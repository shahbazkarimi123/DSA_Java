package All_Work.DSA_IN_JAVA.hash_map;
import java.util.HashMap;
public class UniqueChar {
    public static String uinqueChar(String str){
        HashMap<Character,Boolean> map = new HashMap<>();
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }else{
                newStr+=str.charAt(i);
            }
            map.put(str.charAt(i),true);

        }
        return newStr;
    }


    public static void main(String[] args){
        String str = uinqueChar("codingninja");
        System.out.print(str);

    }
    
}