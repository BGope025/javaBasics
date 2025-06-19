//import java.util.Objects;
import java.util.Scanner;

// wap to check if the word is palindrome or not
public class S7 {
    public static void rev(String str, int i, String s) {
        if (i == str.length()) { // base case
            // check for palindrome
            if (str.equals(s))
                System.out.println("The word is Palindrome");
            else
                System.out.println("The word is NOT Palindrome");
            return;
        }

        // reversing word
        s= str.charAt(i)+s;
        rev(str, i+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking input
        System.out.println("Enter a word");
        String str = sc.next();
        // running for check
        rev(str, 0, "");
    }
}
