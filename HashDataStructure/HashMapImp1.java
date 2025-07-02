import java.util.LinkedList;

// HashMap implitation
public class HashMapImp1 {
    static class HashMap<K,V> {
        private K key;

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
        private int HashSearch(int N, int di) {
            LinkedList<Node> ll = new LinkedList();
            for (int i=0; i<ll.size(); i++) {
                if (ll.get(i).key == key)
                    return i;
            }
            return -1;
        }

        public void put(K key, V val) {
            int di = HashFunct(key);
            int bi = HashSearch(N, di);
            if (bi == -1) {

            }
            else {

            }
        }

        public static void main() {

        }
    }
}
