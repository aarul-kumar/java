package BinaryTree;

public class TransformToSumTree {
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

        public static int transform(Node root) {
            if (root == null) {
                return 0;
            }
            int leftChild = transform(root.left);
            int rightChild = transform(root.right);
            int data = root.data;
            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;
            root.data = newLeft + leftChild + newRight + rightChild;
            return data;
        }

        public static void preOrder(Node root){
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.transform(root);
        BinaryTree.preOrder(root);
    }
}
