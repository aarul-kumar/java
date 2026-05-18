package BinarySearchTree;

public class MirrorBST {
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

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSubTree = mirror(root.left);
        Node rightSubTree = mirror(root.right);
        root.left = rightSubTree;
        root.right = leftSubTree;
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 10, 3, 6, 11 };
        Node root = null;
        for (int node : nodes) {
            root = insert(root, node);
        }
        inorder(root);
        System.out.println();
        root = mirror(root);
        inorder(root);
    }
}
