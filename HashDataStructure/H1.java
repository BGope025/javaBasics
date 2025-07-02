import java.util.HashMap;
import java.util.Scanner;

// wap to find all the elements in an array which appears more than n/3 times
public class H1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        // taking the set of numbers
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("enter the elements");
        for (int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }

        // segregating data into HashMap as key-num ; value-frequency
        for (int i=0; i<num.length; i++) {
            if (map.containsKey(num[i])) {
                map.put(num[i], map.get(num[i]) + 1);
            }
            else {
                map.put(num[i], 1);
            }
        }

        // to get the elements which are repeated more than n/3 times
        for (int key: map.keySet()) {
            if (map.get(key) > n/3)
                System.out.print(key+"\t");
        }
        System.out.println();
    }
}