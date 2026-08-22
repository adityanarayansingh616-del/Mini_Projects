// Makes the first letter of each word capital and the remaining letters lowercase.
import java.util.*;
public class word_capital
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
            {
            if(i==0)
            newstr=newstr+str.charAt(i+1);
            else
            newstr=newstr+" "+str.charAt(i+1);
            i++;
            }
            else
            newstr=newstr+Character.toLowerCase(ch);
        }
        System.out.println(newstr);
    }
}
