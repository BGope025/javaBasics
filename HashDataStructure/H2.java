import java.util.HashSet;
import java.util.Scanner;

// wap to find the union of two sets of data
public class H2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> union = new HashSet<>();

        // taking inputs
        System.out.println("enter the no of elements in both the sets");
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        int m= sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter the first set");
        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
            set.add(arr2[i]);
        }

        // condition check
        for (int i=0; i<n; i++) {
            if (set.contains(arr1[i]))
                union.add(arr1[i]);
        }

        // printing union
        System.out.println("The union of the two sets is"+union);
    }
}
