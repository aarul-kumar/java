package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.peekLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
}
