import java.util.HashSet;
import java.util.Scanner;

// wap to find the intersection of two sets
public class H3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

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
        System.out.println("enter the first set");
        for (int i=0; i<m; i++) {
            arr2[i] = sc.nextInt();
            set.add(arr2[i]);
        }

        // taking intersection
        for (int i=0; i<n; i++) {
            if (set.contains(arr1[i]))
                intersection.add(arr1[i]);
        }

        // printing
        System.out.println("The intersection of two sets is- \n"+intersection);

    }
}
