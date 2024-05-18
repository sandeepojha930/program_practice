import java.util.LinkedHashMap;
import java.util.Map;

    public class  LRUCache<K, V> extends LinkedHashMap<K,V>{

        int capacity;

        public LRUCache(int capacity){
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return capacity< size();
        }

        public static void main(String[] args) {
            int capacity =3;
            LRUCache<String, Integer> lruCache = new  LRUCache<>(capacity);
            lruCache.put("B", 2);
           lruCache.put("G", 4);
            lruCache.put("A", 3);
            System.out.println(lruCache);

            lruCache.get("B");
            lruCache.put("H", 5);
            System.out.println(lruCache);
        }
}
