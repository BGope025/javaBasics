package Strings;
import java.util.*;
public class S3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String str=sc.nextLine();
        System.out.println("enter the word to search");
        String s=sc.next();
        int c=0,i=0;
        while(true){
            i=str.indexOf(s,i);
            if(i==-1) break;
            c++;
            i++;
        }
        System.out.println("no of occurrences..."+c);
    }
}
