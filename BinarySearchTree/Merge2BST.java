package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Merge2BST {
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

    public static void inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        int i1 = 0;
        int i2 = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i1 < arr1.size() && i2 < arr2.size()) {
            if (arr1.get(i1) < arr2.get(i2)) {
                arr.add(arr1.get(i1));
                i1++;
            } else {
                arr.add(arr2.get(i2));
                i2++;
            }
        }
        while (i1 < arr1.size()) {
            arr.add(arr1.get(i1));
            i1++;
        }
        while (i2 < arr2.size()) {
            arr.add(arr2.get(i2));
            i2++;
        }
        return arr;
    }

    public static Node balancedBST(ArrayList<Integer> arr, int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = st + (end - st) / 2;
        Node root = new Node(arr.get(mid));
        root.left = balancedBST(arr, st, mid - 1);
        root.right = balancedBST(arr, mid + 1, end);
        return root;
    }

    public static Node mergeBST(Node root1, Node root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        inorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        inorder(root2, arr2);
        ArrayList<Integer> arr = merge(arr1, arr2);
        Node root = balancedBST(arr, 0, arr.size() - 1);
        return root;
    }

    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes1[] = { 2, 1, 4 };
        int nodes2[] = { 9, 3, 12 };
        Node root1 = null;
        Node root2 = null;
        for (int node : nodes1) {
            root1 = insert(root1, node);
        }
        for (int node : nodes2) {
            root2 = insert(root2, node);
        }
        Node root = mergeBST(root1, root2);
        levelOrder(root);
    }
}
