// wap to find the sum of all the nodes
public class BT2 {
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

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) { // base case
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int addNodes(Node root) {
        if (root == null) { // base case
            return 0;
        }
        int leftNodes = addNodes(root.left);
        int rightNodes = addNodes(root.right);

        return leftNodes + rightNodes + root.data;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = tree.buildTree(nodes);

        System.out.println("The total no of nodes is..."+addNodes(root));
    }
}
