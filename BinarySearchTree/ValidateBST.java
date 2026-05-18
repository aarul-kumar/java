package BinarySearchTree;

public class ValidateBST {
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

    public static boolean validateBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return validateBST(root.left, min, root) && validateBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int node : nodes) {
            root = insert(root, node);
        }
        System.out.println(validateBST(root, null, null));
    }
}
