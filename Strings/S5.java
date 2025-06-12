// wap to form a word into piglatin, add ay to it's end and convert it to uppercase
package Strings;
import java.util.*;
public class S5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String s="", str= sc.next();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length();i++){
            if("aeiouAEIOU".indexOf(str.charAt(i))==-1) {
                s = s + str.charAt(i);
                sb.delete(i,i+1);
            }
            else break;
        }
        s=(sb+s+"ay").toUpperCase();
        System.out.println(s);
    }
}
