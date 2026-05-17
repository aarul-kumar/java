package BinaryTree;

import java.util.ArrayList;

public class LowestCommonAncestor {
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

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {
            if (root == null) {
                return false;
            }
            path.add(root);
            if (root.data == n) {
                return true;
            }
            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);
            if (foundLeft || foundRight) {
                return true;
            }
            path.remove(path.size() - 1);
            return false;
        }

        public static Node lca(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();
            getPath(root, n1, path1);
            getPath(root, n2, path2);
            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }
            Node lca = path1.get(i - 1);
            return lca;
        }

        public static Node lca2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftlca = lca2(root.left, n1, n2);
            Node rightlca = lca2(root.right, n1, n2);
            if (leftlca == null) {
                return rightlca;
            }
            if (rightlca == null) {
                return leftlca;
            }
            return root;
        }
    }
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(BinaryTree.lca2(root, 4, 6).data);
    }
}
