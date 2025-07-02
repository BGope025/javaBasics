import java.util.ArrayList;
import java.util.LinkedList;

// HashMap implementation
public class HashMapImp1 {
    static class HashMap<K,V> {

        private class Node {
            K key;
            V val;

            public Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets =  new LinkedList[4];
            for (int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // to return hash code
        private int HashFunction(K key) {
            int k = key.hashCode();
            return Math.abs(k)%N;
        }

        // to search for a particular key value pair int the LinkedList stored in array
        private int HashSearch(K key, int di) {
            LinkedList<Node> ll = buckets[di];
            for (int i=0; i<ll.size(); i++) {
                if (ll.get(i).key == key)
                    return i;
            }
            return -1;
        }

        // to increase the size of the array to avoid larger LinkedList, hence decreasing time complexity
        private void rehash() {
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];

            for (int i=0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i=0; i<oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j=0; j<ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.val);
                }
            }
        }

        // to check and put new data or update old data
        public void put(K key, V val) {
            int di = HashFunction(key);
            int bi = HashSearch(key, di);
            if (bi == -1) { // key doesn't exist
                buckets[di].add(new Node(key, val));
                n++;
            }
            else { // key exists
                Node node = buckets[bi].get(di);
                node.val = val;
            }

            // to check if the linkedList has got large which increases the time complexity
            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        // to check if a key is present or not in the map
        public boolean containsKey(K key) {
            int di = HashFunction(key);
            int bi = HashSearch(key, di);
            if (-1 == bi) { // key doesn't exist
                return false;
            }
            else { // key exists
                return true;
            }
        }

        // to remove a key value pair if present and return
        public V remove(K key) {
            int di = HashFunction(key);
            int bi = HashSearch(key, di);
            if (bi == -1) { // key doesn't exist
                return null;
            }
            else { // key exists
                Node node = buckets[di].remove(bi);
                n--;
                return node.val;
            }
        }

        // to get the value of a key if present
        public V get(K key) {
            int di = HashFunction(key);
            int bi = HashSearch(key, di);
             if (bi == -1) {
                 return null;
             }
             else {
                 Node node = buckets[di].get(bi);
                 return node.val;
             }
        }

        // to get the keys of the map
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for (LinkedList<Node> ll : buckets) {
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        // to check if array is empty or not
        public boolean isEmpty() {
            return n==0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 90);
        map.put("China", 190);

        ArrayList<String> keys = map.keySet();
        for (int i=0; i<keys.size(); i++) {
            System.out.println(keys.get(i)+"\t"+map.get(keys.get(i)));
        }
    }
}
