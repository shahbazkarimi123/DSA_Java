package All_Work.DSA_IN_JAVA.hash_map;

public class MapNode<K,V> {
    K key;
    V value;
    MapNode<K,V> next;
    MapNode(K key,V value){
        this.key = key;
        this.value = value;
    }
    
}
