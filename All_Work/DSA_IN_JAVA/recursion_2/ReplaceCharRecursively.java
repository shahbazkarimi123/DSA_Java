package All_Work.DSA_IN_JAVA.recursion_2;

public class ReplaceCharRecursively {
    public static String replaceX(String st){
        if(st.length()==1){
            return st;
        }
        char firstChar=st.charAt(0);
        String smallOutput=replaceX(st.substring(1));
        if(firstChar=='a'){
            return 'x'+smallOutput;
        }else{
            return firstChar+smallOutput;
        }
    }
    public static void main(String[] args){
        String st="abrabmab";
        String output = replaceX(st);
        System.out.println(output);
    }

    
}
