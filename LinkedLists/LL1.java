import java.util.LinkedList;

// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        int c = 0;
        for (int s : list) {
            c++;
            if (s == 7)
                System.out.println("the no 7 is found at idx. "+c);
        }
    }
}
