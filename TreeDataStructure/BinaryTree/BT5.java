// wap to return if the subTree is a subtree of tree
public class BT5 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // building tree
    static class BinaryTree {
        private int idx;

        public Node buildTree(int[] nodes) {
            idx = -1; // reset before starting build
            return build(nodes);
        }

        private Node build(int[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = build(nodes);
            newNode.right = build(nodes);
            return newNode;
        }
    }

    // to identify if it is a subtree or not
    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) // base case
            return true;
        if (root == null || subRoot == null) // base case
            return false;

        if (root.data != subRoot.data) // check case
            return false;
        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    // to find if the presence of the root and further the subtree
    public static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) // base case
            return true;

        if (root == null) // corner case
            return false;

        if (root.data == subRoot.data && isIdentical(root, subRoot)) // index of subtree found & check for confirming if the whole subtree is present
                return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); // declaring tree
        BinaryTree subTree = new BinaryTree(); // declaring subtree

        // putting data into tree
        int[] nodeTree = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = tree.buildTree(nodeTree);

        // putting data into subtree
        int[] nodeSubTree = {2, 4, -1, -1, 5, -1, -1};
        Node subRoot = subTree.buildTree(nodeSubTree);

        // running the code to check for the presence of subtree in tree
        if (isSubtree(root, subRoot))
            System.out.println("It's a sub-tree");
        else
            System.out.println("It's NOT a sub-tree");
    }
}
