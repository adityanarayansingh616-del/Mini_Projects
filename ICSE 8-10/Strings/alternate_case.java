// Prints letters in alternating upper and lower case; spaces stay unchanged.
import java.util.*;
public class alternate_case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String newstr="";int k=2;
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                if(k++%2==0)
                newstr=newstr+Character.toUpperCase(ch);
                else
                newstr=newstr+Character.toLowerCase(ch);
            }
            else
            newstr=newstr+ch;
            }System.out.println(newstr);
        }
    }
}
