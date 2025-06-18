// Circular Queue using Array
public class QueueArrayCircular {
    static class Queue {
        static int[] arr;
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int n) {
            Queue.size = n;
            arr = new int[n];
        }

        // check for empty array
        public static boolean isEmpty() {
            return rear==-1 && front==-1;
        }

        // enqueue
        public static void add(int data) {
            if ((rear+1)%size == front) { // base case
                System.out.println("No space to add data");
                return;
            }
            // adding first element
            if (front == -1) { // corner case
                front = 0;
            }

            rear = (rear+1) % size;
            arr[rear] = data;
        }

        // dequeue
        public static int remove() {
            if (isEmpty()) { // corner case
                System.out.println("Empty queue");
                return -1;
            }

            int t = arr[front];
            if (rear == front)
                rear = front = -1;
            else
                front = (front+1) % size;
            return t;
        }

        // peek
        public static int peek() {
            if (isEmpty()) { // corner case
                System.out.println("Empty queue");
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String[] args) {
        new Queue(4);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        Queue.add(4);

        System.out.println(Queue.remove());
        Queue.add(5);
        System.out.println(Queue.remove());
        Queue.add(6);

        while (!Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }
    }
}
