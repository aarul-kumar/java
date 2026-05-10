public class DoubleLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        newNode.next = null;
        tail = newNode;
    }

    public void removeFirst() {
        head = head.next;
        head.prev = null;
        size--;
    }

    public void removeLast() {
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        dll.reverse();
        System.out.println();
        dll.print();

    }
}
