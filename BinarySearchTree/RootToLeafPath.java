package BinarySearchTree;

import java.util.ArrayList;

public class RootToLeafPath {
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

    public static void path(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        arr.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(arr);
        }
        path(root.left, arr);
        path(root.right, arr);
        arr.remove(arr.size() - 1);
    }

    public static void printPath(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        int nodes[] = { 8, 5, 10, 3, 6, 11, 1, 4, 14 };
        Node root = null;
        for (int node : nodes) {
            root = insert(root, node);
        }
        path(root, new ArrayList<>());
    }
}
