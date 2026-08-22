// Counts letters in a string after skipping vowels and whitespace.
import java.util.*;
public class count_excluding_vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            char l=str.charAt(i);
            if(Character.isWhitespace(l))
            continue;
            if("AEIOU".indexOf(l)==-1)
            c++;
        }
        System.out.println("No.of letters excluding vowels = "+c);
    }
}
