import java.util.LinkedList;
import java.util.Scanner;

// wap to find and delete the nth Node from the end of LinkedList
public class LL3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many inputs");
        int n = sc.nextInt();

        // taking input
        System.out.println("Enter the elements");
        for (int i=0; i<n; i++) {
            int k = sc.nextInt();
            list.add(k);
        }

        // taking the term to delete
        System.out.println("Enter the value of n");
        int k = sc.nextInt();

        // performing deleting operation
        if (k <= n)
            list.remove(n-k);
        else
            System.out.println("incorrect index input");

        // printing the updated list
        for (Object i : list)
            System.out.print(i+"\t");
        System.out.println();
    }
}
