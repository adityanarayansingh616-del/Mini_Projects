import java.util.Scanner;
public class Special_String2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine().toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(i==0 || str.charAt(i-1)==' ')//Perfect method of referring to character after whitespace.
            System.out.print(Character.toUpperCase(ch));
            else
            System.out.print(ch);
        }
    }
}