// Prints the first letter of each word from the input string.
import java.util.*;
public class word_initials
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String newstr="";
        System.out.println("Enter a string:");
        String str=" "+sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isWhitespace(ch))
            newstr=newstr+str.charAt(i+1);
        }
        System.out.println(newstr);
    }
}