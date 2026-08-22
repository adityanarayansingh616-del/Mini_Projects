// Removes vowels from an input string and prints the remaining characters.
import java.util.*;
public class remove_vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String newstr="";
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char l=str.charAt(i);
            if(l!='A'&&l!='a'&&l!='E'&&l!='e'&&l!='I'&&l!='i'&&l!='O'&&l!='o'&&l!='U'&&l!='u')
            newstr=newstr+l;
        }
        System.out.println(newstr);
    }
}
