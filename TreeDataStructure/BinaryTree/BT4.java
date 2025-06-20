import java.util.Scanner;

// wap to find the diameter of the tree
public class BT4 {
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

    // function to find height of a tree
    public static int treeHeight(Node root) {
        if (root == null) { // base case
            return 0;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static int treeDia(Node root) {
        if (root == null) { // base case
            return 0;
        }
        int dia1 = treeDia(root.left);
        int dia2 = treeDia(root.right);
        int dia3 = treeHeight(root.left) + treeHeight(root.right) + 1;

        return Math.max(dia3,Math.max(dia1,dia2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] nodes2 = {7, 8, 9, 4, -1, -1, -1, 5, -1, 7, 9, -1, -1, -1, 1, -1, -1};

        // taking choice
        System.out.println("Enter which tree to calculate- (1/2)");
        int choice = sc.nextInt();

        // call for calculation and print
        Node root;
        if (choice == 1) {
            root = tree.buildTree(nodes);
            System.out.println("The diameter of the tree 1 is..." + treeDia(root));
        }
        else if (choice == 2) {
            root = tree.buildTree(nodes2);
            System.out.println("The diameter of the tree 2 is..." + treeDia(root));
        }
        else
            System.out.println("Wrong Choice");
    }
}
