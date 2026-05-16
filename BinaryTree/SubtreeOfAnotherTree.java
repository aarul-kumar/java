package BinaryTree;

public class SubtreeOfAnotherTree {
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

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        public static boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                return false;
            }
            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int nodes1[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes2[] = { 2, 4, -1, -1, 5, -1, -1 };
        Node root = BinaryTree.buildTree(nodes1);
        BinaryTree.idx = -1;
        Node subRoot = BinaryTree.buildTree(nodes2);
        System.out.println(BinaryTree.isSubtree(root, subRoot));
    }
}
