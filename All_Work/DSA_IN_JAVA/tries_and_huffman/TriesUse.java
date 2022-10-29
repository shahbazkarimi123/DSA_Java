package All_Work.DSA_IN_JAVA.tries_and_huffman;

public class TriesUse {
    public static void main(String[] args){
        Tries tries=new Tries();
        tries.add("GAME");
        tries.add("AT");
        tries.add("ATE");
        System.out.println(tries.search("GAME"));
        tries.remove("GAME");
        System.out.println(tries.search("GAME"));
    }
    
}
