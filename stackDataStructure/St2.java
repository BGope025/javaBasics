import java.util.Stack;

// wap to reverse a stack
public class St2 {
    public static void bottomPush(Stack<Integer> s, int data) {
        if (s.isEmpty()) { // base case
            s.push(data);
            return;
        }
        int k = s.pop();
        bottomPush(s, data);
        s.push(k);
    }
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) // base case
            return;
        int k = s.pop();
        reverse(s);
        bottomPush(s, k);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();

        // adding data
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // performing reversal
        reverse(s);

        // printing the reversed stack
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
