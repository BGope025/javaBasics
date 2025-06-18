// Queue using LinkedList
public class QueueLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        // check for empty LinkedList
        public static boolean isEmpty() {
            return head==null && tail==null;
        }

        // enqueue
        public static void add(int data) {
            Node newNode = new Node(data);

            if (tail == null) { // corner case
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) { // corner case
                System.out.println("Empty queue");
                return -1;
            }

            int t = head.data;
            if (head == tail){ // base case
                tail = null;
            }
            head = head.next;
            return t;
        }

        // peek
        public static int peek() {
            if (isEmpty()) { // corner case
                System.out.println("Empty queue");
                return -1;
            }

            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(7);
        Queue.add(8);
        Queue.add(9);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
