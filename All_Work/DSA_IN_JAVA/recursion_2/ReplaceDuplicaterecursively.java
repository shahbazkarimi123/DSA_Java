package All_Work.DSA_IN_JAVA.recursion_2;

public class ReplaceDuplicaterecursively {
    public static String replaceDuplicate(String st){
        if(st.length()==1){
            return st;
        }
        char firstChar=st.charAt(0);
        String smallOutput=replaceDuplicate(st.substring(1));
        if(firstChar==smallOutput.charAt(0)){
            return smallOutput;
        }else{
            return firstChar+smallOutput;
        }

    }

    public static void main(String[] args){
        String st="aaabbbcddd";
        String output = replaceDuplicate(st);
        System.out.println(output);
    }
    
}
