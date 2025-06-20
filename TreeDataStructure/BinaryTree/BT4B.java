import java.util.Scanner;

// // wap to find the diameter of the tree using approach 2 - O(n)
public class BT4B {
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

    static class TreeInfo {
        int ht;
        int dia;
        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }
    public static TreeInfo treeDia(Node root) {
        if (root == null) { // base case
            return new TreeInfo(0,0);
        }

        TreeInfo left = treeDia(root.left);
        TreeInfo right = treeDia(root.right);

        int currHeight = Math.max(left.ht,right.ht) + 1;

        int dia1 = left.dia;
        int dia2 = right.dia;
        int dia3 = left.ht + right.ht + 1;

        int currDia = Math.max(Math.max(dia1,dia2),dia3);

        TreeInfo info = new TreeInfo(currHeight, currDia);
        return info;
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
            System.out.println("The diameter of the tree 1 is..." + treeDia(root).dia);
        }
        else if (choice == 2) {
            root = tree.buildTree(nodes2);
            System.out.println("The diameter of the tree 2 is..." + treeDia(root).dia);
        }
        else
            System.out.println("Wrong Choice");
    }
}
