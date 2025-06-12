// wap to find the longest word in the sentence snd it's length
package Strings;
import java.util.*;
public class S4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s="", k="", str=sc.nextLine();
        str=str+" ";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if (s.length()>=k.length()){
                    k=s;
                }
                s="";
            }
            else{
                s=s+str.charAt(i);
            }
        }
        System.out.println("the longest word in the sentence is..."+k+" and it contains "+k.length()+" no of letters");
    }
}
