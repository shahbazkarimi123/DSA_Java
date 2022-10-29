package All_Work.DSA_IN_JAVA.tries_and_huffman;

class TrieNode{
    char data;
    boolean isTerminal;
    TrieNode children[];
    public TrieNode(char data){
        this.data=data;
        this.isTerminal=false;
        this.children= new TrieNode[26];
    }
}
public class Tries {
    private TrieNode root;
    public Tries(){
        root = new TrieNode('\0');
    }
    
    private void addHelper(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if(child==null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex]=child;
        }
        addHelper(child,word.substring(1));
    }


    public void add(String word){
        addHelper(root,word);

    }
    public boolean searchHelper(TrieNode root,String word){
        if(word.length()==0){
            return root.isTerminal;
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return searchHelper(child, word.substring(1));
    }

    public boolean search(String word){
        return searchHelper(root,word);

    }
    public void removeHelper(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminal=false;
            return;
        }
        int childIndex = word.charAt(0)-'A';
        TrieNode child = root.children[childIndex];
        if(child==null){
            return;
        }
        removeHelper(child, word.substring(1));

    }

    public void remove(String word){
        removeHelper(root,word);
    }
    
    
}
