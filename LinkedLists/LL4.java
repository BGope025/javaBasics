import java.util.LinkedList;
import java.util.Scanner;

// wap to check if the entered LinkedList is Palindrome or not
public class LL4 {
    LinkedList<Integer> list= new LinkedList<>();

    // adding elements
    public void input() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many inputs");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i=0; i<n; i++) {
            int k = sc.nextInt();
            list.add(k);
        }
    }

    // to check and print if the list is palindrome or not
    public void checkPalindrome() {
        boolean f= true;
        int n= list.size();

        for (int i=0; i<n/2; i++) {
            if (!list.get(n - i - 1).equals(list.get(i))) {
                f = false;
                break;
            }
        }
        if (f || n == 1) // condition check + corner case
            System.out.println("Palindrome list");
        else
            System.out.println("Not a Palindrome list");
    }

    public static void main(String[] args) {
        LL4 obj = new LL4();
        obj.input();
        obj.checkPalindrome();
    }
}
