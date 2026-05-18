package BinarySearchTree;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printInRange(Node root, int n1, int n2) {
        if (root == null) {
            return;
        }
        if (root.data >= n1 && root.data <= n2) {
            printInRange(root.left, n1, n2);
            System.out.print(root.data + " ");
            printInRange(root.right, n1, n2);
        } else if (root.data < n1) {
            printInRange(root.right, n1, n2);
        } else {
            printInRange(root.left, n1, n2);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int node : nodes) {
            root = insert(root, node);
        }
        printInRange(root, 5, 12);
    }
}
