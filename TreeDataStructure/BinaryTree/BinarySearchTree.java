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

    public static Node delete(Node root, int val) {
        if (!search(root, val)) {
            System.out.println("The element to delete is not on the data");
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        }
        else if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else { // root.data == val
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            // case 3
            Node IS = inOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // to find and return the inorder successor
    public static Node inOrderSuccessor(Node root) {
        // running loop until we reach the leftmost element
        while (root.left != null) {
            root = root.left;
        }
        // returning the leftmost element
        return root;
    }

    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data+" ");
            printInRange(root.right, X, Y);
        }
        else if (root.data >= Y) {
            printInRange(root.left, X, Y);
        }
        else { // root.data <= X
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int[] value = {5, 1, 3, 4, 2, 7};
        Node root = null;

        // input into the tree
        for (int j : value) {
            root = insert(root, j);
        }

        // output of the tree
        inOrder(root);
        System.out.println();

        // search element
        if (search(root,7))
            System.out.println("found");
        else
            System.out.println("not found");

        // deleting data
        delete(root, 1);

        // output of the tree
        inOrder(root);
        System.out.println();

        // printing data in a range
        printInRange(root, 3, 5);
        System.out.println();
    }
}
