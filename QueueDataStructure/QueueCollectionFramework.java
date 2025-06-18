import java.util.LinkedList;
import java.util.Queue;

// Queue using Collection Framework
public class QueueCollectionFramework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // or we could also use "ArrayDeque<>()"

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(7);
        q.add(8);
        q.add(9);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
