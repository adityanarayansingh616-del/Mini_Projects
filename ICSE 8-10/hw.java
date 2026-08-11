/*import java.util.*;
public class hw
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
}/*
/*import java.util.*;
public class hw
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
}*/
/*import java.util.*;
public class hw
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
}*/
/*import java.util.*;
public class hw
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
}*/
/*import java.util.*;
public class hw
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
}*/