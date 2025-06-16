import java.util.LinkedList;
import java.util.Scanner;

// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
public class LL2 {
    LinkedList<Integer> list= new LinkedList<>();

    // adding elements
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many inputs");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i=0; i<n; i++) {
            int k = sc.nextInt();
            if (k<=50)
                list.add(k);
            else {
                System.out.println("enter no up to 50");
                i--;
            }
        }
    }

    // deleting elements greater than 25
    public void delete() {
        for (int i=0; i< list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
            }
        }
    }

    // printing the final list
    public void print() {
        for (int i : list)
            System.out.println(i);
    }

    public static void main(String[] args) {
        LL2 obj = new LL2();
        obj.input();
        obj.delete();
        obj.print();
    }
}
