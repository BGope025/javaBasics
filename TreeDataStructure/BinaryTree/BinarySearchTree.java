public class BinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data) {
            this.data = data;
        }
    }

    // to insert data into the tree
    public static Node insert(Node root, int val) {
        if (root == null) { // starting case
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        }
        else {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    // to search data
    public static boolean search(Node root, int key) {
        if (root == null)
            return false;
        if (root.data == key) {
            return true;
        }
        else if (root.data > key) {
            return search(root.left, key);
        }
        else {
            return search(root.right, key);
        }
    }

    // to print all data
    public static void inOrder(Node root) {
        if (root == null) // base case
            return;

        inOrder(root.left); // print left subtree
        System.out.print(root.data+" "); // print current data
        inOrder(root.right); // print right subtree
    }

    public static void main(String[] args) {
        int value[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // input into the tree
        for (int i=0; i<value.length; i++) {
            root = insert(root, value[i]);
        }

        // output of the tree
        inOrder(root);
        System.out.println();

        // search element
        if (search(root,7))
            System.out.println("found");
        else
            System.out.println("not found");
    }
}
