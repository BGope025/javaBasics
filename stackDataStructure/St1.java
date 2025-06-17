import java.util.Scanner;
import java.util.Stack;

// wap to push data at the bottom of the stack
public class St1 {
    public static void bottomPush(Stack<Integer> s, int data) {
        if (s.isEmpty()) { // base case
            s.push(data);
            return;
        }
        int k = s.pop();
        bottomPush(s, data);
        s.push(k);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc =new Scanner(System.in);

        // adding data in stack
        s.push(1);
        s.push(2);
        s.push(3);

        // taking the no to push at end of stack
        System.out.println("Enter the no to be added at the bottom");
        int k = sc.nextInt();

        // performing task
        bottomPush(s, k);

        // printing stack
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
