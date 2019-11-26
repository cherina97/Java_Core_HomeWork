import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Map <K, V> extends MyEntry<K, V> {

    private LinkedHashMap <K, V> map;

    public Map(K k, V v) {
        super(k, v);
        this.map = new LinkedHashMap<K, V>();
        this.map.put(k, v);
    }

    public void addNewElement(K k, V v){
        map.put(k, v);
    }

    public void deleteByKey(K k){
        map.remove(k);
    }

    public void deleteByValue(V v){

        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<K, V> next = iterator.next();
            if(next.getValue().equals(v)){
                iterator.remove();
            }
        }
    }

    public void showSetOfKey(){
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<K, V> next = iterator.next();
            System.out.println(next.getKey().toString());
        }
    }

    public void showListOfValue(){
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<K, V> next = iterator.next();
            System.out.println(next.getValue().toString());
        }
    }

    public void showAllMap(){
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<K, V> next = iterator.next();
            System.out.println(next.getKey().toString() + " ---- " + next.getValue().toString());
        }
    }
}
