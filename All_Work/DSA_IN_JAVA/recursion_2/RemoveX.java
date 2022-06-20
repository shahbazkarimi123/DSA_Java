package All_Work.DSA_IN_JAVA.recursion_2;

public class RemoveX {
    public static String removeX(String st){
        if(st.length()==1){
            return st;
        }
        char firstChar = st.charAt(0);
        String smallOutput= removeX(st.substring(1));
        if(firstChar == 'x'){
            return smallOutput;
        }else{
            return firstChar+smallOutput;
        }
    }

    public static void main(String[] args){
        String st="abxxbxab";
        String output = removeX(st);
        System.out.println(output);
    }

    
    
}
