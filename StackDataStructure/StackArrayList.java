import java.util.ArrayList;

// Stack using ArrayList
public class StackArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // check for empty stack
        public static boolean isEmpty() {
            return list.isEmpty();
        }

        // push
        public static void push(int data) {
            list.add(data);
        }

        // pop
        public static int pop() {
            if (isEmpty()) // corner case
                return -1;
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) // corner case
                return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);

        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
}
