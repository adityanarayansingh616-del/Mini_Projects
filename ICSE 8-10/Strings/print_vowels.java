// Prints every vowel present in the entered sentence.
import java.util.*;
public class print_vowels
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println(ch);
        }
    }
}
