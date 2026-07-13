import java.util.LinkedHashMap;
import java.util.Map;

//LRU cache example using LinkedHashMap to remove the least access data
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private int capacity;

    LRUCache(int capacity) {
        super(capacity, 0.75f, true); // AccessOrder need to true if we want to remove the least access element
        this.capacity = capacity;
    }

    // Need to override the removeEldestEntry if we want to remove the least access element
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> cache = new LRUCache(3);

        cache.put("Bob", 92);
        cache.put("Alice", 88);
        cache.put("Sam", 91);
        cache.put("Teach", 95);

        System.out.println(cache);
    }
}
