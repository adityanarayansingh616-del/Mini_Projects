// Counts capital letters, small letters, digits, spaces, and special characters in a sentence.
import java.util.*;
public class character_types
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cl=0,sl=0,d=0,ws=0,spc=0;
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
            if(Character.isUpperCase(ch))
            cl++;
            else if(Character.isLowerCase(ch))
            sl++;
            }
            else if(Character.isDigit(ch))
            d++;
            else if(Character.isWhitespace(ch))
            ws++;
            else
            spc++;
        }
        System.out.println("Capital letters- "+cl);
        System.out.println("Small letters- "+sl);
        System.out.println("Digits- "+d);
        System.out.println("Spaces- "+ws);
        System.out.println("Special characters- "+spc);
    }
}
