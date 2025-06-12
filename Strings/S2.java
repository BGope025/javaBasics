// wap to take a word from the user and replace vowels with the next alphabet
package Strings;
import java.util.*;
public class S2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String str =sc.next();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if("AEIOUaeiou".indexOf(s)>0){
                int k=1+(int)s;
                sb.setCharAt(i,(char)k);
            }
        }
        System.out.println(sb);
    }
}
