public class TrieDS {
    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26]; // a to z
            for (int i=0; i<26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    // creating new node
    static Node root = new Node();

    // inserting data into trie
    public static void insert(String word) {
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // getting index of the character
            // checking for it's presence
            if (root.children[idx] == null) { // if not found
                // add new node
                root.children[idx] = new Node();
            }
            // if the end of a word is reached
            if (i == word.length()-1) {
                root.children[idx].eow = true;
            }

            // updating root
            root = root.children[idx];
        }
    }

    // searching data in the trie
    public static boolean search(String word) {
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (root.children[idx] == null) {
                return false;
            }

            if (idx == word.length()-1 && !root.children[idx].eow) {
                return false;
            }

            root = root.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] word = {"the", "a", "there", "their", "any"};
        for (String k: word) {
            insert(k);
        }

        System.out.println(search("there"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}
