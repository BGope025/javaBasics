import java.util.LinkedList;

// HashMap implimentation
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
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets =  new LinkedList[4];
            for (int i=0; i<4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        // to return hash code
        private int HashFunct(K key) {
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

        // to increase the size of the array to avoid larger LinkedList
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
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
            int di = HashFunct(key);
            int bi = HashSearch(key, di);
            if (bi == -1) {
                buckets[bi].add(new Node(key, val));
                n++;
            }
            else {
                Node node = buckets[bi].get(di);
                node.val = val;
            }
            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public static void main() {

        }
    }
}
