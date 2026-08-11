/*import java.util.*;
public class Assign
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
import java.util.*;
public class Assign
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
import java.util.*;
public class Assign
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Press 1 to get a numeric pattern.");
    System.out.println("Press 2 to get an alpha-numeric pattern.");
    int ch=sc.nextInt();
    switch(ch)
    {
        case 1: for(int i=4;i>=1;i--)
                {
                    for(int j=1;j<=i;j++)
                    System.out.print(j);
                    System.out.println();
                }
                break;
        case 2: char k='A';
                for(int i=4;i>=1;i--)
                {
                    for(int j=i;j>=1;j--)
                    System.out.print(j);
                    System.out.println(k++);
                }
                break;
        default: System.out.println("Wrong input.");
    }
    }
}*/