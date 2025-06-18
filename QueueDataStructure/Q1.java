import java.util.Scanner;
import java.util.Stack;

// wap to create a Queue using 2 Stacks
public class Q1 {
    // push
    public static void add(Stack<Integer> s, int data) {
        if (s.isEmpty()) { // base case
            s.push(data);
            return;
        }
        int k = s.pop();
        add(s, data);
        s.push(k);
    }

    // pop
    public static int remove(Stack<Integer> s) {
        if (s.isEmpty()) { // corner case
            System.out.println("No data found");
            return -1;
        }
        return s.pop();
    }

    // peek
    public static int see(Stack<Integer> s) {
        if (s.isEmpty()) { // corner case
            System.out.println("No data found");
            return -1;
        }
        return s.peek();
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner sc =new Scanner(System.in);

        // taking data from the user and storing
        int i = sc.nextInt();
        System.out.println("Enter the numbers");
        for (int j=0; j<i; j++) {
            int k = sc.nextInt();
            // performing task
            add(s, k);
        }

        // printing stack
        for (int j=0; j<i; j++) {
            System.out.println(see(s));
            remove(s);
        }
    }
}
