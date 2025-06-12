// wap to input a sentence and convert it into uppercase and count the no of words starting with the letter a or A
 package Strings;
import java.util.*;
public class S1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("enter a sentence");
        String str=sc.nextLine();
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            if(i==0 && str.charAt(i)=='A')
                c++;
            if(i>0 && str.charAt(i-1)==' ' && str.charAt(i)=='A')
                c++;
        }
        System.out.println("the no. of words starting with a..."+c);
    }
}