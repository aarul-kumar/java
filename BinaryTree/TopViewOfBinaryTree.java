package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfBinaryTree {
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

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
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

        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0;
            int max = 0;
            q.add(new Info(root, 0));
            q.add(null);
            while (!q.isEmpty()) {
                Info currInfo = q.remove();
                if (currInfo == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(currInfo.hd)) {
                        map.put(currInfo.hd, currInfo.node);
                    }
                    if (currInfo.node.left != null) {
                        q.add(new Info(currInfo.node.left, currInfo.hd - 1));
                        min = Math.min(min, currInfo.hd - 1);
                    }
                    if (currInfo.node.right != null) {
                        q.add(new Info(currInfo.node.right, currInfo.hd + 1));
                        max = Math.max(max, currInfo.hd + 1);
                    }
                }
            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }
    }
    
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTree.buildTree(nodes);
        BinaryTree.topView(root);
    }
}
