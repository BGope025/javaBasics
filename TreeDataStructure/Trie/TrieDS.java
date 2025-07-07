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
        // creating duplicate node to avoid error
        Node curr = root;
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a'; // getting index of the character
            // checking for it's presence
            if (curr.children[idx] == null) { // if not found
                // add new node
                curr.children[idx] = new Node();
            }
            // if the end of a word is reached
            if (i == word.length()-1) {
                curr.children[idx].eow = true;
            }

            // updating root
            curr = curr.children[idx];
        }
    }

    // searching data in the trie
    public static boolean search(String word) {
        // creating duplicate node to avoid error
        Node curr = root;
        for (int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            // if the last letter reached
            if (curr.children[idx] == null) {
                return false;
            }

            // if the last index of the word is reached but the index is not the end of the word
            if (idx == word.length()-1 && !curr.children[idx].eow) {
                return false;
            }

            // updating node
            curr = curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] word = {"the", "a", "there", "their", "any"};

        // insert function call
        for (String k: word) {
            insert(k);
        }

        // search function called
        System.out.println(search("there"));
        System.out.println(search("thor"));
        System.out.println(search("any"));
    }
}
